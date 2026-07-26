import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        
        int size = Math.max(arr.length, arr[0].length);
        System.out.println(size);
        
        int[][] result = new int[size][size];
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                result[i][j] = arr[i][j];
            }
        }
        
        return result;
    }
}