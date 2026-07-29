import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split("");
        Arrays.sort(result, Collections.reverseOrder());
        for(String word: result)
            answer += word;
        return answer;
    }
}