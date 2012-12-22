package pl.zgora.uz.egt.core.wizards;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.core.graph.GraphDialog;
import pl.zgora.uz.egt.core.graph.InvocationControler;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "mpe". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public class AlgoritmWizard extends Wizard implements INewWizard {
	private SelectAlgoritmPage page;
	private ISelection selection;

	/**
	 * Constructor for AlgoritmWizard.
	 */
	public AlgoritmWizard() {
		super();
	}

	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {
		page = new SelectAlgoritmPage();
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		String selectedAlgorithmName = page.getSelectedAlgorithmName();
		if (selectedAlgorithmName != null) {
			GraphModel modelFromSelection = getModelFromSelection();
			AlgoritmInvocationInfo info = new AlgoritmInvocationInfo(
					selectedAlgorithmName, modelFromSelection);
			if (page.getBtnTimeExecution()) {
				info.setTime(Integer.valueOf(page.getTimeExecution()));
			} else {
				info.setTime(-1);
			}
			GraphDialog mainDialog = new GraphDialog(getShell());
			new InvocationControler(info, mainDialog).run();
		}
		return true;
	}

	private GraphModel getModelFromSelection() {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof GraphicalEditPart) {
				Object model = ((GraphicalEditPart) firstElement).getModel();
				if (model instanceof View) {
					EObject element = ((View) model).getElement();
					element = EcoreUtil.getRootContainer(element);
					return ((GraphModel) element);
				}
			}
		}
		return null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}