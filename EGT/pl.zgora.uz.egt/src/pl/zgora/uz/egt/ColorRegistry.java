/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Color Registry</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link pl.zgora.uz.egt.ColorRegistry#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 * 
 * @see pl.zgora.uz.egt.EgtPackage#getColorRegistry()
 * @model
 * @generated
 */
public interface ColorRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Images</b></em>' attribute list. The
	 * list contents are of type {@link org.eclipse.swt.graphics.Image}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Images</em>' attribute list.
	 * @see pl.zgora.uz.egt.EgtPackage#getColorRegistry_Images()
	 * @model dataType="pl.zgora.uz.egt.Image" upper="5"
	 * @generated
	 */

	EList<Image> getImages();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model 
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// TODO'"
	 * @generated
	 */
	void dispose();

	public Color getActiveColor(Colors color);

	public Image getActiveImage(Colors color);

} // ColorRegistry
