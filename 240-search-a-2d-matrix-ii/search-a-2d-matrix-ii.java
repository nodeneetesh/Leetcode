class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int m = matrix.length;
        int n= matrix[0].length;
        int low =0;
        int high =m-1;
        boolean result=false;
        for(int i=0; i<m; i++){
            if(matrix[i][n-1]<target){
                continue;
            }else{
                low =0;
                high=n-1;
                while(low<=high){
                    int mid =low+(high-low)/2;
                    if(matrix[i][mid]==target){
                        result=true;
                        break;

                    }
                    else{
                        if(matrix[i][mid]<target){
                            low=mid+1;
                        }else{
                            high = mid-1;
                        }
                    }
                }
            }
            if (result){
                return true;
            }
        }
        return result;
       
        
    }
}