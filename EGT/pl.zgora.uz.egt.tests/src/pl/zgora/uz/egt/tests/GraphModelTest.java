/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pl.zgora.uz.egt.EgtFactory;
import pl.zgora.uz.egt.GraphModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphModelTest extends TestCase {

	/**
	 * The fixture for this Graph Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphModelTest.class);
	}

	/**
	 * Constructs a new Graph Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Graph Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GraphModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Graph Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EgtFactory.eINSTANCE.createGraphModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GraphModelTest
