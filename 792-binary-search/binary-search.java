class Solution {
    public int binarySearch(int[] nums,int left,int right,int target)
    {
        if(left>right) return -1;
        int mid =left+(right-left)/2;
        if(nums[mid]==target) return mid;
        return nums[mid]<target?binarySearch(nums,mid+1,right,target):binarySearch(nums,left,mid-1,target);
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
}