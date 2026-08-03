class Solution {
    public String minWindow(String s, String t) {
        int l = 0, r = 0, max_len = Integer.MAX_VALUE, starting_idx = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        int count = 0;
        while(r < s.length()){
            char curr = s.charAt(r);
            if (map.getOrDefault(curr, 0) > 0){
                count++;
            }
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)-1);
            while(count == t.length()){
                if(r-l+1 < max_len){
                    max_len = r-l+1;
                    starting_idx = l;
                }
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)+1);
                if(map.get(s.charAt(l)) > 0) count--; 
                l++;
            }
            r++;
        }
        if (starting_idx == -1) {
            return "";
        }
        return s.substring(starting_idx, starting_idx + max_len);
    }
}
