package learningGraphDatastructure;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Graph myGraph = new Graph(5);
		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(0, 3);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 4);
		myGraph.addEdge(2, 3);
		myGraph.addEdge(3, 1);
		myGraph.addEdge(4, 0);
		myGraph.addEdge(4, 3);
		
		Object[] values = myGraph.showAdjacents(1);
		for(Object val: values) {
			System.out.println(val);
		}
		System.out.println();
		System.out.println(Arrays.toString(values));
		
		BetterGraph theGraph = new BetterGraph(5,"directed");
		theGraph.addVertex("State");
		theGraph.addVertex("Avenel");
		theGraph.addVertex("Elm");
		theGraph.addVertex("Pocono");
		theGraph.addVertex("William");
		
		theGraph.addEdge("Avenel", "Pocono");
		theGraph.addEdge("State", "Elm");
		theGraph.addEdge("Elm", "Avenel");
		theGraph.addEdge("Elm", "William");
		theGraph.addEdge("William", "State");
		theGraph.addEdge("William", "Pocono");
		theGraph.addEdge("Pocono", "Elm");
		theGraph.addEdge("State", "Avenel");
		
		theGraph.print();
		
	}

}














