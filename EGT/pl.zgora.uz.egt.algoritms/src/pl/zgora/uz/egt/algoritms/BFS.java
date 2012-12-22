package pl.zgora.uz.egt.algoritms;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import pl.zgora.uz.egt.Colors;
import pl.zgora.uz.egt.Edge;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.Vertex;
import pl.zgora.uz.egt.core.algoritm.GraphAlgorithm;
import pl.zgora.uz.egt.core.algoritm.GraphNotifier;

public class BFS implements GraphAlgorithm {

	private GraphModel model;
	private GraphNotifier notifier;
	private EList<Vertex> vertexes;
	protected int[] isVertexVisited;

	public BFS() {
	}

	public boolean run() {
		prepareAlgoritm();

		for (int i = 0; i < vertexes.size(); i++) {
			if (vertexes.get(i).getColor().equals(Colors.CLEAN)) {
				vertexes.get(i).setColor(Colors.PERFORMED);
				bfsRun(i);
			}
		}
		return true;
	}

	private void prepareAlgoritm() {
		vertexes = model.getVertexes();
		for (int i = 0; i < vertexes.size(); i++) {
			vertexes.get(i).setColor(Colors.CLEAN);
		}
		isVertexVisited = new int[vertexes.size()];
		for (int i = 0; i < vertexes.size(); i++) {
			isVertexVisited[i] = 0;
		}

	}

	private void bfsRun(int start) {
		LinkedList<Integer> quenue = new LinkedList<Integer>();
		isVertexVisited[start] = 1;
		quenue.push(start);
		preProcess(start);
		while (!quenue.isEmpty()) {
			int u;
			u = quenue.getFirst();
			quenue.pop();
			for (int i = 0; i < vertexes.size(); ++i) {
				EList<Edge> edges = vertexes.get(start).getEdges();
				for (Edge e : edges) {
					int index = e.getParentVertex().getIndex();
					if ((isVertexVisited[index] == 0)) {
						isVertexVisited[index] = 2;
						quenue.push(i);
						preProcess(u);
					}
				}
			}
		}
	}

	private void preProcess(int position) {
		Vertex vertex2 = vertexes.get(position);
		System.out.println("OdwiedŸ " + vertex2.getName());
		vertex2.setColor(Colors.PERFORMED);
		notifier.notifyInputChanged(model);
	}

	protected void postProcess(int x) {
		Vertex vertex2 = vertexes.get(x);
		System.out.println("Wróæ " + vertex2.getName());
		vertex2.setColor(Colors.TOUCHED);
		notifier.notifyInputChanged(model);
	}

	public void init(GraphModel model, GraphNotifier notifier) {
		this.model = model;
		this.notifier = notifier;

	}

}
