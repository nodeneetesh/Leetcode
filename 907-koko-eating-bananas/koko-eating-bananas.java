class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =-1;
        for(int j=0; j<piles.length; j++){
            if(piles[j]>max){
                max=piles[j];
            }
        }
        int low =0;
        int high =max;
        int result=0;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(mid==0){ low = low+1; continue;}
            int x = count(mid,piles);
            if(x<=h){
                 result = mid;
                 high=mid-1;
            }else{
                low =mid+1;
            }
        }
        return result;
        
    }
    static int count(int mid,int[] nums){
        
        int result=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%mid !=0){
              result += nums[i]/mid+1;
            }else{
                result+=nums[i]/mid;
            }
        }
        return result;
    }
}