class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int result[] = new int[len];
        for(int i=0;i<nums.length;i++){
            int left = 1;
            int right = 1;
            for(int left_index = 0; left_index<i;left_index++){
                left = left * nums[left_index];
            }
            for(int right_index = i+1; right_index<nums.length;right_index++){
                right = right * nums[right_index];
            }
            result[i] = left*right;
        }
        return result;
    }
}  
