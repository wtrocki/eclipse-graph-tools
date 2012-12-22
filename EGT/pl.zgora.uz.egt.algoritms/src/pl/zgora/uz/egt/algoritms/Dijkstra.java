package pl.zgora.uz.egt.algoritms;

import org.eclipse.emf.common.util.EList;

import pl.zgora.uz.egt.Colors;
import pl.zgora.uz.egt.Edge;
import pl.zgora.uz.egt.GraphModel;
import pl.zgora.uz.egt.Vertex;
import pl.zgora.uz.egt.core.algoritm.GraphAlgorithm;
import pl.zgora.uz.egt.core.algoritm.GraphNotifier;

public class Dijkstra implements GraphAlgorithm {

	// lista najkrotszych sciezek do grafu oznaczanego indeksem tablicy.
	private static int[] dists;
	// lista poprzedników.
	private static int[] preds;
	// lista odwiedzonych wierzcholkow
	private static boolean[] visited;

	private static EList<Vertex> vertex;
	private GraphModel model;
	private GraphNotifier notifier;

	public void dijkstra() {
		// First
		Vertex s = model.getVertexes().get(0);
		vertex = model.getVertexes();
		if (vertex == null) {
			Messages.openMessage("No vertexes in current graph");
		}

		int sizeIndex = vertex.size();
		dists = new int[sizeIndex];
		preds = new int[sizeIndex];
		visited = new boolean[sizeIndex];

		// Zerowanie drogi.
		for (int i = 0; i < sizeIndex; i++) {
			dists[i] = Integer.MAX_VALUE;
		}

		dists[s.getIndex()] = 0;
		for (int i = 0; i < dists.length; i++) {
			final int next = minVertex();
			visited[next] = true;

			// Relaksacja.
			// Najkrótsza œcie¿ka do nastêpnego elementu poprzez pred.
			final EList<Edge> n = vertex.get(next).getEdges();
			for (int j = 0; j < n.size(); j++) {
				final int v = n.get(j).getParentVertex().getIndex();
				final int d = dists[next] + getWeight(next, v);
				if (dists[v] > d) {
					dists[v] = d;
					preds[v] = next;
				}
			}
		}
	}

	private void prepareAlgoritm() {
		EList<Vertex> vertexes = model.getVertexes();
		for (int i = 0; i < vertexes.size(); i++) {
			vertexes.get(i).setColor(Colors.CLEAN);
		}
	}

	private int getWeight(final int next, final int v) {
		EList<Edge> edges = model.getVertexes().get(next).getEdges();
		for (Edge e : edges) {
			if (e.getParentVertex().getIndex() == v) {
				return (int) e.getWeight();
			}
		}
		return 0;
	}

	// Wybiera wierzcho³ek najbli¿szy Ÿród³a, który nie zosta³ jeszcze rozwa¿ony
	private int minVertex() {
		int x = Integer.MAX_VALUE;
		// ustawiam y na taka wartosc by rozpoznac gdy nie ma po³¹czenia lub
		// brak nieodwiedzonych wierzcholkow.
		int y = -1;
		for (int i = 0; i < dists.length; i++) {
			if (!visited[i] && (dists[i] < x)) {
				y = i;
				x = dists[i];
			}
		}
		return y;
	}

	public void calculatePath(int start, int end) {
		while (end != start) {
			model.getVertexes().get(end).setColor(Colors.PERFORMED);
			end = preds[end];
			notifier.notifyInputChanged(model);
		}
		model.getVertexes().get(start).setColor(Colors.PERFORMED);
		notifier.notifyInputChanged(model);
		prepareAlgoritm();
		notifier.notifyInputChanged(model);
	}

	public void generateForAllVertex() {
		for (int n = 1; n < model.getVertexes().size(); n++) {
			calculatePath(0, n);
		}
	}

	public void init(GraphModel g, GraphNotifier notifier) {
		this.model = g;
		this.notifier = notifier;
	}

	public boolean run() {
		prepareAlgoritm();
		dijkstra();
		generateForAllVertex();
		return true;
	}

}
