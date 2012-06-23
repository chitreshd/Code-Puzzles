package com.puzzles.array.and.strings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDuplicateRemover
{
	@Test
	public void testForDuplicateRemoval()
	{
		String actualS = extractUnDuplicateChars(DuplicateRemover.removeDuplicate("abcabcbbca".toCharArray()));
		assertTrue("abc".equals(actualS));		
		
		actualS = extractUnDuplicateChars(DuplicateRemover.removeDuplicate("ab".toCharArray()));
		assertTrue("ab".equals(actualS));
		
		actualS = extractUnDuplicateChars(DuplicateRemover.removeDuplicate("ababab".toCharArray()));
		assertTrue("ab".equals(actualS));
		
		actualS = extractUnDuplicateChars(DuplicateRemover.removeDuplicate("a".toCharArray()));
		assertTrue("a".equals(actualS));
		
		actualS = extractUnDuplicateChars(DuplicateRemover.removeDuplicate("".toCharArray()));
		assertTrue("".equals(actualS));
	    
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testForNull()
	{
		DuplicateRemover.removeDuplicate(null);
	}
	
	private String extractUnDuplicateChars(char [] input)
	{
		StringBuffer buff = new StringBuffer();
		for(char c : input)
		{
			if(c == 0)
			{
				break;
			}
			buff.append(c);			
		}
		return buff.toString();
	}

}
