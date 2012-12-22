package pl.zgora.uz.egt.algoritms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class Messages {

	public static void openMessage(String msg) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		MessageBox md = new MessageBox(shell, SWT.ICON_ERROR);
		md.setMessage(msg);
		md.open();
		return;

	}
}
