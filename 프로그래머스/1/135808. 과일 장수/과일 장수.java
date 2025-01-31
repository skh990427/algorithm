class Solution {
    public int solution(int k, int m, int[] score) {
        int[] apple = new int[k];
        
        for (int i = 0 ; i < score.length ; i++)
        {
            apple[score[i]-1]++;
        }
        
        int index = k - 1;
        int price = 0;
        int count = 0;
        while (true)
        {
            if (apple[index] > 0) {
                count++;
                apple[index]--;
                if (count == m)
                {
                    count = 0;
                    price += (index + 1) * m;
                }
            }
            
            if (index == 0 && apple[0] == 0)
                break;
            if (apple[index] == 0)
                index--;
        }
        return price;
    }
}