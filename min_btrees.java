import java.util.*;

import javax.sql.RowSet;

public class min_btrees {

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements for the BST");
        int n = sc.nextInt();

        //creating BSTn
        Node root = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+" number");
            int data = sc.nextInt();
            root = create(root, data);

        }
        //Inorder traveral
        System.out.println("Our Binary Search Tree  ");
        inOrder(root);

        System.out.println("\nMinimum Element in the BST is  " + min_element(root));

    }

    static int min_element(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.left == null)
        {
            return root.data;
        }
        return min_element(root.left);
        
        
    }

















    //Creation of nodes 

    static Node create(Node root , int value)
    {
        if(root == null )
        {
            return new Node(value);
        }

        if(value < root.data)
        {
            root.left = create(root.left, value);
        }
        
        if(value >= root.data)
        {
            root.right = create(root.right, value);
        }
        return root;


    }

    static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }
    
}
