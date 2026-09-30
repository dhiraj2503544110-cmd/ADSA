import java.util.Scanner;

public class BSTS {
    static class Node {
        int data;
        Node right;
        Node left;    
        
        Node(int val){
            this.data = val;
        }
    }
    public static Node Insert(Node root,int val){
        if(root== null){
            return new Node(val);
        }
        
        if(root.data>val){
            root.left= Insert(root.left, val);
        }
        else{
            root.right= Insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Inorder(root.left);
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        Inorder(root.right);
        System.out.print(root.data+" ");
    }
    public static boolean search(Node root,int key){
    if(root == null){
        return false;
    }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data== key){
            return true;
        }
        else if(root.data<key){
            return search(root.right, key);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter the no of element : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element : ");
        
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            root = Insert(root, a[i]);
        }
        // System.out.println("printin Inorder : ");
        // Inorder(root);
        // System.out.println(" ");
        // System.out.println("printin Preorder : ");
        // Preorder(root);       
        // System.out.println(" ");
        // System.out.println("printin Postorder : ");
        // Postorder(root);
        System.out.println("Enter the element to search : ");
        int s = sc.nextInt();
        if(search(root, s)){
            System.out.println(s+" Found");
        }else{
            System.out.println("NOT Found");
        }

    }
}
