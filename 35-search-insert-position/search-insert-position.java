class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = binarySearch(nums,target);
        
        return result;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids integer overflow
            
            if (arr[mid] == target)
                return mid; // Target found
            
            if (arr[mid] < target)
                left = mid + 1; // Search in the right half
            else
                right = mid - 1; // Search in the left half
        }
        
        return left; // Target not found
    }
    
}