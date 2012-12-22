package pl.zgora.uz.egt.core.graph;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.viewers.IGraphContentProvider;

import pl.zgora.uz.egt.Edge;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.Vertex;

public class GraphContentProvider implements IGraphContentProvider {

	public Object getSource(Object rel) {
		return ((Edge) rel).eContainer();
	}

	public Object[] getElements(Object input) {
		if (input instanceof GraphModel) {
			ArrayList<Edge> edges = new ArrayList<Edge>();
			GraphModel model = ((GraphModel) input);
			EList<Vertex> vertexes = model.getVertexes();
			for (Vertex v : vertexes) {
				edges.addAll(v.getEdges());
			}
			return edges.toArray(new Edge[edges.size()]);

		}
		return new Object[0];
	}

	public Object getDestination(Object rel) {
		return ((Edge) rel).getParentVertex();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}