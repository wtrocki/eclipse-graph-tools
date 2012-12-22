package pl.zgora.uz.egt.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import pl.zgora.uz.egt.diagram.edit.commands.DiEdgeCreateCommand;
import pl.zgora.uz.egt.diagram.edit.commands.DiEdgeReorientCommand;
import pl.zgora.uz.egt.diagram.edit.commands.SingleEdgeCreateCommand;
import pl.zgora.uz.egt.diagram.edit.commands.SingleEdgeReorientCommand;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeEditPart;
import pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry;
import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;

/**
 * @generated
 */
public class VertexItemSemanticEditPolicy extends
		GraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VertexItemSemanticEditPolicy() {
		super(GraphElementTypes.Vertex_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GraphVisualIDRegistry.getVisualID(incomingLink) == SingleEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GraphVisualIDRegistry.getVisualID(incomingLink) == DiEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GraphVisualIDRegistry.getVisualID(outgoingLink) == SingleEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GraphVisualIDRegistry.getVisualID(outgoingLink) == DiEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GraphElementTypes.SingleEdge_4001 == req.getElementType()) {
			return getGEFWrapper(new SingleEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GraphElementTypes.DiEdge_4002 == req.getElementType()) {
			return getGEFWrapper(new DiEdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GraphElementTypes.SingleEdge_4001 == req.getElementType()) {
			return getGEFWrapper(new SingleEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GraphElementTypes.DiEdge_4002 == req.getElementType()) {
			return getGEFWrapper(new DiEdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SingleEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new SingleEdgeReorientCommand(req));
		case DiEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new DiEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
