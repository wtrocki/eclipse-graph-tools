package pl.zgora.uz.egt.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import pl.zgora.uz.egt.EgtPackage;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexNameEditPart;
import pl.zgora.uz.egt.diagram.parsers.MessageFormatParser;
import pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry;

/**
 * @generated
 */
public class GraphParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser vertexName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getVertexName_5001Parser() {
		if (vertexName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EgtPackage.eINSTANCE
					.getVertex_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			vertexName_5001Parser = parser;
		}
		return vertexName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleEdgeWeight_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSingleEdgeWeight_6001Parser() {
		if (singleEdgeWeight_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EgtPackage.eINSTANCE
					.getEdge_Weight() };
			MessageFormatParser parser = new MessageFormatParser(features);
			singleEdgeWeight_6001Parser = parser;
		}
		return singleEdgeWeight_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser diEdgeWeight_6002Parser;

	/**
	 * @generated
	 */
	private IParser getDiEdgeWeight_6002Parser() {
		if (diEdgeWeight_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { EgtPackage.eINSTANCE
					.getEdge_Weight() };
			MessageFormatParser parser = new MessageFormatParser(features);
			diEdgeWeight_6002Parser = parser;
		}
		return diEdgeWeight_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case VertexNameEditPart.VISUAL_ID:
			return getVertexName_5001Parser();
		case SingleEdgeWeightEditPart.VISUAL_ID:
			return getSingleEdgeWeight_6001Parser();
		case DiEdgeWeightEditPart.VISUAL_ID:
			return getDiEdgeWeight_6002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GraphVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GraphVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GraphElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
