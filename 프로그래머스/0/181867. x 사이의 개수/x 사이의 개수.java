import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] words = myString.split("x", -1);
        List<Integer> result = new ArrayList<>();
        
        for(String word : words)
            result.add(word.length());
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}