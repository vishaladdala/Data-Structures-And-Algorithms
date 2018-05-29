class Solution {
    public int countComponents(int n, int[][] edges) {
        
        int[] roots = new int[n];
        for(int i = 0 ; i < roots.length; i++){
            roots[i] = i;
        }
        
        for( int[] edge : edges){
            
            int root1 = find(roots, edge[0]);
            int root2 = find(roots, edge[1]);
            
            if(root1!=root2){
                roots[root1] = root2;
                n--;
            }
        
        }
        return n;
      
    }
    
    public static int find( int[] nums, int id){
        while(nums[id] != id){
            nums[id] = nums[nums[id]];
            id = nums[id];
        }
        return id;
    }
}