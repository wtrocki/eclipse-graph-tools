package pl.zgora.uz.egt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;

/**
 * @generated
 */
public class DiEdgeItemSemanticEditPolicy extends
		GraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiEdgeItemSemanticEditPolicy() {
		super(GraphElementTypes.DiEdge_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
