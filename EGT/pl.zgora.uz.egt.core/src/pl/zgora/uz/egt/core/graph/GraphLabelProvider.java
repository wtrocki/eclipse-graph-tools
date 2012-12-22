package pl.zgora.uz.egt.core.graph;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import pl.zgora.uz.egt.Edge;
import pl.zgora.uz.egt.Vertex;
import pl.zgora.uz.egt.impl.ColorRegistryImpl;

public class GraphLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		if (element instanceof Vertex) {
			Vertex vertex = (Vertex) element;
			ColorRegistryImpl instance = ColorRegistryImpl.getINSTANCE();
			return instance.getActiveImage(vertex.getColor());
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Edge) {
			return "w " + ((Edge) element).getWeight();
		}
		if (element instanceof Vertex) {
			return ((Vertex) element).getName();
		}
		return element.toString();
	}

}