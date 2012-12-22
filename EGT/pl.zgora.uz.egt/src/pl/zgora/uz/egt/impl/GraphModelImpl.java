/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.zgora.uz.egt.ColorRegistry;
import pl.zgora.uz.egt.EgtPackage;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.Vertex;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Graph Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.egt.impl.GraphModelImpl#getVertexes <em>Vertexes</em>}</li>
 *   <li>{@link pl.zgora.uz.egt.impl.GraphModelImpl#getColorRegistry <em>Color Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphModelImpl extends EObjectImpl implements GraphModel {
	/**
	 * The cached value of the '{@link #getVertexes() <em>Vertexes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVertexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertexes;

	/**
	 * The cached value of the '{@link #getColorRegistry() <em>Color Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorRegistry()
	 * @generated
	 * @ordered
	 */
	protected ColorRegistry colorRegistry;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected GraphModelImpl() {
		super();
		colorRegistry = EgtFactoryImpl.eINSTANCE.createColorRegistry();
		colorRegistry.init();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgtPackage.Literals.GRAPH_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertexes() {
		if (vertexes == null) {
			vertexes = new EObjectContainmentEList<Vertex>(Vertex.class, this, EgtPackage.GRAPH_MODEL__VERTEXES);
		}
		return vertexes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRegistry getColorRegistry() {
		return colorRegistry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorRegistry(
			ColorRegistry newColorRegistry, NotificationChain msgs) {
		ColorRegistry oldColorRegistry = colorRegistry;
		colorRegistry = newColorRegistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgtPackage.GRAPH_MODEL__COLOR_REGISTRY, oldColorRegistry, newColorRegistry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorRegistry(ColorRegistry newColorRegistry) {
		if (newColorRegistry != colorRegistry) {
			NotificationChain msgs = null;
			if (colorRegistry != null)
				msgs = ((InternalEObject)colorRegistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgtPackage.GRAPH_MODEL__COLOR_REGISTRY, null, msgs);
			if (newColorRegistry != null)
				msgs = ((InternalEObject)newColorRegistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgtPackage.GRAPH_MODEL__COLOR_REGISTRY, null, msgs);
			msgs = basicSetColorRegistry(newColorRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgtPackage.GRAPH_MODEL__COLOR_REGISTRY, newColorRegistry, newColorRegistry));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgtPackage.GRAPH_MODEL__VERTEXES:
				return ((InternalEList<?>)getVertexes()).basicRemove(otherEnd, msgs);
			case EgtPackage.GRAPH_MODEL__COLOR_REGISTRY:
				return basicSetColorRegistry(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgtPackage.GRAPH_MODEL__VERTEXES:
				return getVertexes();
			case EgtPackage.GRAPH_MODEL__COLOR_REGISTRY:
				return getColorRegistry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EgtPackage.GRAPH_MODEL__VERTEXES:
				getVertexes().clear();
				getVertexes().addAll((Collection<? extends Vertex>)newValue);
				return;
			case EgtPackage.GRAPH_MODEL__COLOR_REGISTRY:
				setColorRegistry((ColorRegistry)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EgtPackage.GRAPH_MODEL__VERTEXES:
				getVertexes().clear();
				return;
			case EgtPackage.GRAPH_MODEL__COLOR_REGISTRY:
				setColorRegistry((ColorRegistry)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EgtPackage.GRAPH_MODEL__VERTEXES:
				return vertexes != null && !vertexes.isEmpty();
			case EgtPackage.GRAPH_MODEL__COLOR_REGISTRY:
				return colorRegistry != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected void finalize() throws Throwable {
		colorRegistry.dispose();
		super.finalize();
	}

} // GraphModelImpl
