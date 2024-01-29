/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al=new ArrayList<Integer>();
        int i=0;
        while(i<nums.length)
        {
           
                if(nums[i] != nums[nums[i]-1])
                {
                    //swap
                    int temp=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=temp;
                }
                else
                {
                    i++;
                }   
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
                al.add(nums[j]);
            }
        }

        return al;
    }
}
