package pl.zgora.uz.egt.core.graph;

import java.util.LinkedList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.core.algoritm.GraphNotifier;
import pl.zgora.uz.egt.wb.swt.ResourceManager;

public class GraphDialog extends Dialog implements GraphNotifier {
	Composite main;
	GraphViewer algoritmGraph;
	private GraphModel model;
	LinkedList<GraphModel> models;
	private InvocationControler invocationControler;
	private int currentPosition = 0;

	public GraphDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.BORDER | SWT.CLOSE | SWT.MIN | SWT.RESIZE);
		models = new LinkedList<GraphModel>();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		main = new Composite(parent, SWT.NONE);
		GridLayout gl_main = new GridLayout(3, false);
		main.setLayout(gl_main);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite graphComposite = new Composite(main, SWT.NONE);
		graphComposite.setLayout(new GridLayout(1, false));
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		layoutData.heightHint = 430;
		layoutData.widthHint = 630;
		graphComposite.setLayoutData(layoutData);

		algoritmGraph = new GraphViewer(graphComposite, SWT.NONE);
		algoritmGraph.setControl(new Graph(graphComposite,
				ZestStyles.NODES_NO_LAYOUT_ANIMATION));
		Control control = algoritmGraph.getControl();
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		algoritmGraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algoritmGraph.setNodeStyle(ZestStyles.CONNECTIONS_DIRECTED
				| ZestStyles.NODES_NO_LAYOUT_ANIMATION);
		algoritmGraph.setContentProvider(new GraphContentProvider());
		algoritmGraph.setLabelProvider(new GraphLabelProvider());
		algoritmGraph.setInput(model);

		Label lblNewLabel = new Label(main, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 3, 1));

		Button btnStart = new Button(main, SWT.NONE);
		btnStart.setImage(ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"images/ready.png"));
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (invocationControler.getInvocationTime() == -1) {
					if ((currentPosition >= 0)
							&& (currentPosition < models.size())) {
						if (currentPosition != 0) {
							currentPosition = currentPosition - 1;
						}
						GraphModel model = models.get(currentPosition);
						if (model != null) {
							algoritmGraph.setInput(model);
						}
					}
				}
			}
		});
		GridData gd_btnStart = new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1);
		gd_btnStart.widthHint = 145;
		btnStart.setLayoutData(gd_btnStart);
		btnStart.setText("Previous Step");

		Button btnPause = new Button(main, SWT.NONE);
		btnPause.setImage(ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"images/touched.png"));
		btnPause.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final int invocationTime = invocationControler
						.getInvocationTime();
				if (invocationTime == -1) {
					if ((currentPosition >= 0)
							&& (currentPosition < models.size())) {
						if (currentPosition != models.size() - 1) {
							currentPosition = currentPosition + 1;
						}
						GraphModel model = models.get(currentPosition);
						if (model != null) {
							algoritmGraph.setInput(model);
						}
					}
				} else {
					MessageDialog.openInformation(getParentShell(), "Rerun",
							"Timed execution not implemented");
					if ((currentPosition >= 0)
							&& (currentPosition < models.size())) {
						if (currentPosition != models.size() - 1) {
							currentPosition = currentPosition + 1;
						}
						GraphModel model = models.get(currentPosition);
						if (model != null) {
							algoritmGraph.setInput(model);
						}
					}
				}
			}
		});
		GridData gd_btnPause = new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1);
		gd_btnPause.widthHint = 145;
		btnPause.setLayoutData(gd_btnPause);
		btnPause.setText("Start (Next Step)");

		Button btnStop = new Button(main, SWT.NONE);
		btnStop.setImage(ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"images/new.png"));
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				currentPosition = 0;
				algoritmGraph.setInput(null);
				// algoritmGraph.setInput(model);
			}
		});
		GridData gd_btnStop = new GridData(SWT.LEFT, SWT.FILL, false, false, 1,
				1);
		gd_btnStop.widthHint = 145;
		btnStop.setLayoutData(gd_btnStop);
		btnStop.setText("Reset");
		new Label(main, SWT.NONE);
		new Label(main, SWT.NONE);
		new Label(main, SWT.NONE);

		// Programer hell :) Better communication mechanism. See TODO below :)
		invocationControler.runAlgoritm();
		return main;
	}

	public void notifyInputChanged(Object input) {
		if (algoritmGraph != null) {
			// TODO HIGH Priority. Workaround for EMF bug. Lack of good
			// communication mechanism.
			GraphModel copy = EcoreUtil.copy((GraphModel) input);
			models.add(copy);
		}
	}

	public void setModel(GraphModel model) {
		this.model = model;
	}

	public void setInvocationControler(InvocationControler invocationControler) {
		this.invocationControler = invocationControler;
	}

}
