package com.puzzles.linkedlists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestNthToLastItem
{
    @Test
    public void testForNGreaterThanLinkedListSize()
    {
        Node head = createDummyList(5);
        Node answer = NthToLastItem.getNthToLastItem(head, 3);
        assertEquals(answer.data(), 1);
    }
    
    @Test
    public void testForNSmallerThanLinkedListSize()
    {
        Node head = createDummyList(3);
        Node answer = NthToLastItem.getNthToLastItem(head, 5);
        assertNull(answer);
    }
    
    @Test
    public void testForNEqualToLinkedListSize()
    {
        Node head = createDummyList(3);
        Node answer = NthToLastItem.getNthToLastItem(head, 3);
        assertNull(answer);
    }

    private Node createDummyList(int size)
    {
        Node head = new Node(0);
        Node current = head;
        for(int i = 1; i < size; i++)
        {
            Node temp = new Node(i);
            current.setNext(temp);
            current = temp;
        }
        return head;
    }
    
    

}
