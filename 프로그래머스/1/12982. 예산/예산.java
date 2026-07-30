import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        for(int num : d) {
            if(num <= budget) {
                budget -= num;
                answer++;
            }
            if (budget <= 0) return answer;
        }
        
        return answer;
    }
}