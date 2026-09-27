class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min = nums[0];
        return binarySearch(nums,start,end,min); 
    }
    public int binarySearch(int[] arr,int left,int right, int min){
            if(left>right) return min;
            int mid=left+(right-left)/2;
            if(arr[mid]<min){
                min=arr[mid];
            }
            int leftMin=binarySearch(arr,left,mid-1,min);
            int rightMin=binarySearch(arr,mid+1,right,min);
        
        return Math.min(leftMin,rightMin);
    }
}
