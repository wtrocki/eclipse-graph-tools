package pl.zgora.uz.egt.core.algoritm;

import pl.zgora.uz.egt.GraphModel;

public interface GraphAlgorithm {

	/**
	 * Perform initial tasks for graph. For example calculate adjacency list or
	 * remove unused data
	 */
	public void init(GraphModel g, GraphNotifier notifier);

	/**
	 * Main method for algoritm.
	 * 
	 * @retrun algoritm result
	 */
	public boolean run();

}
