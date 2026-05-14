class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: map.keySet()){
            int frq = map.get(key);
            if(bucket[frq] == null){
                bucket[frq] = new ArrayList<>();
            }
            bucket[frq].add(key);
        }
        int result[] = new int[k];
        int index = 0;
        for(int i=bucket.length-1;i>=0 && index < k; i--){
            if(bucket[i] != null){
                for(Integer in : bucket[i]){
                    result[index++] = in;
                }
            }
        }
        return result;
    }
}
