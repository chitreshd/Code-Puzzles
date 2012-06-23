package com.puzzles.array.and.strings;

public class UniqueCharacterIdentifier 
{
	
	public static boolean hasUniqueChars(char [] input)
	{
		if(input == null)
			throw new IllegalArgumentException();
		
		if(input.length == 1)
			return true;
		
		boolean [] flags = new boolean[256];
		for(char c : input)
		{
			if(flags[c])
			{
				return false;
			}
			flags[c] = true;
		}
		
		return true;
	}

}
