class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[nums.length];
        
        int len = nums.length;
        
        for(int i = 2 * len - 1; i >= 0; i--){
            while( !stack.empty() && nums[stack.peek()] <= nums[i%len]){
                stack.pop();
            }
            
            res[i%len] = stack.empty() ? -1 : nums[stack.peek()];
            
            stack.push(i%len);
        }
        
        return res;
        
    }
}