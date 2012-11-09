package com.puzzles.treeandgraph;

import com.puzzles.ds.TreeNode;

/**
 * @author Chitresh Deshpande
 *
 */
public class BalancedTreeIdentifier 
{
	
	private static int maxDepth = -1;
	private static int minDepth = -1;
	private static int currentDepth = -1;
			
	public static boolean isBalancedTree(TreeNode<?> head)
	{
		if (head == null)
			throw new IllegalArgumentException();
				
		traverseInOrder(head);
		if (maxDepth - minDepth > 1)
			return false;
		else
			return true;
	}
	
	private static void traverseInOrder(TreeNode<?> node)
	{
		if(node == null)
			return;
		
		currentDepth++;
		if(node.left == null && node.right == null)
		{
			/*This is a leaf node*/
			setMaxAndMin();
		}
		
		traverseInOrder(node.left);
		traverseInOrder(node.right);
		currentDepth--;
	}

	private static void setMaxAndMin() 
	{
		if(maxDepth == -1 && minDepth == -1)
		{
			maxDepth = minDepth = currentDepth;
		} else
		{
			if(currentDepth > maxDepth)
				maxDepth = currentDepth;
			
			if(currentDepth < minDepth)
				minDepth = currentDepth;
		}
	}
	

}
