class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] words = my_string.split("");
        answer += my_string.substring(0, s);
        
        for(int i = e ; i >= s ; i--) {
            answer += words[i];
        }

        answer += my_string.substring(e + 1);
        
        return answer;
    }
}