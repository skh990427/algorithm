class Solution {
    public String solution(String a, String b) {
        String answer = "";   //12345     123456
        
        int size = Math.max(a.length(), b.length());
        if(a.length() > b.length())
            b = "0".repeat(size - b.length()) + b;
        else a = "0".repeat(size - a.length()) + a;
        int up = 0;
        
        for(int i = a.length() - 1; i >= 0 ; i--) {
            
            int numSum = Integer.valueOf(a.charAt(i) + "") + Integer.valueOf(b.charAt(i) + "") + up;
            if(numSum >= 10) {
                answer += (numSum % 10);
                up = 1;
            } else {
                answer += (numSum % 10);
                up = 0;
            }
        }
        if(up == 1) answer += 1;
        
        String result = "";
        
        for(int i = answer.length() - 1 ; i >= 0 ; i--) {
            result += answer.charAt(i);
        }
        
        return result;
    }
}