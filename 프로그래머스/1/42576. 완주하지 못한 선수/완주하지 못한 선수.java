import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        
        for(String com : completion) {
            map.put(com, map.get(com) - 1);
        }
        
        for(String part : participant) {
            if(map.get(part) >= 1)
                return part;
        }
        return null;
    }
}