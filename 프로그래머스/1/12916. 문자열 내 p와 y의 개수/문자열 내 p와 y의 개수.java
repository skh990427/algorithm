class Solution {
    boolean solution(String s) {
        
        int countP = 0;
        int countY = 0;
        s = s.toLowerCase().replaceAll("[^p,^y]", "");
        System.out.println(s);
        
        for(int i = 0 ; i < s.length() ; i++)
            if(s.charAt(i) == 'p')
                countP++;
            else
                countY++;

        return countP == countY ? true : false;
    }
}