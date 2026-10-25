class Solution {
    public int mySqrt(int x) {
        int low =1;
        int high =x/2;
        int result=0;
        if(x==1){
            return 1;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(mid==x/mid){
                return mid;
            
            }else{
                if(mid<x/mid){
                    if(result<mid){
                        result =mid;
                        low=mid+1;
                    }
                }else high =mid-1;
            }
        }
        return result;

     
    }
}