import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};
        int min = arr[0];
        int idx = 0;
        
        List<Integer> result = new ArrayList<>();
        result.add(min);
        for(int i = 1 ; i < arr.length ; i++) {
            result.add(arr[i]);
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        
        result.remove(idx);
        return result.stream().mapToInt(i -> i).toArray();
    }
}