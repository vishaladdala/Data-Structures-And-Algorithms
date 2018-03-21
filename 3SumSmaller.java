/*
259. 3Sum Smaller
DescriptionHintsSubmissionsDiscussSolution
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

For example, given nums = [-2, 0, 1, 3], and target = 2.

Return 2. Because there are two triplets which sums are less than 2:

[-2, 0, 1]
[-2, 0, 3]
Follow up:
Could you solve it in O(n2) runtime?
*/

class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            sum += twoSumSmaller(nums,i+1,target - nums[i]);
        }
        
        return sum;
    }
    
    public int twoSumSmaller(int[] nums,int start, int target){
        int sum = 0;
        int begin = start;
        int end = nums.length - 1;
        
        while(begin < end){
            if(nums[begin] + nums[end] < target){
                sum += end - begin;
                begin++;
            }
            else{
                end--;
            }
        }
        
       return sum; 
    }
}


/*
Approach  (Two Pointers) 
Let us try sorting the array first. For example, nums = [3,5,2,8,1]nums=[3,5,2,8,1] becomes [1,2,3,5,8][1,2,3,5,8].

Let us look at an example nums = [1,2,3,5,8]nums=[1,2,3,5,8], and target = 7target=7.

[1, 2, 3, 5, 8]
 ↑           ↑
left       right
Let us initialize two indices, leftleft and rightright pointing to the first and last element respectively.

When we look at the sum of first and last element, it is 1 + 8 = 91+8=9, which is \geq target≥target. That tells us no index pair will ever contain the index rightright. So the next logical step is to move the right pointer one step to its left.

[1, 2, 3, 5, 8]
 ↑        ↑
left    right
Now the pair sum is 1 + 5 = 61+5=6, which is < target<target. How many pairs with one of the index = leftindex=left that satisfy the condition? You can tell by the difference between rightright and leftleft which is 33, namely (1,2), (1,3),(1,2),(1,3), and (1,5)(1,5). Therefore, we move leftleft one step to its right.

public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length - 2; i++) {
        sum += twoSumSmaller(nums, i + 1, target - nums[i]);
    }
    return sum;
}

private int twoSumSmaller(int[] nums, int startIndex, int target) {
    int sum = 0;
    int left = startIndex;
    int right = nums.length - 1;
    while (left < right) {
        if (nums[left] + nums[right] < target) {
            sum += right - left;
            left++;
        } else {
            right--;
        }
    }
    return sum;
}
Complexity analysis

Time complexity : O(n^2)O(n
​2
​​ ). The twoSumSmaller function takes O(n)O(n) time because both left and right traverse at most n steps. Therefore, the overall time complexity is O(n^2)O(n
​2
​​ ).

Space complexity : O(1)O(1).
*/
