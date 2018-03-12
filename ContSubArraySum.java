class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum; int cnt = 0;
        if(k==0 && nums.length!=0){
            for(int i =0; i<nums.length-1;i++){
                if(nums[i] == 0 && nums[i+1]==0){
                    return true;
                }
            }
            return false;
        }
     //   if(k == 0){return false;}
        
        
        for(int i = 0; i<nums.length-1; i++){
            sum = nums[i];
            for(int j = i+1; j<nums.length; j++){
                sum += nums[j];
                if(sum % k ==0){
                    return true;
                }
                else{
                    continue;
                }
            }
        }
        return false;
        
    }
}