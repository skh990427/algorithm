class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while(min <= max)
            answer += min++;
        return answer;
    }
}