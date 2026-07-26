import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arrs = new ArrayList<>();
        
        for(int i = l ; i <= r ; i++) {
            String value = String.valueOf(i);
            String leftValue = value.replace("5", "").replace("0", "");
            if(!leftValue.isEmpty()) {
                continue;
            } else {
                arrs.add(i);
            }
        }
        return arrs.size() > 0 ? arrs.stream().mapToInt(i -> i).toArray() : new int[]{-1};
    }
}