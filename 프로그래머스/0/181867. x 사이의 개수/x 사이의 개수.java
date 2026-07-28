import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] words = myString.split("x");
        List<Integer> result = new ArrayList<>();
        
        for(String word : words)
            result.add(word.length());
        if (myString.endsWith("x"))
            result.add(0);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}