/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.egt.GraphModel#getVertexes <em>Vertexes</em>}</li>
 *   <li>{@link pl.zgora.uz.egt.GraphModel#getColorRegistry <em>Color Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.egt.EgtPackage#getGraphModel()
 * @model
 * @generated
 */
public interface GraphModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertexes</b></em>' containment reference list.
	 * The list contents are of type {@link pl.zgora.uz.egt.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertexes</em>' containment reference list.
	 * @see pl.zgora.uz.egt.EgtPackage#getGraphModel_Vertexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertexes();

	/**
	 * Returns the value of the '<em><b>Color Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Registry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Registry</em>' containment reference.
	 * @see #setColorRegistry(ColorRegistry)
	 * @see pl.zgora.uz.egt.EgtPackage#getGraphModel_ColorRegistry()
	 * @model containment="true"
	 * @generated
	 */
	ColorRegistry getColorRegistry();

	/**
	 * Sets the value of the '{@link pl.zgora.uz.egt.GraphModel#getColorRegistry <em>Color Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Registry</em>' containment reference.
	 * @see #getColorRegistry()
	 * @generated
	 */
	void setColorRegistry(ColorRegistry value);

} // GraphModel
