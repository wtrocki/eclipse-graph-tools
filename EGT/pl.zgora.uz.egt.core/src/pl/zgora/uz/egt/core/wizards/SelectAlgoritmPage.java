package pl.zgora.uz.egt.core.wizards;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

import pl.zgora.uz.egt.core.algoritm.ExtensionPointResolver;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class SelectAlgoritmPage extends WizardPage {

	private Group grpSelectAlgorithm;
	private ExtensionPointResolver resolver;
	private Combo algoritmCombo;

	private String selectedAlgorithmName;
	private Button btnTimeExecution;
	private Spinner spinner;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public SelectAlgoritmPage() {
		super("Select Algoritm");
		setTitle("Select algoritm for created graph");
		setDescription("This wizard creates a new algoritm visualization basing on created graph");
		resolver = new ExtensionPointResolver();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		initialize();
		dialogChanged();
		setControl(container);

		grpSelectAlgorithm = new Group(container, SWT.NONE);
		grpSelectAlgorithm.setLayout(new GridLayout(2, false));
		GridData gd_grpSelectAlgorithm = new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1);
		gd_grpSelectAlgorithm.widthHint = 492;
		grpSelectAlgorithm.setLayoutData(gd_grpSelectAlgorithm);
		grpSelectAlgorithm.setText("Select Algorithm");

		Label lblAlgoritmName = new Label(grpSelectAlgorithm, SWT.NONE);
		lblAlgoritmName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblAlgoritmName.setText("Name");

		algoritmCombo = new Combo(grpSelectAlgorithm, SWT.READ_ONLY);
		algoritmCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedAlgorithmName = algoritmCombo.getText();
			}

		});
		initCombo();
		algoritmCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Group grpSelectBehaviour = new Group(container, SWT.NONE);
		grpSelectBehaviour.setLayout(new GridLayout(3, false));
		GridData gd_grpSelectBehaviour = new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1);
		gd_grpSelectBehaviour.widthHint = 438;
		gd_grpSelectBehaviour.heightHint = 81;
		grpSelectBehaviour.setLayoutData(gd_grpSelectBehaviour);
		grpSelectBehaviour.setText("Behaviour");

		Button btnStepExecution = new Button(grpSelectBehaviour, SWT.RADIO);
		btnStepExecution.setSelection(true);
		btnStepExecution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		btnStepExecution.setText("Step execution using button");
		new Label(grpSelectBehaviour, SWT.NONE);
		new Label(grpSelectBehaviour, SWT.NONE);

		btnTimeExecution = new Button(grpSelectBehaviour, SWT.RADIO);
		btnTimeExecution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		btnTimeExecution.setText("Time execution. Execute new step after:");

		spinner = new Spinner(grpSelectBehaviour, SWT.BORDER);
		spinner.setSelection(12);
		GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false,
				1, 1);
		gd_spinner.widthHint = 32;
		spinner.setLayoutData(gd_spinner);

		Label lblMilis = new Label(grpSelectBehaviour, SWT.NONE);
		GridData gd_lblMilis = new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1);
		gd_lblMilis.widthHint = 75;
		lblMilis.setLayoutData(gd_lblMilis);
		lblMilis.setText("seconds/10");
	}

	private void initCombo() {
		ArrayList<String> names = resolver.getNames();
		for (String name : names) {
			algoritmCombo.add(name);
		}
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
	}

	/**
	 * Ensures that both selectedAlgorithmName fields are set.
	 */

	private void dialogChanged() {
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
	}

	public String getSelectedAlgorithmName() {
		return selectedAlgorithmName;
	}

	public boolean getBtnTimeExecution() {
		return btnTimeExecution.getSelection();
	}

	public String getTimeExecution() {
		return spinner.getText();
	}
}