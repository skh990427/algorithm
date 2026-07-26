class Solution {
    public String solution(String code) {
        String[] words = code.split("");
        String answer = "";
        int mode = 0;
        
        for(int i = 0 ; i < words.length ; i++) {
            if(mode == 0) {
                if(!words[i].equals("1")) {
                    if(i % 2 == 0)
                        answer += words[i];
                } else {
                    mode = 1;
                }
            } else {
                if(!words[i].equals("1")) {
                    if(i % 2 == 1) {
                        answer += words[i];
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}