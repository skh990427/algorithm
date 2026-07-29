import java.util.*;

class Solution {
    public long solution(long n) {
        String[] nums = ("" + n).split("");
        Arrays.sort(nums, Collections.reverseOrder());
        return Long.parseLong(String.join("", nums));
    }
}