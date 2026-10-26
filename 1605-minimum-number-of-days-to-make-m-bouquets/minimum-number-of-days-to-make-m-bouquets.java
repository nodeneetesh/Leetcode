class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m>n/k) return -1;
        int high=0;
        int min =n;
        for(int i=0; i<n; i++){
            if(bloomDay[i]>high){
                high=bloomDay[i];
            }
        }
        int low=1;

        while(low<=high){
            int mid=low+(high-low)/2;
            boolean result = count(bloomDay,n,m,k,mid);
            if(result){
               min =mid;
               high =mid-1;


            }
            else low=mid+1;
        }
        return min;

        
    }
    static boolean count (int[] nums,int n, int m ,int k,int mid){
        boolean result =false;
        int count =0;
        for(int i=0; i<n; i++){
            if(nums[i]<=mid){
              count++;
            }else{
                count =0;
            }
            if(count==k){
                m--;
                count=0;
            }
            if(m==0) {
                result =true;
                break;
            }
        }
        return result;
    }
}