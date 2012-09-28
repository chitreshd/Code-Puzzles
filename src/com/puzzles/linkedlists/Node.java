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
    private Node prev = null;
    
    private int data;
    
    public int data()
    {
        return data;
    }
    
    public Node next()
    {
        return next;
    }
    
    public void setNext(Node newNext)
    {
        next = newNext;
        if(newNext != null && newNext.prev != this)
        {
            newNext.setPrevious(this);
        }
    }
    
    public void setPrevious(Node newPrev)
    {
        prev = newPrev;
        if(newPrev != null && newPrev.next != this)
        {
            newPrev.setNext(this);
        }
    }
    
    public Node getPrev()
    {
        return prev;
    }
    
    public Node getNext()
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
    
    /**
     * This will delete the first occurrence of the node.
     * @param head
     * @param d
     * @return
     */
    public static Node deleteNode(Node head, int d)
    {
        if(head.data == d)
        {
            return head.next;
        }
        
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.next != null && temp.next.data == d)
            {
                temp.next = temp.next.next;
                //return head;
            }
            temp = temp.next;
        }
        
        return head;
    }

    @Override
    public String toString()
    {
        return "Node [data=" + data + "]";
    }
    
    public static String printForward(Node head)
    {
        Node current = head;
        StringBuffer buff = new StringBuffer();
        buff.append(current.data());
        while(current.getNext() != null)
        {
            buff.append(" -> ");
            buff.append(current.getNext().data());
            current = current.getNext();
        }
        
        return buff.toString();
    }

}
