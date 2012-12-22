package pl.zgora.uz.egt.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import pl.zgora.uz.egt.EgtPackage;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.GraphModelEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GraphVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "pl.zgora.uz.egt.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GraphModelEditPart.MODEL_ID.equals(view.getType())) {
				return GraphModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GraphDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EgtPackage.eINSTANCE.getGraphModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((GraphModel) domainElement)) {
			return GraphModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry
				.getModelID(containerView);
		if (!GraphModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GraphModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GraphModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GraphModelEditPart.VISUAL_ID:
			if (EgtPackage.eINSTANCE.getVertex().isSuperTypeOf(
					domainElement.eClass())) {
				return VertexEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry
				.getModelID(containerView);
		if (!GraphModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GraphModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GraphModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GraphModelEditPart.VISUAL_ID:
			if (VertexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VertexEditPart.VISUAL_ID:
			if (VertexNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleEdgeEditPart.VISUAL_ID:
			if (SingleEdgeWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiEdgeEditPart.VISUAL_ID:
			if (DiEdgeWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EgtPackage.eINSTANCE.getSingleEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return SingleEdgeEditPart.VISUAL_ID;
		}
		if (EgtPackage.eINSTANCE.getDiEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return DiEdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(GraphModel element) {
		return true;
	}

}
