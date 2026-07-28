class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[start_num - end_num + 1];
        
        int i = 0;
        
        while(start_num >= end_num) {
            result[i++] = start_num--;
        }
        return result;
    }
}