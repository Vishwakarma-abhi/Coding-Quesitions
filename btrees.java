import java.util.*;

public class btrees {

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

        //creating BST
        Node root = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+" number");
            int data = sc.nextInt();
            root = create(root, data);

        }
        //Inorder traveral
        System.out.println("Our Binary Search Tree  ");
        inOrder(root);

    }

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
