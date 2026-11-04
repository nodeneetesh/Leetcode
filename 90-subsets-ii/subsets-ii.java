class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
   List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combinationSum(0, nums, ds, ans);

        return ans;
    }

    static void combinationSum(
            int index,
            int[] arr,
            List<Integer> ds,
            List<List<Integer>> ans) {
                if(index ==arr.length){
                    
                       ans.add(new ArrayList<>(ds));
                    
                    return;
                }
                
                    ds.add(arr[index]);
                    combinationSum(index+1,arr,ds,ans);
                    ds.remove(ds.size()-1);
                    while((index+1)<arr.length && arr[index]==arr[index+1]){
                        index++;
                    }
               
                    
                
               
                   
                    combinationSum(index+1,arr,ds,ans);
                    

        

    }
}