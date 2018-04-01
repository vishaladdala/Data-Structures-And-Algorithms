class Solution {
    public List<Integer> postorder(Node root) {
        
        List<Integer> postorder = new ArrayList<>();
        
        PostOrder(root, postorder);
        
        return postorder;
    }
    
    public static void PostOrder(Node root , List<Integer> list){
        
        if( root == null){
            return ;
        }
        for(int i = 0 ; i < root.children.size(); i++){
            PostOrder(root.children.get(i),list);
        }
        
        list.add(root.val);
        
       
        
    }
}



class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> inorder = new ArrayList<>();
        
        PreOrder(root, inorder);
        
        return inorder;
    }
    
    public static void PreOrder(Node root , List<Integer> list){
        
        if( root == null){
            return ;
        }
        
        list.add(root.val);
        
        for(int i = 0 ; i < root.children.size(); i++){
            PreOrder(root.children.get(i),list);
        }
        
    }
}



/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        
        Queue<Node> queue = new LinkedList<>();
        
        if(root == null){return list;}
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i = 0; i<level; i++){
                
                
               /* if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }*/
                
                for(int j = 0; j < queue.peek().children.size(); j++){
                    queue.offer(queue.peek().children.get(j));
                }
                
                sublist.add(queue.poll().val);
                
            }
            
            list.add(sublist);
            
        }
        
        
     return list;  
        
    }
}