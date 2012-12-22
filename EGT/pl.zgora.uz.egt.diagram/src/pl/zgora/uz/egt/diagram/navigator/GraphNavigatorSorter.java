package pl.zgora.uz.egt.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pl.zgora.uz.egt.diagram.part.GraphVisualIDRegistry;

/**
 * @generated
 */
public class GraphNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GraphNavigatorItem) {
			GraphNavigatorItem item = (GraphNavigatorItem) element;
			return GraphVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
