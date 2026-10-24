class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high =nums.length-1;
        int result=0;

        while(low<=high){
            if(nums.length==1){ result = nums[0]; break;}
            int mid =low +(high-low)/2;
            if(mid+1==nums.length&&nums[mid]!=nums[mid-1]){
                result =nums[mid];
                break;
            }
            if(mid==0&&nums[mid+1]!=nums[mid]){
                result =nums[mid];
                break;
            }
            
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                result= nums[mid];
                break;
            }else{
                if(nums[mid]!=nums[mid+1]){
                    if(mid%2!=0){
                        low =mid+1;
                    }else{
                        high =mid-2;
                    }
                }else{
                    if(mid%2==0){
                        low=mid+2;
                        
                    }else{
                        high=mid-1;
                    }
                }
            }
        
        
        
    }
    return result;
}
}