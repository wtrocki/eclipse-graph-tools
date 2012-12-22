/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.impl;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.ResourceManager;

import pl.zgora.uz.egt.ColorRegistry;
import pl.zgora.uz.egt.Colors;
import pl.zgora.uz.egt.EgtPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Color Registry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link pl.zgora.uz.egt.impl.ColorRegistryImpl#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ColorRegistryImpl extends EObjectImpl implements ColorRegistry {

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	// TODO UNUSED
	protected EList<Image> images;
	private HashMap<Colors, Image> activeImages;
	private HashMap<Colors, Color> activeColors;
	private static ColorRegistryImpl INSTANCE;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ColorRegistryImpl() {
		super();
		if (INSTANCE == null) {
			INSTANCE = this;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgtPackage.Literals.COLOR_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EDataTypeUniqueEList<Image>(Image.class, this,
					EgtPackage.COLOR_REGISTRY__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void init() {
		activeImages = new HashMap<Colors, Image>(4);
		Display disp = Display.getDefault();
		Image newElement = ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"/images/new.png");
		Image touched = ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"/images/touched.png");
		Image ready = ResourceManager.getPluginImage("pl.zgora.uz.egt",
				"/images/ready.png");

		Color white = disp.getSystemColor(SWT.COLOR_WHITE);
		Color gray = disp.getSystemColor(SWT.COLOR_GRAY);
		Color black = disp.getSystemColor(SWT.COLOR_DARK_GRAY);
		activeColors = new HashMap<Colors, Color>(4);
		activeColors.put(Colors.CLEAN, white);
		activeColors.put(Colors.PERFORMED, black);
		activeColors.put(Colors.TOUCHED, gray);

		activeImages.put(Colors.CLEAN, newElement);
		activeImages.put(Colors.TOUCHED, touched);
		activeImages.put(Colors.PERFORMED, ready);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void dispose() {
		for (Image c : activeImages.values()) {
			c.dispose();
		}
		for (Color c : activeColors.values()) {
			c.dispose();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EgtPackage.COLOR_REGISTRY__IMAGES:
			return getImages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EgtPackage.COLOR_REGISTRY__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EgtPackage.COLOR_REGISTRY__IMAGES:
			getImages().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EgtPackage.COLOR_REGISTRY__IMAGES:
			return (images != null) && !images.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (images: "); //$NON-NLS-1$
		result.append(images);
		result.append(')');
		return result.toString();
	}

	public Image getActiveImage(Colors color) {
		return activeImages.get(color);
	}

	public Color getActiveColor(Colors color) {
		return activeColors.get(color);
	}

	public static ColorRegistryImpl getINSTANCE() {
		return INSTANCE;
	}

} // ColorRegistryImpl
