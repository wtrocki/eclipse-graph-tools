/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.tests;

import junit.textui.TestRunner;

import pl.zgora.uz.egt.EgtFactory;
import pl.zgora.uz.egt.SingleEdge;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleEdgeTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleEdgeTest.class);
	}

	/**
	 * Constructs a new Single Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleEdge getFixture() {
		return (SingleEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EgtFactory.eINSTANCE.createSingleEdge());
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

} //SingleEdgeTest
