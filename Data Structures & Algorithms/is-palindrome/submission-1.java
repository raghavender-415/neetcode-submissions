class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        char [] arr = cleanedStr.toCharArray();

        if(arr.length==1) return true;
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
}
