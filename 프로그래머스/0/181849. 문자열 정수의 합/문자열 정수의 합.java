class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] nums = num_str.split("");
        for(String num : nums)
            answer += Integer.parseInt(num);
        return answer;
    }
}