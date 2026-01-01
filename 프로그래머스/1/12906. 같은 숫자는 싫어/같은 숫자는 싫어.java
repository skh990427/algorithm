import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int data : arr) {
            if(stack.size() == 0 || stack.peek() != data) {
                stack.push(data);
            }
        }
        
        return stack.stream().mapToInt(m -> m).toArray();
    }
}