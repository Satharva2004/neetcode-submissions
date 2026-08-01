class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; //t
        int j = s.length()-1; //t
        while(i < j){ 
            char curr_i = s.charAt(i);
            char curr_j = s.charAt(j);
            if(curr_i == ' ' || !((curr_i >= 'a' && curr_i <= 'z') ||
      (curr_i >= 'A' && curr_i <= 'Z') ||
      (curr_i >= '0' && curr_i <= '9'))){
                i++;
                continue;
            }else if(curr_j == ' ' || !((curr_j >= 'a' && curr_j <= 'z') ||
      (curr_j >= 'A' && curr_j <= 'Z') ||
      (curr_j >= '0' && curr_j <= '9'))){
                j--;
                continue;
            }else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
