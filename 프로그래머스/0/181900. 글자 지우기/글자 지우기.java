class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] words = my_string.split("");
        for(int idx : indices) words[idx] = "";
        
        for(String word : words) answer += word;
        return answer;
    }
}