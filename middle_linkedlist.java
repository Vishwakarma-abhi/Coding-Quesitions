import java.util.LinkedList;
import java.util.Scanner;

class middlelinkedlist
{
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        middlelinkedlist list =new middlelinkedlist();
        Node head;
        list.insert_end(head);
        list.display(head);
        list.middle(head);
    }

    //Naive Approach ( 1st Approach)
    void middle(Node head)
    {

        middlelinkedlist list =new middlelinkedlist();
        Node result;
        if(head == null)
        {

            System.out.println("List is Empty");
        }
        int count = 0;
        while(head.next != null)
        {
            count++;
            head = head.next;
        }
        int i = 0;
        while(head.next != null)
        {
            if(i == count)
            {
                list.display(head);
                break;
            }
            i++;
            head = head.next; 
        }
        

    }
    public void insert_end(Node head)
    {
        Scanner sc = new Scanner(System.in);
        Node node;
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
    void display(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data +" ");
            head=head.next;
        }
    }
}

class Node
{
    int data;
    Node next;
    Node(int item)
    {
        data = item;
        next = null;
        
        
    }
}