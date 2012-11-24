package com.puzzles.treeandgraph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.puzzles.ds.Graph;
import com.puzzles.ds.Node;

public class TestRouteFinder {

	private Graph graph;

	/**
	 * Setup steps from CareerCup
	 */
	@Before
	public void setUp() {
		graph = new Graph();
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			graph.addNode(temp[i]);
		}

	}

	@Test
	public void testIsExist() {
		Node vertices[] = graph.getNodes();
		assertTrue(RouteFinder.isExist(vertices[0], vertices[5], graph));
		assertFalse(RouteFinder.isExist(vertices[5], vertices[0], graph));

	}

}
