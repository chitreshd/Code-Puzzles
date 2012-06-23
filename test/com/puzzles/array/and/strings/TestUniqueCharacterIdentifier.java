package com.puzzles.array.and.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUniqueCharacterIdentifier
{
	
	@Test
	public void testForUniqueness()
	{
		assertTrue(UniqueCharacterIdentifier.hasUniqueChars("abc".toCharArray()));
		assertFalse(UniqueCharacterIdentifier.hasUniqueChars("abcc".toCharArray()));
		
	}
	
	 @Test(expected = IllegalArgumentException.class)
	 public void testForNullValue()
	{
		UniqueCharacterIdentifier.hasUniqueChars(null);
	}
	

}
