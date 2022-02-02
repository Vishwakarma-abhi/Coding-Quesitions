import java.util.Scanner;

public class reverse_linkedlist {
    
    Scanner sc=new Scanner(System.in);n
    static Node head;
    public static void main(String[] args) {
        reverse_linkedlist list =new reverse_linkedlist();
        Node n = head; 
        int i = 0;
        while(i != 5)
        {
            list.insert();
            i++;
        }
        list.display();
        System.out.println("Our Reverse Linked List is ");
        list.reverselist(head);

    }

    public void reverselist(Node head)
    {
        //reverse linked list using recursion
        if(head == null)
            return;

        reverselist(head.next);
        System.out.print(head.data+"  ");

    }
    
    public void insert()
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
                System.out.print(n.data+"  ");
                n=n.next;           // pointing to the next node
                
            }
            System.out.println(n.data);
        }
    }
}
class Node
{
    int data;
    Node next;
}
