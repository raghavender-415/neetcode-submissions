class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public int binarySearch(int[] arr, int left, int right, int target){
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        int leftAns = binarySearch(arr,left,mid-1,target);
        if(leftAns!=-1) return leftAns;

        return binarySearch(arr,mid+1,right,target);
    }
}
