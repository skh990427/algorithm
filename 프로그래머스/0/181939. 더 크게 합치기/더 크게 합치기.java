class Solution {
    public int solution(int a, int b) {
        String result1 = "" + a + b;
        String result2 = "" + b + a;
        
        int result1_num = Integer.valueOf(result1);
        int result2_num = Integer.valueOf(result2);
        if(result1_num == result2_num) return result1_num;
        else return Math.max(result1_num, result2_num);
    }
}