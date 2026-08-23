class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        char [] arr = cleanedStr.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            if(arr[left]!=arr[right]){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
