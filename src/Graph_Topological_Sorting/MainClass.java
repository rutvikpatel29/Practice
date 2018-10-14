package Graph_Topological_Sorting;

public class MainClass {
	public static void main(String[] args) {
		Graph graph = new Graph(6);
		graph.addEdge(5, 2); 
		graph.addEdge(5, 0); 
		graph.addEdge(4, 0); 
	    graph.addEdge(4, 1); 
	    graph.addEdge(2, 3); 
	    graph.addEdge(3, 1); 
	    
	    graph.topologicalSort(); 
	}
}
