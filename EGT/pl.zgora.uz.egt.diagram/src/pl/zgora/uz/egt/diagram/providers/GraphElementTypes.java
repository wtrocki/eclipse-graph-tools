package pl.zgora.uz.egt.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import pl.zgora.uz.egt.EgtPackage;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.GraphModelEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexEditPart;
import pl.zgora.uz.egt.diagram.part.GraphDiagramEditorPlugin;

/**
 * @generated
 */
public class GraphElementTypes {

	/**
	 * @generated
	 */
	private GraphElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType GraphModel_1000 = getElementType("pl.zgora.uz.egt.diagram.GraphModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Vertex_2001 = getElementType("pl.zgora.uz.egt.diagram.Vertex_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleEdge_4001 = getElementType("pl.zgora.uz.egt.diagram.SingleEdge_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DiEdge_4002 = getElementType("pl.zgora.uz.egt.diagram.DiEdge_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GraphDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(GraphModel_1000, EgtPackage.eINSTANCE.getGraphModel());

			elements.put(Vertex_2001, EgtPackage.eINSTANCE.getVertex());

			elements.put(SingleEdge_4001, EgtPackage.eINSTANCE.getSingleEdge());

			elements.put(DiEdge_4002, EgtPackage.eINSTANCE.getDiEdge());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(GraphModel_1000);
			KNOWN_ELEMENT_TYPES.add(Vertex_2001);
			KNOWN_ELEMENT_TYPES.add(SingleEdge_4001);
			KNOWN_ELEMENT_TYPES.add(DiEdge_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GraphModelEditPart.VISUAL_ID:
			return GraphModel_1000;
		case VertexEditPart.VISUAL_ID:
			return Vertex_2001;
		case SingleEdgeEditPart.VISUAL_ID:
			return SingleEdge_4001;
		case DiEdgeEditPart.VISUAL_ID:
			return DiEdge_4002;
		}
		return null;
	}

}
