package com.puzzles.linkedlists;

import java.util.HashMap;
import java.util.Map;

/**
 * Removes duplicate from a given linked list
 * 
 * @author Chitresh
 * 
 */
public class DuplicateRemover
{
    public static void removeDuplicates(Node head)
    {
        if (head == null)
        {
            return;
        }

        Map<Integer, Boolean> dataOccurrenceMap = new HashMap<Integer, Boolean>();
        Node current = head;

        while (current.next() != null)
        {
            if (dataOccurrenceMap.containsKey(current.next().data()))
            {
                current.setNext(current.next().next());
            } else
            {
                dataOccurrenceMap.put(current.next().data(), true);
            }
            
            current = current.next();
            if (current == null)
            	break;
        }
    }

}
