class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arr = new HashMap<>();
        int[] result_arr = new int[2];
        for(int i=0;i<nums.length;i++){
            arr.put(nums[i], i);
        }
        for(int i = 0; i<nums.length;i++){
            if(arr.containsKey(target - nums[i]) && arr.get(target - nums[i]) != i){
                result_arr[0] = i;
                result_arr[1] = arr.get(target - nums[i]);
                return result_arr;
            }
        }
        return result_arr;
    }
}
