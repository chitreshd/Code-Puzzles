package com.puzzles.treeandgraph;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.puzzles.ds.TreeNode;

public class TestLinkedListFromTreeCreator {
	
	@Test
	public void testCreate()
	{
		TreeNode<Integer> testTreeHead = TestUtilities.buildTestTree();
		List<LinkedList<TreeNode<Integer>>> lists = LinkedListFromTreeCreator.create(testTreeHead);
		
		assertEquals(4,lists.size());
		for (LinkedList<TreeNode<Integer>> list : lists)
		{
			//TODO Not a good way to test, but its ok for now. Will come back to this later.
			System.out.println(list);
		}
		
	}
	
	

}
