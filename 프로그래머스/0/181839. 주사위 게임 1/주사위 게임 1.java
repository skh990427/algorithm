class Solution {
    public int solution(int a, int b) {
        if(checkOdd(a) && checkOdd(b))
            return a * a + b * b;
        else if(checkOdd(a) && !checkOdd(b) || !checkOdd(a) && checkOdd(b))
            return 2 * (a + b);
        else
            return a - b < 0 ? (a-b) * -1 : a - b;
    }
    
    public boolean checkOdd(int odd) {
        if (odd % 2 == 1)
            return true;
        return false;
    }
}