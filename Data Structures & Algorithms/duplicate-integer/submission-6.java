class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int i = nums.length-1; 
        while(i>=0){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
            i--;
        }
        return false;
    }
}