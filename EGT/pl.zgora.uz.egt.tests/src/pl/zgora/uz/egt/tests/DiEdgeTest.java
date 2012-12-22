/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.tests;

import junit.textui.TestRunner;

import pl.zgora.uz.egt.DiEdge;
import pl.zgora.uz.egt.EgtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Di Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiEdgeTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiEdgeTest.class);
	}

	/**
	 * Constructs a new Di Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Di Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiEdge getFixture() {
		return (DiEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EgtFactory.eINSTANCE.createDiEdge());
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

} //DiEdgeTest
