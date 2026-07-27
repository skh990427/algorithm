class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        while(myString.length() >= pat.length()) {
            if(myString.startsWith(pat))
                count++;
            
            myString = myString.substring(1);
        }
        return count;
    }
}