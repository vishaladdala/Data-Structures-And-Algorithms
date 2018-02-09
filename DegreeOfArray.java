/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
*/


class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        //int max = 0;
        int order = 0;

        if(nums.length == 0){return 0;}
        
        
        for(int i = 0; i<nums.length; i++){
            int max = 0;
            for (int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    max++;
                }
            }
            if(order < max){
                order = max;
            }
        }
        
        return order;
        
    }
}