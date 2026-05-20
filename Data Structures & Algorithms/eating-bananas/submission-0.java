class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return binary(piles, h);
        
    }
    public int binary(int[] piles, int h){
        int low = 0; 
        int high = max(piles);
        while( low<=high){
            int mid = low + (high - low)/2;
            int target = time(piles, mid);
            if(target <= h){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public int time(int[] piles, int hr){
        int totaln = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++){
            totaln += Math.ceil((double)piles[i] / (double)hr);
        }
        return totaln;
    }
    public int max(int[] piles){
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }
}
