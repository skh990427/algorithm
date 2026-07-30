class Solution {
    public int[] solution(int n, int m) {
        int a = 1;
        int b = 1;
        int div = 2;
        while(div <= n && div <= m) {
            if(n % div == 0 && m % div == 0) {
                a *= div;
                b *= div;
                n /= div;
                m /= div;
            } else {
                div++;
            }
        }
        
        return new int[]{a, b * n * m};
    }
}