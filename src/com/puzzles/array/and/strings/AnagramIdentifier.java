package com.puzzles.array.and.strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramIdentifier 
{
	
	public static boolean isAnagram(String subject, String otherString)
	{
		if(subject == null || otherString == null)
			throw new IllegalArgumentException();
		
		if(subject.replaceAll("\\s","").length() != otherString.replaceAll("\\s","").length())
			return false;
		
		Map<Character, Integer> charOccurMap = getCharOccurrenceMap(subject.replaceAll("\\s",""));
		
		char [] otherStringChars = otherString.replaceAll("\\s","").toCharArray();
		
		for(Character c : otherStringChars)
		{
			if(!charOccurMap.containsKey(c))
			{
				return false;
			}
			
			Integer occurrences = charOccurMap.get(c);
			if(occurrences <= 0)
			{
				return false;
			}
			
			charOccurMap.put(c, --occurrences);
		}
		return true;
	}

	private static Map<Character, Integer> getCharOccurrenceMap(String subject) 
	{
		
		Map<Character, Integer> occurMap = new HashMap<Character, Integer>();
		char [] chars = subject.toCharArray();
		for(char c : chars)
		{
			if(!occurMap.containsKey(c))
			{
				occurMap.put(c, 1);
			} else
			{
				int occurrences = occurMap.get(c);
				occurMap.put(c, ++occurrences);
			}			
		}
		
		return occurMap;
	}

}
