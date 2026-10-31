class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
       ArrayList<Integer> list = new ArrayList<>();
       
        Set<Integer>set =new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j =0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}