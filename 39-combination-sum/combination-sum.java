class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
   
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combinationSum(0, candidates, target, ds, ans);

        return ans;
    }

    static void combinationSum(
            int index,
            int[] arr,
            int target,
            List<Integer> ds,
            List<List<Integer>> ans) {
                if(index ==arr.length){
                    if(target==0){
                       ans.add(new ArrayList<>(ds));
                    }
                    return;
                }
                if(target>=arr[index]){
                    ds.add(arr[index]);
                    combinationSum(index,arr,target-arr[index],ds,ans);
                    ds.remove(ds.size()-1);
                }
               
                   
                    combinationSum(index+1,arr,target,ds,ans);
               

        

    }
}