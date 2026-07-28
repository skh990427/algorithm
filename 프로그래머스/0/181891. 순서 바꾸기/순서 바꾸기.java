import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] temp1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] temp2 = Arrays.copyOfRange(num_list, 0, n);
        
        int[] result = new int[num_list.length];
        for(int i = 0 ; i < temp1.length ; i++) {
            result[i] = temp1[i];
        }
        for(int i = 0 ; i < temp2.length ; i++) {
            result[i + temp1.length] = temp2[i];
        }
        
        return result;
    }
}