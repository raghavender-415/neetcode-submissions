class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int currentSum = left+right;
            if(currentSum==target){
                return [left,right];
            }else if(currentSum>target){
                right--;
            }else{
                left++;
            }
        }
        return [-1,-1];
    }
}
