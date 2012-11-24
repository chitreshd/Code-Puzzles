package com.puzzles.ds;

public class Node {

	public enum State {
		Unvisited, Visited, Visiting;
	}

	private Node adjacent[];
	public int adjacentCount;
	private String vertex;
	public State state;

	public Node(String vertex, int adjacentLength) {
		this.vertex = vertex;
		adjacentCount = 0;
		adjacent = new Node[adjacentLength];
	}

	public void addAdjacent(Node x) {
		if (adjacentCount < 30) {
			this.adjacent[adjacentCount] = x;
			adjacentCount++;
		} else {
			System.out.print("No more adjacent can be added");
		}
	}

	public Node[] getAdjacent() {
		return adjacent;
	}

	public String getVertex() {
		return vertex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vertex == null) ? 0 : vertex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (vertex == null) {
			if (other.vertex != null)
				return false;
		} else if (!vertex.equals(other.vertex))
			return false;
		return true;
	}
	
	
}
