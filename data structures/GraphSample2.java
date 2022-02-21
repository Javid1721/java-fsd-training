package javanewsample;

import java.util.ArrayList;

class Graph1
{
	ArrayList<ArrayList<Integer>> graph;
	int V;
	Graph1(int nodes)
	{
		V=nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	
	void addEgde(int v,int u)
	{
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	void printGraph()
	{
		for(int i=0;i<V;i++)
		{
			System.out.print("Node "+i);
			for(int x: graph.get(i))
			{
				System.out.print(" -> "+x);
			}
			System.out.println();
		}
		
	}
}

public class GraphSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph1 g = new Graph1(5);
		g.addEgde(0, 1);
		g.addEgde(0, 4);
		g.addEgde(1, 2);
		g.addEgde(1, 3);
		g.addEgde(1, 4);
		g.addEgde(2, 3);
		g.addEgde(2, 4);
		g.addEgde(3, 0);
		g.addEgde(2, 0);
		g.printGraph();
		
		
	}

}
