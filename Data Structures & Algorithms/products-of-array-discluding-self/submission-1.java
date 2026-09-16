class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product1 = 1;
        int product2=1;
        int count =0;
        for(int i=0;i<nums.length;i++){
            product1 = product1*nums[i];
            if(nums[i]==0){
                count++;
                continue;
            }else{
                product2=product2*nums[i];
            }
    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            ans[i]=product1/nums[i];
        }else if(count==1&&nums[i]==0){
            ans[i]=product2;
        }else{
            ans[i]=0;
        }
    }
    return ans;
}  
}
