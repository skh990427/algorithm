import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        int sum = 1;
        while(iter.hasNext()) {
            Map.Entry<String,Integer> entry = iter.next();
            sum *= entry.getValue() + 1;
        }
        return sum - 1;
        
    }
}