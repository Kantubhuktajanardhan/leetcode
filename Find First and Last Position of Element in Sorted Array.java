/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1] 

*/

class Solution {
   int binary_search(int nums[],int target,boolean position)
    {
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                result=mid;
                if(position)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

        }

        return result;
    }
    public int[] searchRange(int[] nums, int target) {
    int arr[]=new int[2];
    arr[0]=binary_search(nums,target,true);
    arr[1]=binary_search(nums,target,false);
    return arr;
    }
}
