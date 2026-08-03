class Solution {
    public int characterReplacement(String s, int k) {
        return hehe(s, k);
    }
    public int hehe(String s, int k){
        int l =0, r = 0, max_fre = 0, max_len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            char key = s.charAt(r);
            map.put(key, map.getOrDefault(key, 0) + 1);
            max_fre = Math.max(max_fre, map.get(key));
            if ((r - l + 1) - max_fre > k) {
                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;
            }
            max_len = Math.max(max_len, r - l + 1);
            r++;
        }
        return max_len;
    }
}