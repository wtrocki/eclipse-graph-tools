/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pl.zgora.uz.egt.EgtFactory;
import pl.zgora.uz.egt.Vertex;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VertexTest extends TestCase {

	/**
	 * The fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vertex fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VertexTest.class);
	}

	/**
	 * Constructs a new Vertex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vertex fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vertex getFixture() {
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
		setFixture(EgtFactory.eINSTANCE.createVertex());
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

} //VertexTest
