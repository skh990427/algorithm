class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim().replaceAll("[ ]+", " ");
        return my_string.split(" ");
    }
}