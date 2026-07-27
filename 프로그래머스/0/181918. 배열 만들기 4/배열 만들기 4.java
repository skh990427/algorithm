import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> result = new ArrayList<>();
        
        int i = 0;
        while(i < arr.length) {
            if (result.size() == 0) {
                result.add(arr[i]);
                i++;
            } else if (result.size() != 0 && result.get(result.size() - 1) < arr[i]) {
                result.add(arr[i]);
                i++;
            } else if (result.size() != 0 && result.get(result.size() - 1) >= arr[i]) {
                result.remove(result.size() - 1);
            }
        }
        
        return result.stream().mapToInt(data -> data).toArray();
    }
}