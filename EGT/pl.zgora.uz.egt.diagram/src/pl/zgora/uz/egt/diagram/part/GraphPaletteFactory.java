package pl.zgora.uz.egt.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pl.zgora.uz.egt.diagram.providers.GraphElementTypes;

/**
 * @generated
 */
public class GraphPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGraphToolbox1Group());
	}

	/**
	 * Creates "Graph Toolbox" palette tool group
	 * @generated
	 */
	private PaletteContainer createGraphToolbox1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.GraphToolbox1Group_title);
		paletteContainer.setId("createGraphToolbox1Group"); //$NON-NLS-1$
		paletteContainer.add(createVertex1CreationTool());
		paletteContainer.add(createDiEdge2CreationTool());
		paletteContainer.add(createEdge3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVertex1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Vertex1CreationTool_title,
				Messages.Vertex1CreationTool_desc,
				Collections.singletonList(GraphElementTypes.Vertex_2001));
		entry.setId("createVertex1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphElementTypes
				.getImageDescriptor(GraphElementTypes.Vertex_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiEdge2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DiEdge2CreationTool_title,
				Messages.DiEdge2CreationTool_desc,
				Collections.singletonList(GraphElementTypes.DiEdge_4002));
		entry.setId("createDiEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphElementTypes
				.getImageDescriptor(GraphElementTypes.DiEdge_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Edge3CreationTool_title,
				Messages.Edge3CreationTool_desc,
				Collections.singletonList(GraphElementTypes.SingleEdge_4001));
		entry.setId("createEdge3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphElementTypes
				.getImageDescriptor(GraphElementTypes.SingleEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
