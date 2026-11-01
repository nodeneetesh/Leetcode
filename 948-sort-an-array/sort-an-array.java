class Solution {
    public int[] sortArray(int[] nums) {
          return merge(nums,0,nums.length-1);
        
        }

    
    static int[] merge(int[]arr,int low,int high){
        if(low>=high){
           return new int[]{arr[low]};
        }
        int mid = low+(high-low)/2;
        int[] arr1 = merge(arr,low,mid);
        int[] arr2 = merge(arr,mid+1,high);
        int[] result = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                result[k]=arr1[i];
                k++; i++;
            }else{
                result[k]=arr2[j];
                k++; j++;
            }
        }
        while(i<arr1.length){
            result[k]=arr1[i];
            k++;i++;
        }
        while(j<arr2.length){
            result[k]=arr2[j];
            j++; k++;
        }
        return result;
    }
        
    
}