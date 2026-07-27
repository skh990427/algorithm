import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = -1;
        int max = -1;
        boolean firstFlag = false;
        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 2 && !firstFlag) {
                min = i;
                max = i;
                firstFlag = true;
            } else if (arr[i] == 2 && firstFlag) {
                max = i;
            }
        }
        
        if(min == -1 && max == -1)
            return new int[]{-1};
        else if(min == max)
            return Arrays.copyOfRange(arr, min, min + 1);
        else
            return Arrays.copyOfRange(arr, min, max + 1);
    }
}