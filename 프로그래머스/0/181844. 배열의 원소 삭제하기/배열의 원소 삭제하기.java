import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        for(int num : arr) {
            result.add(num);
        }
        for(int num : delete_list){
            if(result.contains(num))
                for(int i = 0 ; i < result.size() ; i++) {
                    if(result.get(i) == num)
                        result.remove(i);
                }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}