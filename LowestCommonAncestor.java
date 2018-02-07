

class LowestCommonAncestor{
    public static Node LowestCommonAncestor(Node root, int value1, int value2){
        while( root != null){

            int value = root.value;

            if( value > value1 && value > value2){
                root = root.left;
            }

            else if( value < value1 && value < value2){
                root = root.right;
            }
            
            else{
                return root;
            }

        }

        return null; //if empty tree
    }
}
//Binary tree Node
public class Node{
    private int data;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right){
        this.data = value;
        this.left = left;
        this.right = right;
    }


}