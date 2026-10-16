class Solution {
    public int trap(int[] height) {
        int Water=0;
        int left =0;
        int right= height.length-1;
        int leftmax =0;
        int rightmax=0;

        while(left<right){
            if(height[left]<height[right]){
                leftmax = Math.max(height[left],leftmax);
                if(height[left]>leftmax) left++;
                else Water += (leftmax-height[left]); left++; 
            }
            else{
                rightmax =Math.max(height[right],rightmax);
                if(height[right]>rightmax) right--;
                else Water += (rightmax-height[right]); right--;

            }
        }
        return Water;
        
    }
}