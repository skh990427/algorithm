class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int max = n / 2;
        if(n % 2 != 0) {
            answer[max][max] = n*n;
        }
        
        int cnt = 1;
        for(int i = 0 ; i < max ; i++) {
            int x = i;
            int y = i;
            
            // right
            for(; y < n-(i+1);y++) {
                answer[x][y] = cnt++;
            }
            // down
            for(; x < n-(i+1);x++) {
                answer[x][y] = cnt++;
            }
            //left
            for(; y > i; y--){
                answer[x][y] = cnt++;
            }
            //up
            for(; x > i; x--) {
                answer[x][y] = cnt++;
            }
        }
        return answer;
    }
}