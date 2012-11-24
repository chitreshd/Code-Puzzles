package com.puzzles.treeandgraph;

import com.puzzles.ds.TreeNode;

public class TestUtilities 
{
	private static int currentData = 0;
	private static int currentDepth = 0;
	private static final int MAX_DEPTH = 3;
	
	public static TreeNode<Integer> buildTestTree()
	{
		TreeNode<Integer> head = new TreeNode<Integer>(++currentData);
		head.left = createTree();
		head.right = createTree();
		return head;
	}
	
	private static TreeNode<Integer> createTree()
	{
		currentDepth++;
		TreeNode<Integer> temp = new TreeNode<Integer>(++currentData);
		if(currentDepth < MAX_DEPTH)
		{
			temp.left = createTree();
			temp.right = createTree();
		}
		currentDepth--;
		return temp;
		
	}

}
