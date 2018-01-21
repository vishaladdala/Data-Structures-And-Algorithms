/*
HackerrankBubbleSort.java
Task 
Given an -element array, , of distinct elements, sort array  in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:

Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
First Element: firstElement, where  is the first element in the sorted array.
Last Element: lastElement, where  is the last element in the sorted array.
Hint: To complete this challenge, you must add a variable that keeps a running tally of all swaps that occur during execution.

Input Format

The first line contains an integer, , denoting the number of elements in array . 
The second line contains  space-separated integers describing the respective values of .

Constraints


, 
Output Format

You must print the following three lines of output:

Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
First Element: firstElement, where  is the first element in the sorted array.
Last Element: lastElement, where  is the last element in the sorted array.
Sample Input 0

3
1 2 3
Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int count = bubblesort(a,n);
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
        
    }  
        
        
    static int bubblesort(int[] a,int n){
        int z = 0;
        for (int i = 0; i < n; i++) {
     
         for (int j = 0; j < n-i-1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            //swap(a[j], a[j + 1]);
            int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
           z++;
        }    
            
    }    
    }
        return z;
    }
}