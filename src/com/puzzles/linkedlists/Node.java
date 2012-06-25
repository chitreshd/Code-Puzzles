package com.puzzles.linkedlists;

/**
 * This is a simple LinkedList Node used across this package to solve LinkedList
 * related puzzles. For simplicity I am using int as the data type. 
 * 
 * @author (original) "Cracking the Coding Interview" book
 * @author Chitresh [ Modifed parts of the code ].
 * 
 */
public class Node
{
    private Node next = null;
    private int data;
    
    public int data()
    {
        return data;
    }
    
    public Node next()
    {
        return next;
    }
    
    public Node(int d)
    {
        data = d;
    }
    
    public void appendToTail(int d)
    {
        Node newEnd = new Node(d);
        Node currentEnd = this;
        
        while(currentEnd.next != null) 
        {
            currentEnd = currentEnd.next;
        }
        currentEnd.next = newEnd;
    }
    
    public static Node deleteNode(Node head, int d)
    {
        Node n = head;
        
        if(head.data == d)
        {
            return head.next;
        }
        
        while(n.next != null)
        {
            if(n.next.data == d)
            {
                n.next = n.next.next;
            }
            return head;
        }
        n = n.next;
        
        return head;
    }

}
