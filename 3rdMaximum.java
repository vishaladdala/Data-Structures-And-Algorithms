class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        
        for(int i=0; i< nums.length; i++){
            tree.add(nums[i]);
        }
        
        if (tree.size() >2) {      
             tree.remove(tree.last());
             tree.remove(tree.last());  
        }
        
        return tree.last();
    }
}