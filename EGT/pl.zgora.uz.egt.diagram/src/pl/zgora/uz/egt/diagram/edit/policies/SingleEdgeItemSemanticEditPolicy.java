package pl.zgora.uz.egt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;

/**
 * @generated
 */
public class SingleEdgeItemSemanticEditPolicy extends
		GraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SingleEdgeItemSemanticEditPolicy() {
		super(GraphElementTypes.SingleEdge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
