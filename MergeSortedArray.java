/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = n-1;
        int total = m + n - 1;
        
        while( left>=0 && right>=0){
            if( nums1[left] > nums2[right]){
                nums1[total] = nums1[left];
                total--;
                left--;
            }
            else{
                nums1[total] = nums2[right];
                total--;
                right--;
            }
        }
        
        while(right>=0){
            nums1[total] = nums2[right];
            right--;
            total--;
        }
    }
}