class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max_len = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            int j = i;
            int max = 0;
            while(j < s.length() && !set.contains(s.charAt(j))){
                max++;
                set.add(s.charAt(j));
                j++;
            }
            max_len = Math.max(max, max_len);
        }
        return max_len;
    }
}
