package com.puzzles.treeandgraph;

import com.puzzles.ds.TreeNode;

public class BinTreeBuilder 
{
	
	public static <T> TreeNode<T> createTree(T[] array)
	{
		if (array == null)
			throw new IllegalArgumentException();
		
		return createTree(array, 0, array.length);		
	}
	
	private static <T> TreeNode<T> createTree(T[] array,int start,int end)
	{
		int len = end - start;
		if (len == 0)
			return null;
		
		int midIndex = len / 2 + start;
		
		TreeNode<T> current = new TreeNode<T>(array[midIndex]);
		
		if(len > 1)
		{
			current.left = createTree(array, start, midIndex);
			current.right = createTree(array, midIndex + 1, end);
		}
		
		return current;
	}

}
