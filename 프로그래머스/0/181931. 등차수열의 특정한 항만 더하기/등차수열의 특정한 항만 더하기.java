class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for(boolean flag : included) {
            if(flag)
                sum += a;
            a += d;
        }
        return sum;
    }
}