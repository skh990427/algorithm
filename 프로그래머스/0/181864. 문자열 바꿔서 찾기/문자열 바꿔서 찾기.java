class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("B", "C").replace("A", "B").replace("C", "A");
        if(myString.contains(pat)) return 1;
        else return 0;
    }
}