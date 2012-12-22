package pl.zgora.uz.egt.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import pl.zgora.uz.egt.DiEdge;
import pl.zgora.uz.egt.EgtPackage;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.SingleEdge;
import pl.zgora.uz.egt.Vertex;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.GraphModelEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexEditPart;
import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;

/**
 * @generated
 */
public class GraphDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GraphNodeDescriptor> getSemanticChildren(View view) {
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case GraphModelEditPart.VISUAL_ID:
			return getGraphModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphNodeDescriptor> getGraphModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GraphModel modelElement = (GraphModel) view.getElement();
		LinkedList<GraphNodeDescriptor> result = new LinkedList<GraphNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVertexes().iterator(); it
				.hasNext();) {
			Vertex childElement = (Vertex) it.next();
			int visualID = GraphVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VertexEditPart.VISUAL_ID) {
				result.add(new GraphNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getContainedLinks(View view) {
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case GraphModelEditPart.VISUAL_ID:
			return getGraphModel_1000ContainedLinks(view);
		case VertexEditPart.VISUAL_ID:
			return getVertex_2001ContainedLinks(view);
		case SingleEdgeEditPart.VISUAL_ID:
			return getSingleEdge_4001ContainedLinks(view);
		case DiEdgeEditPart.VISUAL_ID:
			return getDiEdge_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getIncomingLinks(View view) {
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case VertexEditPart.VISUAL_ID:
			return getVertex_2001IncomingLinks(view);
		case SingleEdgeEditPart.VISUAL_ID:
			return getSingleEdge_4001IncomingLinks(view);
		case DiEdgeEditPart.VISUAL_ID:
			return getDiEdge_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getOutgoingLinks(View view) {
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case VertexEditPart.VISUAL_ID:
			return getVertex_2001OutgoingLinks(view);
		case SingleEdgeEditPart.VISUAL_ID:
			return getSingleEdge_4001OutgoingLinks(view);
		case DiEdgeEditPart.VISUAL_ID:
			return getDiEdge_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getGraphModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getVertex_2001ContainedLinks(
			View view) {
		Vertex modelElement = (Vertex) view.getElement();
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleEdge_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DiEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getSingleEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getDiEdge_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getVertex_2001IncomingLinks(
			View view) {
		Vertex modelElement = (Vertex) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SingleEdge_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DiEdge_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getSingleEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getDiEdge_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getVertex_2001OutgoingLinks(
			View view) {
		Vertex modelElement = (Vertex) view.getElement();
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleEdge_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DiEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getSingleEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphLinkDescriptor> getDiEdge_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GraphLinkDescriptor> getContainedTypeModelFacetLinks_SingleEdge_4001(
			Vertex container) {
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SingleEdge) {
				continue;
			}
			SingleEdge link = (SingleEdge) linkObject;
			if (SingleEdgeEditPart.VISUAL_ID != GraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Vertex dst = link.getParentVertex();
			result.add(new GraphLinkDescriptor(container, dst, link,
					GraphElementTypes.SingleEdge_4001,
					SingleEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphLinkDescriptor> getContainedTypeModelFacetLinks_DiEdge_4002(
			Vertex container) {
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DiEdge) {
				continue;
			}
			DiEdge link = (DiEdge) linkObject;
			if (DiEdgeEditPart.VISUAL_ID != GraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Vertex dst = link.getParentVertex();
			result.add(new GraphLinkDescriptor(container, dst, link,
					GraphElementTypes.DiEdge_4002, DiEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphLinkDescriptor> getIncomingTypeModelFacetLinks_SingleEdge_4001(
			Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EgtPackage.eINSTANCE
					.getEdge_ParentVertex()
					|| false == setting.getEObject() instanceof SingleEdge) {
				continue;
			}
			SingleEdge link = (SingleEdge) setting.getEObject();
			if (SingleEdgeEditPart.VISUAL_ID != GraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Vertex) {
				continue;
			}
			Vertex container = (Vertex) link.eContainer();
			result.add(new GraphLinkDescriptor(container, target, link,
					GraphElementTypes.SingleEdge_4001,
					SingleEdgeEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphLinkDescriptor> getIncomingTypeModelFacetLinks_DiEdge_4002(
			Vertex target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphLinkDescriptor> result = new LinkedList<GraphLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EgtPackage.eINSTANCE
					.getEdge_ParentVertex()
					|| false == setting.getEObject() instanceof DiEdge) {
				continue;
			}
			DiEdge link = (DiEdge) setting.getEObject();
			if (DiEdgeEditPart.VISUAL_ID != GraphVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Vertex) {
				continue;
			}
			Vertex container = (Vertex) link.eContainer();
			result.add(new GraphLinkDescriptor(container, target, link,
					GraphElementTypes.DiEdge_4002, DiEdgeEditPart.VISUAL_ID));

		}
		return result;
	}

}
