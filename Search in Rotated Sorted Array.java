/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

*/

class Solution {
    public int find_pivot(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            // case-1
            if(mid<end &&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start &&arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[start]>=arr[mid])
            {
               end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return -1;
    }

    int binary_search(int nums[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
    public int search(int[] nums, int target) {

       int pivot=find_pivot(nums);
        int start=0;
        int end=nums.length-1;
        if(pivot == -1)
        {
            //do normal binary search
           return binary_search(nums,start,end,target);
        }

        if(nums[pivot]== target)
        {
            return pivot;
        }
        else if(target>=nums[start])
        {
            return binary_search(nums,start,pivot-1,target);
        }
        else
        {
            return binary_search(nums,pivot+1,end,target);
        }
        
    }
}
