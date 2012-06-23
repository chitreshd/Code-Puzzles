package com.puzzles.array.and.strings;

public class DuplicateRemover 
{
	public static char[] removeDuplicate(char [] input)
	{
		if(input == null)
			throw new IllegalArgumentException("Null value is not allowed");
		
		if(input.length < 2)
			return input;
		
		boolean hits[] = new boolean [256];
		int arrayLength = input.length;
		int tail = 0;
		
		for(int i = 0; i < arrayLength; i++)
		{
			char c = input[i];
			
			if(!hits[c])
			{
				input[tail] = input[i];
				tail++;
				hits[c] = true;
			}
			
			
		}
		
		if (!(tail >= arrayLength)) 
		{
			input[tail] = 0;
		}
		return input;
	}

}
