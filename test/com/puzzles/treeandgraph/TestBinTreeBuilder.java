package com.puzzles.treeandgraph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.puzzles.ds.TreeNode;

public class TestBinTreeBuilder {
	
	@Test
	public void testCreateTree()
	{
		Integer [] arr = {1,2,3,4,5,6,7,8,9};
		TreeNode<Integer> head = BinTreeBuilder.createTree(arr);
		assertEquals(head.data,arr[4]);
		assertEquals(head.left.data,arr[2]);
		
		assertEquals(head.left.left.data,arr[1]);
		assertEquals(head.left.right.data,arr[3]);
		
		assertEquals(head.left.left.left.data,arr[0]);
		
		assertEquals(head.right.data,arr[7]);
		
		assertEquals(head.right.left.data,arr[6]);
		assertEquals(head.right.right.data,arr[8]);
		
		assertEquals(head.right.left.left.data,arr[5]);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreateTreeForNull()
	{
		BinTreeBuilder.createTree(null);
	}
	
	@Test 
	public void testCreateTreeForOneElement()
	{
		Integer [] arr = {1};
		TreeNode<Integer> head = BinTreeBuilder.createTree(arr);
		assertEquals(head.data,arr[0]);
	}

}
