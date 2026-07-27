class Solution {
    public int solution(int[] arr) {
        int pass = 0;
        int routin = 0;
        while (true) {
            for(int i = 0 ; i < arr.length ; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                    arr[i] /= 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1)
                    arr[i] = arr[i] * 2 + 1;
                else pass++;
            }
            routin++;
            if(pass == arr.length)
                break;
            else
                pass = 0;
        }
        return routin - 1;
    }
}