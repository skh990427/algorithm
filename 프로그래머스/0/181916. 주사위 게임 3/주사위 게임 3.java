import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        if(map.get(keySet.get(0)) == 4) {
            return keySet.get(0) * 1111;
        } else if(map.get(keySet.get(0)) == 3) {
            return (10 * keySet.get(0) + keySet.get(1)) * (10 * keySet.get(0) + keySet.get(1));
        } else if (map.get(keySet.get(0)) == 2){
            if(map.get(keySet.get(1)) == 2) {
                return ((keySet.get(0) + keySet.get(1)) * Math.abs(keySet.get(0) - keySet.get(1)));
            } else {
                return keySet.get(1) * keySet.get(2);
            }
        } else {
            return Math.min(keySet.get(0), Math.min(keySet.get(1), Math.min(keySet.get(2), keySet.get(3))));
        }
    }
}