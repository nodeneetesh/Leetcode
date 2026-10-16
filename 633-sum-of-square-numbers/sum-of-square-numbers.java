class Solution {
    public boolean judgeSquareSum(int c) {
        boolean result =false;
        int left =0;
        long right = (long) Math.sqrt(c);
        while(left<=right){
            if((left*left+right*right)==c){ result = true; break;
            }
                        else{
                            if((left*left+right*right)>c) right--;
                            else left++;
        }
        }
        
        return result;
        
            }
}
        
    
