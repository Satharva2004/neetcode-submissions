class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j = heights.length-1;
        int res = 0;
        while(i < j){
            int max = Math.min(heights[i], heights[j]);
            res = Math.max(max*(j-i), res);
            if(max == heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
