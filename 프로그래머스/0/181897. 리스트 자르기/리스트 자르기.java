import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch(n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            default:
                num_list = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                List<Integer> list = new ArrayList<>();
                for(int i = 0 ; i < num_list.length ; i+=slicer[2]) {
                    list.add(num_list[i]);
                }
                return list.stream().mapToInt(i->i).toArray();
        }
    }
}