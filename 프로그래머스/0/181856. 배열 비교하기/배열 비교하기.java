class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length)
            return 1;
        else if(arr2.length > arr1.length)
            return -1;
        else {
            int arr1sum = 0;
            int arr2sum = 0;
            for(int i = 0 ; i < arr1.length ; i++) {
                arr1sum += arr1[i];
                arr2sum += arr2[i];
            }
            if(arr1sum > arr2sum) return 1;
            if(arr1sum < arr2sum) return -1;
            else return 0;
        }
            
    }
}