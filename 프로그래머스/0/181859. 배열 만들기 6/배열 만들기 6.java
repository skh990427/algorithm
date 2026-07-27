import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        Stack<Integer> stk = new Stack<>();
        while (i < arr.length) {
            if(stk.isEmpty()){
                stk.push(arr[i]);
                i++;
            } else if(!stk.isEmpty() && stk.peek() == arr[i]) {
                stk.pop();
                i++;
            } else if(!stk.isEmpty() && stk.peek() != arr[i]) {
                stk.push(arr[i]);
                i++;
            }
        }
        return !stk.isEmpty() ? stk.stream().mapToInt(data -> data).toArray() : new int[]{-1};
    }
}