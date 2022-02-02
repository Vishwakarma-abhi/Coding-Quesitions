import java.util.Scanner;

public class height_BST {

    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left =new Node(4);
        
        root.right.right =new Node(6);
        
        

    }
    
   
}

class Node
{
    int data;
    Node left;
    Node right;
}
