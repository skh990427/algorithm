class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        // "ihrhbakrfpndopljhygc"
        for(int i = c - 1 ; i < my_string.length() ; i += m) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}