//Singly Linked List

import java.util.Scanner;

public class delete_middle {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Linkked List");
        System.out.println("____________________________\n");
        System.out.println("Let's Perform Single Linked List  middle element ");
        
        for (int i = 0; i < 7; i++) {
            list.insert_end();
        }
        list.display();
        System.out.println();
        list.delete_mid();

    }
    
}

//Node creation 

class Node
{
    int data;
    Node next;   //reference
    
}
class Linkedlist{

    Scanner sc=new Scanner(System.in);
    Node head; //first node

    public void delete_mid()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        Node slow = head;
        Node fast = head;
        while(fast != null &&  fast.next != null)
        {
            //fast pointer taking 2x jump
            fast = fast.next.next;
            //slow pointer takees x jump 
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.println("Middle Elelment of the linked List  is   "+ slow.data);


    }
    
    public void insert_end()
    {
        Node node=new Node();
        System.out.println("Enter  data to create new node ");
        int d = sc.nextInt();
        node.data=d;
        node.next=null;

        if(head == null)
        {
            //first element is head i.e. node 
            head=node;
        }
        else{
            
            //travelling to the end of the list
            Node n=head;            // temporary (Node) Object for travelling
            while(n.next != null)
            {
                n=n.next;           // pointing to the next node

            }
            n.next=node;       //now after travelling n is pointing to the last node now the variable n
                                // now is of node is stored instead of null 
        }
    }



    public void display() 
    {
        Node n=head;          // temporary (Node) Object for travelling

        if(head==null)
        {
            System.out.println("Your Linked List is Empty");
        }
        else
        {
            System.out.println("\n\t Our Linked List is \t");
            while(n.next != null)
            {
                System.out.print(n.data+ "\n");
                n=n.next;           // pointing to the next node
                
            }
            System.out.print(n.data);
        }
            
            
    }

    

    

}


