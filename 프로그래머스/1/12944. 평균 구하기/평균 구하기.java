class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i : arr)
            sum += i;
        
        return 1.0 * sum / arr.length;
    }
}