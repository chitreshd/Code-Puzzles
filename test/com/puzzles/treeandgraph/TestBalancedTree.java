package com.puzzles.treeandgraph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.puzzles.ds.TreeNode;


public class TestBalancedTree 
{
	
	public TreeNode<?> createBalancedTree()
	{
		/*Tree structure with difference between min and max depth < 1*/ 
		/*A	
		B
			D
				H
				-
			E
				-
				I
		C
			F
			G*/
		
		TreeNode<Character> a = new TreeNode<Character>('A');
		TreeNode<Character> b = new TreeNode<Character>('B');
		TreeNode<Character> c = new TreeNode<Character>('C');
		TreeNode<Character> d = new TreeNode<Character>('D');
		TreeNode<Character> e = new TreeNode<Character>('E');
		TreeNode<Character> f = new TreeNode<Character>('F');
		TreeNode<Character> g = new TreeNode<Character>('G');
		TreeNode<Character> h = new TreeNode<Character>('H');
		TreeNode<Character> i = new TreeNode<Character>('I');
		
		a.setLeftChild(b);
		a.setRightChild(c);
		
		b.setLeftChild(d);
		b.setRightChild(e);
		
		c.setLeftChild(f);
		c.setRightChild(g);
		
		d.setLeftChild(h);
		
		e.setRightChild(i);
		
		return a;
		
	}
	
	public TreeNode<?> createUnBalancedTree()
	{
		/*Tree structure with difference between min and max depth < 1*/ 
		/*A	
		B
			D
				H
					E
						I
						-
					-
				-
		C
			F
			G*/
		
		TreeNode<Character> a = new TreeNode<Character>('A');
		TreeNode<Character> b = new TreeNode<Character>('B');
		TreeNode<Character> c = new TreeNode<Character>('C');
		TreeNode<Character> d = new TreeNode<Character>('D');
		TreeNode<Character> e = new TreeNode<Character>('E');
		TreeNode<Character> f = new TreeNode<Character>('F');
		TreeNode<Character> g = new TreeNode<Character>('G');
		TreeNode<Character> h = new TreeNode<Character>('H');
		TreeNode<Character> i = new TreeNode<Character>('I');
		
		a.setLeftChild(b);
		a.setRightChild(c);
		
		b.setLeftChild(d);
		d.setLeftChild(h);
		h.setLeftChild(e);
		e.setLeftChild(i);
		
		c.setLeftChild(f);
		c.setRightChild(g);
		
		return a;
		
	}
	
	
	@Test
	public void testIsBalanced()
	{
		assertTrue(BalancedTreeIdentifier.isBalancedTree(createBalancedTree()));
		assertFalse(BalancedTreeIdentifier.isBalancedTree(createUnBalancedTree()));
	}
	
	@Test (expected=Exception.class)
	public void testIsBalancedForBoundaryCnd()
	{
		BalancedTreeIdentifier.isBalancedTree(null);
	}

}
