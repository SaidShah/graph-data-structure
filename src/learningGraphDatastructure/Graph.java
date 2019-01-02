package learningGraphDatastructure;

import java.util.ArrayList;

public class Graph {

	private int vCount; // number of vertices
	private int eCount;// number of edges
	
	private ArrayList[] adjacents;// array of integer lists, each slot in the array is going to contain an array list
	
	public Graph(int vCount){
		
		this.vCount=vCount;
		this.eCount = 0;
		adjacents = new ArrayList[vCount];
		
		for(int i =0;i<vCount;i++) {
			adjacents[i]= new ArrayList<Integer>();
		}
		
	}
	
	public int getVertexCount() {
		return vCount;
	}
	
	public int getEdgeCount() {
		return eCount;
	}
	
	public void addEdge(int source, int destination) {
		adjacents[source].add(destination);
		eCount++;
	}
	
	public Object[] showAdjacents(int source) {
		return adjacents[source].toArray();
	}
	
	
}














