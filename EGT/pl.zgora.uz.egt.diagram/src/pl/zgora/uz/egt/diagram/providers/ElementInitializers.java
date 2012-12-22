package pl.zgora.uz.egt.diagram.providers;

import pl.zgora.uz.egt.diagram.part.GraphDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GraphDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GraphDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
