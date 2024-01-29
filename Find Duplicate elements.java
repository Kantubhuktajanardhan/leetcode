/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int arr[]=nums.clone();
        while(i<nums.length)
        {
            if(arr[i] != i+1)
            {
                if(arr[i] != arr[arr[i]-1])
                {
                    int temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                }
                else
                {
                    return arr[i];
                }
            }
            else
            {
                i++;
            }
        }
        return -1;
    }
}
