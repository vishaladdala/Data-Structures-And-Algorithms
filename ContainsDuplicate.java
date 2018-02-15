/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
         HashSet<Integer> set = new HashSet<Integer>();
         for (int n : nums){
             if(set.contains(n)){
                 return true;
             }
             set.add(n);
             
         } 
        return false;
    }
}