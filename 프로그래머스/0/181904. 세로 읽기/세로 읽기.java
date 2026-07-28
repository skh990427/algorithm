class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] words = my_string.split("");
        // "ihrhbakrfpndopljhygc"
        for(int i = c - 1 ; i < words.length ; i += m) {
            answer += words[i];
        }
        
        return answer;
    }
}