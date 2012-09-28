package com.puzzles.linkedlists;

public class NthToLastItem
{
    public static Node getNthToLastItem(Node head,int n)
    {
        if(head == null)
            return null;
            
        Node p1 = head;
        Node p2 = head;
        
        for(int i = 0; i <= n; i++)
        {
            p1 = p1.getNext();
            if( p1 == null )
                return null;        
        }
        
        while(p1 != null)
        {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        
        return p2;
    }

}
