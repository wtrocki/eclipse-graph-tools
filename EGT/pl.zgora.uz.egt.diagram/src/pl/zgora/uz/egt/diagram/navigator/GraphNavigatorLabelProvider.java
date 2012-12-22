package pl.zgora.uz.egt.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import pl.zgora.uz.egt.DiEdge;
import pl.zgora.uz.egt.SingleEdge;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.DiEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.GraphModelEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.SingleEdgeWeightEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexEditPart;
import pl.zgora.uz.egt.diagram.edit.parts.VertexNameEditPart;
import pl.zgora.uz.egt.diagram.part.GraphDiagramEditorPlugin;
import pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry;
import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;
import pl.zgora.uz.egt.diagram.providers.GraphParserProvider;

/**
 * @generated
 */
public class GraphNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GraphDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GraphDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GraphNavigatorItem
				&& !isOwnView(((GraphNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GraphNavigatorGroup) {
			GraphNavigatorGroup group = (GraphNavigatorGroup) element;
			return GraphDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GraphNavigatorItem) {
			GraphNavigatorItem navigatorItem = (GraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case DiEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///pl/zgora/uz/egt.ecore?DiEdge", GraphElementTypes.DiEdge_4002); //$NON-NLS-1$
		case VertexEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///pl/zgora/uz/egt.ecore?Vertex", GraphElementTypes.Vertex_2001); //$NON-NLS-1$
		case GraphModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///pl/zgora/uz/egt.ecore?GraphModel", GraphElementTypes.GraphModel_1000); //$NON-NLS-1$
		case SingleEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///pl/zgora/uz/egt.ecore?SingleEdge", GraphElementTypes.SingleEdge_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GraphDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GraphElementTypes.isKnownElementType(elementType)) {
			image = GraphElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GraphNavigatorGroup) {
			GraphNavigatorGroup group = (GraphNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GraphNavigatorItem) {
			GraphNavigatorItem navigatorItem = (GraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GraphVisualIDRegistry.getVisualID(view)) {
		case DiEdgeEditPart.VISUAL_ID:
			return getDiEdge_4002Text(view);
		case VertexEditPart.VISUAL_ID:
			return getVertex_2001Text(view);
		case GraphModelEditPart.VISUAL_ID:
			return getGraphModel_1000Text(view);
		case SingleEdgeEditPart.VISUAL_ID:
			return getSingleEdge_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGraphModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSingleEdge_4001Text(View view) {
		IParser parser = GraphParserProvider.getParser(
				GraphElementTypes.SingleEdge_4001,
				view.getElement() != null ? view.getElement() : view,
				GraphVisualIDRegistry
						.getType(SingleEdgeWeightEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiEdge_4002Text(View view) {
		IParser parser = GraphParserProvider.getParser(
				GraphElementTypes.DiEdge_4002,
				view.getElement() != null ? view.getElement() : view,
				GraphVisualIDRegistry.getType(DiEdgeWeightEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVertex_2001Text(View view) {
		IParser parser = GraphParserProvider.getParser(
				GraphElementTypes.Vertex_2001,
				view.getElement() != null ? view.getElement() : view,
				GraphVisualIDRegistry.getType(VertexNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GraphModelEditPart.MODEL_ID.equals(GraphVisualIDRegistry
				.getModelID(view));
	}

}
