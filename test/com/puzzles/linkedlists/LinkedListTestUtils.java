package com.puzzles.linkedlists;

public class LinkedListTestUtils
{

    public static Node constructDummyLinkedList()
    {
        Node head = new Node(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        return head;
    }
    
    public static Node constructDummyLinkedListWithDuplicates()
    {
        Node head = new Node(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        return head;
    }

}
