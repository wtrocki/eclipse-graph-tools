/**
 * Autor: Wojciech Trocki (wtrocki@gmail.com)
 * Licensed under EPL License.
 */
package pl.zgora.uz.egt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.egt.EgtFactory
 * @model kind="package"
 * @generated
 */
public interface EgtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "egt"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pl/zgora/uz/egt.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pl.zgora.uz.egt"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EgtPackage eINSTANCE = pl.zgora.uz.egt.impl.EgtPackageImpl.init();

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.VertexImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__EDGES = 3;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.ColorRegistryImpl <em>Color Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.ColorRegistryImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getColorRegistry()
	 * @generated
	 */
	int COLOR_REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>Images</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_REGISTRY__IMAGES = 0;

	/**
	 * The number of structural features of the '<em>Color Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_REGISTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.EdgeImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Parent Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PARENT_VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.DiEdgeImpl <em>Di Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.DiEdgeImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getDiEdge()
	 * @generated
	 */
	int DI_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Parent Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_EDGE__PARENT_VERTEX = EDGE__PARENT_VERTEX;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_EDGE__WEIGHT = EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_EDGE__COLOR = EDGE__COLOR;

	/**
	 * The number of structural features of the '<em>Di Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.GraphModelImpl <em>Graph Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.GraphModelImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getGraphModel()
	 * @generated
	 */
	int GRAPH_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Vertexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__VERTEXES = 0;

	/**
	 * The feature id for the '<em><b>Color Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__COLOR_REGISTRY = 1;

	/**
	 * The number of structural features of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.impl.SingleEdgeImpl <em>Single Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.impl.SingleEdgeImpl
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getSingleEdge()
	 * @generated
	 */
	int SINGLE_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Parent Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_EDGE__PARENT_VERTEX = EDGE__PARENT_VERTEX;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_EDGE__WEIGHT = EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_EDGE__COLOR = EDGE__COLOR;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_EDGE__CHILD = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pl.zgora.uz.egt.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.zgora.uz.egt.Colors
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 6;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Image
	 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see pl.zgora.uz.egt.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link pl.zgora.uz.egt.Vertex#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see pl.zgora.uz.egt.Vertex#getIndex()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Index();

	/**
	 * Returns the meta object for the attribute '{@link pl.zgora.uz.egt.Vertex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pl.zgora.uz.egt.Vertex#getName()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Name();

	/**
	 * Returns the meta object for the attribute '{@link pl.zgora.uz.egt.Vertex#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see pl.zgora.uz.egt.Vertex#getColor()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.zgora.uz.egt.Vertex#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see pl.zgora.uz.egt.Vertex#getEdges()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Edges();

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.ColorRegistry <em>Color Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Registry</em>'.
	 * @see pl.zgora.uz.egt.ColorRegistry
	 * @generated
	 */
	EClass getColorRegistry();

	/**
	 * Returns the meta object for the attribute list '{@link pl.zgora.uz.egt.ColorRegistry#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Images</em>'.
	 * @see pl.zgora.uz.egt.ColorRegistry#getImages()
	 * @see #getColorRegistry()
	 * @generated
	 */
	EAttribute getColorRegistry_Images();

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see pl.zgora.uz.egt.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link pl.zgora.uz.egt.Edge#getParentVertex <em>Parent Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Vertex</em>'.
	 * @see pl.zgora.uz.egt.Edge#getParentVertex()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ParentVertex();

	/**
	 * Returns the meta object for the attribute '{@link pl.zgora.uz.egt.Edge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see pl.zgora.uz.egt.Edge#getWeight()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Weight();

	/**
	 * Returns the meta object for the attribute '{@link pl.zgora.uz.egt.Edge#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see pl.zgora.uz.egt.Edge#getColor()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Color();

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.DiEdge <em>Di Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Di Edge</em>'.
	 * @see pl.zgora.uz.egt.DiEdge
	 * @generated
	 */
	EClass getDiEdge();

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.GraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Model</em>'.
	 * @see pl.zgora.uz.egt.GraphModel
	 * @generated
	 */
	EClass getGraphModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.zgora.uz.egt.GraphModel#getVertexes <em>Vertexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertexes</em>'.
	 * @see pl.zgora.uz.egt.GraphModel#getVertexes()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_Vertexes();

	/**
	 * Returns the meta object for the containment reference '{@link pl.zgora.uz.egt.GraphModel#getColorRegistry <em>Color Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Registry</em>'.
	 * @see pl.zgora.uz.egt.GraphModel#getColorRegistry()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ColorRegistry();

	/**
	 * Returns the meta object for class '{@link pl.zgora.uz.egt.SingleEdge <em>Single Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Edge</em>'.
	 * @see pl.zgora.uz.egt.SingleEdge
	 * @generated
	 */
	EClass getSingleEdge();

	/**
	 * Returns the meta object for the reference '{@link pl.zgora.uz.egt.SingleEdge#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see pl.zgora.uz.egt.SingleEdge#getChild()
	 * @see #getSingleEdge()
	 * @generated
	 */
	EReference getSingleEdge_Child();

	/**
	 * Returns the meta object for enum '{@link pl.zgora.uz.egt.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see pl.zgora.uz.egt.Colors
	 * @generated
	 */
	EEnum getColors();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see org.eclipse.swt.graphics.Image
	 * @model instanceClass="org.eclipse.swt.graphics.Image"
	 * @generated
	 */
	EDataType getImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EgtFactory getEgtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.VertexImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__INDEX = eINSTANCE.getVertex_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__NAME = eINSTANCE.getVertex_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__COLOR = eINSTANCE.getVertex_Color();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__EDGES = eINSTANCE.getVertex_Edges();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.ColorRegistryImpl <em>Color Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.ColorRegistryImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getColorRegistry()
		 * @generated
		 */
		EClass COLOR_REGISTRY = eINSTANCE.getColorRegistry();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_REGISTRY__IMAGES = eINSTANCE.getColorRegistry_Images();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.EdgeImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Parent Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PARENT_VERTEX = eINSTANCE.getEdge_ParentVertex();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__WEIGHT = eINSTANCE.getEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__COLOR = eINSTANCE.getEdge_Color();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.DiEdgeImpl <em>Di Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.DiEdgeImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getDiEdge()
		 * @generated
		 */
		EClass DI_EDGE = eINSTANCE.getDiEdge();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.GraphModelImpl <em>Graph Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.GraphModelImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getGraphModel()
		 * @generated
		 */
		EClass GRAPH_MODEL = eINSTANCE.getGraphModel();

		/**
		 * The meta object literal for the '<em><b>Vertexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__VERTEXES = eINSTANCE.getGraphModel_Vertexes();

		/**
		 * The meta object literal for the '<em><b>Color Registry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__COLOR_REGISTRY = eINSTANCE.getGraphModel_ColorRegistry();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.impl.SingleEdgeImpl <em>Single Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.impl.SingleEdgeImpl
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getSingleEdge()
		 * @generated
		 */
		EClass SINGLE_EDGE = eINSTANCE.getSingleEdge();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_EDGE__CHILD = eINSTANCE.getSingleEdge_Child();

		/**
		 * The meta object literal for the '{@link pl.zgora.uz.egt.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.zgora.uz.egt.Colors
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Image
		 * @see pl.zgora.uz.egt.impl.EgtPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

	}

} //EgtPackage
