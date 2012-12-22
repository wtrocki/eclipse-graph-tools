package pl.zgora.uz.egt.core.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import pl.zgora.uz.egt.core.wizards.AlgoritmWizard;

public class ApplyAlgoritm implements IEditorActionDelegate {

	AlgoritmWizard wizard;
	private StructuredSelection selection;

	public ApplyAlgoritm() {
	}

	public void run(IAction action) {
		wizard = new AlgoritmWizard();
		IWorkbench workbench = PlatformUI.getWorkbench();
		wizard.init(workbench, selection);
		Shell shell = workbench.getActiveWorkbenchWindow().getShell();
		WizardDialog wd = new WizardDialog(shell, wizard);
		wd.setTitle("Select algoritm");
		wd.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			this.selection = (StructuredSelection) selection;
		}
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		// Empty implementation
	}

}
