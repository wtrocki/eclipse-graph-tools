package pl.zgora.uz.egt.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import pl.zgora.uz.egt.diagram.edit.policies.SingleEdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class SingleEdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public SingleEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SingleEdgeItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SingleEdgeWeightEditPart) {
			((SingleEdgeWeightEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSingleEdgeWeightFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SingleEdgeWeightEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new SingleEdgeFigure();
	}

	/**
	 * @generated
	 */
	public SingleEdgeFigure getPrimaryShape() {
		return (SingleEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SingleEdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSingleEdgeWeightFigure;

		/**
		 * @generated
		 */
		public SingleEdgeFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSingleEdgeWeightFigure = new WrappingLabel();
			fFigureSingleEdgeWeightFigure.setText("<...>");
			fFigureSingleEdgeWeightFigure.setLocation(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureSingleEdgeWeightFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSingleEdgeWeightFigure() {
			return fFigureSingleEdgeWeightFigure;
		}

	}

}
