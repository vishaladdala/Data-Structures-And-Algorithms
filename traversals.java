class traversals{
    class Node{
        private int data;
        private Node left;
        private Node right;
     
        public Node(int value, Node left, Node right){
            this.data  = value;
            this.right = right;
            this.left = left;
        }
     }


     public static void Preorder(Node root){
         if(root == null){
             return;
         }

         System.out.println(root.data);
         Preorder(root.left);
         Preorder(root.right);
     }

     public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        Inorder(root.right);
        System.out.println(root.data); 
    }
}