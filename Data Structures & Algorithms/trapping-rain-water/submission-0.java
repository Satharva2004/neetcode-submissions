class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int l_max = 0;
        int r_max = 0;
        int ans = 0;
        while(l < r){
            if(height[l] < height[r]){
                l_max = Math.max(l_max, height[l]);
                ans += l_max-height[l];
                l++;
            }else{
                r_max = Math.max(r_max, height[r]);
                ans += r_max-height[r];
                r--;
            }
        }
        return ans;
    }
}
