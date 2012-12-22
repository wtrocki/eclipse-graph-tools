package pl.zgora.uz.egt.core.algoritm;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import pl.zgora.uz.egt.GraphModel;

// TODO constructor based on model
public class ExtensionPointResolver {

	// extension point ID
	public static final String ALGORITM_ID = "pl.zgora.uz.egt.core.algoritm";
	private static String nameExtension = "name";
	private static final String ALGORITHM_TYPE = "type";

	public static ArrayList<String> getNames() {
		ArrayList<String> attributes = new ArrayList<String>();
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ALGORITM_ID);
		for (IConfigurationElement e : config) {
			attributes.add(e.getAttribute(nameExtension));
		}
		return attributes;
	}

	public static void runAlgoritm(String name, final GraphModel graph,
			final GraphNotifier notifier) {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ALGORITM_ID);
		try {
			for (IConfigurationElement e : config) {
				String attribute = e.getAttribute(nameExtension);
				if (name.equals(attribute)) {
					final Object o = e.createExecutableExtension("class");
					if (o instanceof GraphAlgorithm) {
						ISafeRunnable runnable = new ISafeRunnable() {
							public void run() throws Exception {
								GraphAlgorithm graphAlgorithm = (GraphAlgorithm) o;
								graphAlgorithm.init(graph, notifier);
								graphAlgorithm.run();
							}

							public void handleException(Throwable exception) {
								handleError(exception);
							}
						};
						SafeRunner.run(runnable);
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static GraphAlgoritmType getType(String name) {
		// TODO Support for algoritm type used to create specific layout. (Tree
		// or some other elements.
		// See GraphAlgoritmType.
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ALGORITM_ID);
		for (IConfigurationElement e : config) {
			if (name.equals(e.getAttribute(nameExtension))) {
				if (e.getName().equals(ALGORITHM_TYPE)) {
					e.getChildren();
				}
			}
		}
		return null;

	}

	private static void handleError(final Throwable exception) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						"Error on client side", exception.getMessage());
				exception.printStackTrace();
			}
		});
	}
}
