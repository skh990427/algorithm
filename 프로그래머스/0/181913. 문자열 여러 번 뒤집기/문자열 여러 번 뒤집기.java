class Solution {
    public String solution(String my_string, int[][] queries) {
        
        String answer = "";
        
        for(int i = 0 ; i < queries.length ; i++) {
            String temp = "";
            temp += my_string.substring(0, queries[i][0]);
            for(int j = queries[i][1] ; j >= queries[i][0] ; j--) {
                temp += my_string.charAt(j);
            }
            my_string = temp + my_string.substring(queries[i][1] + 1);
        }
        return my_string;
    }
}