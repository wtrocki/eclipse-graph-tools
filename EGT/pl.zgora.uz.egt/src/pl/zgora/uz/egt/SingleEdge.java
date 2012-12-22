/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.egt.SingleEdge#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.egt.EgtPackage#getSingleEdge()
 * @model
 * @generated
 */
public interface SingleEdge extends Edge {

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(SingleEdge)
	 * @see pl.zgora.uz.egt.EgtPackage#getSingleEdge_Child()
	 * @model
	 * @generated
	 */
	SingleEdge getChild();

	/**
	 * Sets the value of the '{@link pl.zgora.uz.egt.SingleEdge#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(SingleEdge value);
} // SingleEdge
