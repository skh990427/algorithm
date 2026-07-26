import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        
        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(!list.contains(num))
                list.add(num);
        }
        
        if(k > list.size()) {
            for(int i = 0 ; i < list.size() ; i++) {
                result[i] = list.get(i);
            }
            for(int i = list.size() ; i < k ; i++) {
                result[i] = -1;
            }
        } else {
            for(int i = 0 ; i < k ; i++) {
                result[i] = list.get(i);
            }
        }
        
        return result;
    }
}