class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
         if(map.size()==0) map.put(nums[i],i);
         else{
            int rest= target-nums[i];
            if(map.getOrDefault(rest,-1)!=-1){
                result[0]=map.get(rest);
                result[1]=i;
                return result;
            }else{
                map.put(nums[i],i);
            }
         }   
        }
        return result;
        
    }
}