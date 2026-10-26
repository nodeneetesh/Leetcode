class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1;
        int high=0;
        int n = nums.length;
        int result =0;
        for(int i=0; i<n; i++){
            if(nums[i]>high){
                high=nums[i];
            }
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int total=sum(nums,mid,n);
            if(total<=threshold){
                result=mid;
                high=mid-1;


            }else{
                low=mid+1;
            }
        }
        return result;
        
    }
    static int sum(int[] nums, int mid,int n){
        int sum=0;
        for(int i=0; i<n; i++){
            if(nums[i]%mid!=0){
                sum+= (nums[i]/mid)+1;

            }else{
                sum+= nums[i]/mid;
            }
        }
        return sum;
    }
}