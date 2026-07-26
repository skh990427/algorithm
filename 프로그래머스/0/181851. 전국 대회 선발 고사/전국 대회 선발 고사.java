import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> data = new HashMap<>();
        
        int answer = 0;
        
        for(int i = 0 ; i < rank.length ; i++) {
            if(attendance[i] == true) {
                data.put(rank[i], i);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(data.keySet());
        Collections.sort(keySet);
        
        answer += data.get(keySet.get(0)) * 10_000;
        answer += data.get(keySet.get(1)) * 100;
        answer += data.get(keySet.get(2));
        
        return answer;
    }
}