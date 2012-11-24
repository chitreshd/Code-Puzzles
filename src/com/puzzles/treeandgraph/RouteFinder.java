package com.puzzles.treeandgraph;

import java.util.Stack;

import com.puzzles.ds.Graph;
import com.puzzles.ds.Node;

/**
 * @author Chitresh Deshpande
 *
 */
public class RouteFinder {
	
	/**
	 * @param from
	 * @param to
	 * @param graph
	 * @return
	 */
	public static boolean isExist(Node from,Node to,Graph graph)
	{
		Node vertices[] = graph.getNodes();
		Stack<Node> searchStack = new Stack<Node>();
		
		for(Node vertex: vertices)
		{
			if (vertex == from)
			{
				searchStack.push(vertex);
			}
		}
		
		while(!searchStack.isEmpty())
		{
			Node current = searchStack.pop();
			if(current == to)
			{
				return true;
			} 
			Node [] adjacentNodes = current.getAdjacent();
			for(Node node: adjacentNodes)
			{
				searchStack.push(node);
			}
		}
		return false;
	}

}
