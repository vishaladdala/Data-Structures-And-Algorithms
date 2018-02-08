class TreeHeight{
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
    public static int TreeHeight( Node root){
        if(root == null){
            return null;
        }

        return 1+ Math.max(TreeHeight(root.left), TreeHeight(root.right));
    }
}

