
class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        permutations(nums, 0, result);

        return result;
    }

    public void permutations(int[] nums, int index,
                             List<List<Integer>> result) {

        
        if (index == nums.length) {

            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            result.add(temp);
            return;
        }

       
        for (int i = index; i < nums.length; i++) {

            
            swap(nums, index, i);

          
            permutations(nums, index + 1, result);

           
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
