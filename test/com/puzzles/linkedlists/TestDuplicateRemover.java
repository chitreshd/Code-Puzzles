package com.puzzles.linkedlists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestDuplicateRemover
{
    @Test
    public void testForDuplicateRemoval()
    {
        Node head = LinkedListTestUtils.constructDummyLinkedListWithDuplicates();
        /*5 -> 6 -> 7 -> 8 -> 6 -> 7 -> 8*/
        
        assertEquals(head.next().next().next().next().data(),6);
        assertEquals(head.next().next().next().next().next().data(),7);
        assertEquals(head.next().next().next().next().next().next().data(),8);
        
        DuplicateRemover.removeDuplicates(head);
        
        assertNull(head.next().next().next().next().next());
        
    }

}
