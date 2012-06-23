package com.puzzles.array.and.strings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAnagramIdentifier 
{
	@Test
	public void testForAnagram()
	{
		assertTrue(AnagramIdentifier.isAnagram("carthorse", "orchestra"));
		assertTrue(AnagramIdentifier.isAnagram(" Occasional nude income", "One cool dance musician"));
		
	}

}
