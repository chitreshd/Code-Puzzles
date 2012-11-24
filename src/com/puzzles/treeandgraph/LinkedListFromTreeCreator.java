package com.puzzles.treeandgraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.puzzles.ds.TreeNode;

public class LinkedListFromTreeCreator {
	
	public static <T> List<LinkedList<TreeNode<T>>> create(TreeNode<T> head)
	{
		List<LinkedList<TreeNode<T>>> lists = new ArrayList<LinkedList<TreeNode<T>>>();
		LinkedList<TreeNode<T>> rootLevel = new LinkedList<TreeNode<T>>();
		rootLevel.add(head);
		lists.add(rootLevel);
		createNextLevelLinkedList(lists);
		return lists;
	}
	
	private static <T> void createNextLevelLinkedList(List<LinkedList<TreeNode<T>>> lists)
	{
		LinkedList<TreeNode<T>> nextLevelList = new LinkedList<TreeNode<T>>();
		LinkedList<TreeNode<T>> currentLevelList = lists.get(lists.size() - 1);
		
		for ( TreeNode<T> node : currentLevelList )
		{
			if(node.left != null)
				nextLevelList.add(node.left);
			
			if(node.right != null)
				nextLevelList.add(node.right);
			
		}
		
		if(nextLevelList.size() > 0)
		{
			lists.add(nextLevelList);
			createNextLevelLinkedList(lists);
		}
		
	}

}
