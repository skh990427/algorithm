import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] result = new int[arr.length];
        
        for(int i = 0 ; i < result.length ; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(result);
        return result[0] + " " + result[result.length - 1];
    }
}