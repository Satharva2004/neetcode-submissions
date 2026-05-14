class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String s : strs) {
            result = result + s.length() + "#" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            j++;
            output.add(str.substring(j,j+len));
            i = j+len;
        }
        return output;
    }
}
