class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result =0;
        
        while(left<right){
            int h =Math.min(height[left], height[right]);
            int temp=h*(right-left);
            if(result<temp){
                result=temp;
            }
            if(height[left]<height[right]){
                left++;
            }else{right--;}
            


        }
        return result;
        
    }
}