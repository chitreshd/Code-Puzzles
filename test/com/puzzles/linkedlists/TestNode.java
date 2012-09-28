package com.puzzles.linkedlists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestNode
{
    @Test
    public void testForAddition()
    {
        Node head = new Node(5);
        assertEquals(head.data(), 5);
        assertNull(head.next());

        head.appendToTail(6);
        head.appendToTail(7);

        assertEquals(head.next().data(), 6);
        assertEquals(head.next().next().data(), 7);
        assertNull(head.next().next().next());
    }

    @Test
    public void testForDelete()
    {
        Node head = LinkedListTestUtils.constructDummyLinkedList();
        /*
         * Thus we have 5->6->7->8 as a linked list.We will try to delete 6 from
         * the list.
         */

        /* We test that 1st element from the head in the list is not null. */
        assertNotNull(head.next());

        /* We test that 1st element from the head in the list is actually 6. */
        assertEquals(head.next().data(), 6);

        /* This should delete the node with data 6. */
        head = Node.deleteNode(head, 6);

        assertEquals(head.next().data(), 7);

        head = LinkedListTestUtils.constructDummyLinkedList();
        /*
         * Thus we again have 5->6->7->8 as a linked list. Now will try to
         * delete the head thats 5 from the list.
         */
        assertEquals(head.data(),5);
        head = Node.deleteNode(head, 5);
        assertEquals(head.data(),6);
        
        head = LinkedListTestUtils.constructDummyLinkedList();
        /*
         * Thus we again have 5->6->7->8 as a linked list. Now will try to
         * delete the tail thats 8 from the list.
         */
        head = Node.deleteNode(head, 8);
        assertNull(head.next().next().next());
    }

}
