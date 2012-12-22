package pl.zgora.uz.egt.core.graph;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;

import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.core.algoritm.ExtensionPointResolver;
import pl.zgora.uz.egt.core.wizards.AlgoritmInvocationInfo;

public class InvocationControler {

	private final AlgoritmInvocationInfo info;
	private final GraphDialog mainDialog;
	private GraphModel copy;

	public InvocationControler(AlgoritmInvocationInfo info,
			GraphDialog mainDialog) {
		this.info = info;
		this.mainDialog = mainDialog;
	}

	public void run() {
		mainDialog.setInvocationControler(this);
		copy = EcoreUtil.copy(info.getModel());
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				mainDialog.setModel(copy);
				mainDialog.open();
			}
		});

	}

	public void runAlgoritm() {
		ExtensionPointResolver.runAlgoritm(info.getName(), copy, mainDialog);
	}

	public int getInvocationTime() {
		return info.getTime();
	}
}
