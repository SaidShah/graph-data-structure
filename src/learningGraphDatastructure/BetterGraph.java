package learningGraphDatastructure;

public class BetterGraph{
	// graph using linked list

	Vertex[] arrayOfLists;
	int indexCounter = 0; 
	boolean undirected = true;
	
	class Node{
		public int vertexIndex;// Adjacent vertex slot position in the array
		public Node next;// the next instance of the node
		public Node(int vertexIndex,Node node) {
			this.vertexIndex = vertexIndex;
			next = node;			
		}
	}

	class Vertex{// inner class 
		String name;
		Node adjList;// a list of nodes 
		Vertex(String name, Node aNode){
			this.name = name;
			this.adjList=aNode;
		}
	}
	public BetterGraph(int vCount,String graphType) {
	if(graphType.equals("directed")) {
		undirected=false;
		}
	
	arrayOfLists = new Vertex[vCount];
	}
	
	public void addVertex(String vertexName) {// Instantiating a vertex with a name
		arrayOfLists[indexCounter] = new Vertex(vertexName,null);// adding a vertex and incrementing the counter for the array, adding the name but not 
		indexCounter++;											// assigning a node at the moment				
		
	}
	
	public void addEdge(String srcVertexName, String destVertexName) {
		int v1Idx = indexForName(srcVertexName);// finding the position for the source vertex using the indexforname method
		int v2Idx = indexForName(destVertexName);
		arrayOfLists[v1Idx].adjList = new Node(v2Idx,arrayOfLists[v1Idx].adjList);// assigning the next variable a new node based on the index
		if(undirected) {
			arrayOfLists[v2Idx].adjList = new Node(v1Idx,arrayOfLists[v2Idx].adjList);
		}
	}
	
	int indexForName(String name) {// looks through the array and finds the index position for the name 
		for(int v = 0;v<arrayOfLists.length;v++) {
			if(arrayOfLists[v].name.equals(name)) {
				return v;
			}
		}
		return -1;
	}
	
	public void print() {
		System.out.println();
		for(int v=0;v<arrayOfLists.length;v++) {
			System.out.print(arrayOfLists[v].name);
			for(Node aNode = arrayOfLists[v].adjList;aNode!=null;aNode = aNode.next) {
				System.out.print("--> "+arrayOfLists[aNode.vertexIndex].name);
				//System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
	
}






























