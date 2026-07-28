class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list[num_list.length - 2];
        int b = num_list[num_list.length - 1];
        
        int[] answer = new int[num_list.length + 1];
        for(int i = 0 ; i < num_list.length ; i++) {
            answer[i] = num_list[i];
        }
        if(b > a)
            answer[num_list.length] = b - a;
        else
            answer[num_list.length] = b * 2;
        
        return answer;
    }
}