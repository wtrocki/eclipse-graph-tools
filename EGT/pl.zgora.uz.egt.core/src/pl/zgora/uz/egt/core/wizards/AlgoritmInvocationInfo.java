package pl.zgora.uz.egt.core.wizards;

import pl.zgora.uz.egt.GraphModel;

/**
 * Algoritm invocation info.
 * 
 * @author troken
 * 
 */
public class AlgoritmInvocationInfo {

	private int time;
	private InvocationType type;
	private String name;
	private GraphModel model;

	public enum InvocationType {
		step, timed
	}

	public AlgoritmInvocationInfo(String algoritmName, int time) {
		this.name = algoritmName;
		this.time = time;
		this.type = InvocationType.timed;
	}

	public AlgoritmInvocationInfo(String algoritmName) {
		this.name = algoritmName;
		this.type = InvocationType.step;
	}

	public AlgoritmInvocationInfo(String selectedAlgorithmName,
			GraphModel modelFromSelection) {
		this.model = modelFromSelection;
		this.name = selectedAlgorithmName;
		this.type = InvocationType.step;
	}

	public InvocationType getType() {
		return type;
	}

	public int getTime() {
		return time;
	}

	public String getName() {
		return name;
	}

	public GraphModel getModel() {
		return model;
	}

	public void buildInvocation() {

	}

	public void setTime(int time) {
		this.time = time;
	}
}
