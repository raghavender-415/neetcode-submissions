class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows-1;
        

        while(left<=right){
            int mid1 = left + (right-left)/2;
            if(matrix[mid1][0]<=target && matrix[mid1][cols-1]>=target){
                int low = 0;
                int high = cols-1;
                while(low<=high){
                    int mid2 = low+(high-low)/2;
                    if(matrix[mid1][mid2]==target){
                        return true;
                    }else if(matrix[mid1][mid2]<target){
                        low=mid2+1;
                    }else{
                        high=mid2-1;
                    }
                }
                return false; 
            }else if(matrix[mid1][0]>target){
                right = mid1-1;
            }else{
                left = mid1+1;
            }
        }
        return false;
    }
}
