/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.egt.Edge#getParentVertex <em>Parent Vertex</em>}</li>
 *   <li>{@link pl.zgora.uz.egt.Edge#getWeight <em>Weight</em>}</li>
 *   <li>{@link pl.zgora.uz.egt.Edge#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.egt.EgtPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Vertex</em>' reference.
	 * @see #setParentVertex(Vertex)
	 * @see pl.zgora.uz.egt.EgtPackage#getEdge_ParentVertex()
	 * @model
	 * @generated
	 */
	Vertex getParentVertex();

	/**
	 * Sets the value of the '{@link pl.zgora.uz.egt.Edge#getParentVertex <em>Parent Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Vertex</em>' reference.
	 * @see #getParentVertex()
	 * @generated
	 */
	void setParentVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see pl.zgora.uz.egt.EgtPackage#getEdge_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link pl.zgora.uz.egt.Edge#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.zgora.uz.egt.Colors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see pl.zgora.uz.egt.Colors
	 * @see #setColor(Colors)
	 * @see pl.zgora.uz.egt.EgtPackage#getEdge_Color()
	 * @model
	 * @generated
	 */
	Colors getColor();

	/**
	 * Sets the value of the '{@link pl.zgora.uz.egt.Edge#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see pl.zgora.uz.egt.Colors
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Colors value);

} // Edge
