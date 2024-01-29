/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i] !=nums[nums[i]-1])
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
        List<Integer> al=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
                al.add(j+1);
            }
        }

        return al;
    }
}
