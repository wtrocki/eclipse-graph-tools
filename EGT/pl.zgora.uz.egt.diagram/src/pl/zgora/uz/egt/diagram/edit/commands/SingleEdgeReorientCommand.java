package pl.zgora.uz.egt.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pl.zgora.uz.egt.SingleEdge;
import pl.zgora.uz.egt.Vertex;
import pl.zgora.uz.egt.diagram.edit.policies.GraphBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SingleEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public SingleEdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SingleEdge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Vertex && newEnd instanceof Vertex)) {
			return false;
		}
		Vertex target = getLink().getParentVertex();
		return GraphBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSingleEdge_4001(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Vertex && newEnd instanceof Vertex)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Vertex)) {
			return false;
		}
		Vertex source = (Vertex) getLink().eContainer();
		return GraphBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSingleEdge_4001(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getEdges().remove(getLink());
		getNewSource().getEdges().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setParentVertex(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected SingleEdge getLink() {
		return (SingleEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Vertex getOldSource() {
		return (Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getNewSource() {
		return (Vertex) newEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getOldTarget() {
		return (Vertex) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Vertex getNewTarget() {
		return (Vertex) newEnd;
	}
}
