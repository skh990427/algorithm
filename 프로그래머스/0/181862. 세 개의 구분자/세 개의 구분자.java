import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        for(String str : myStr.replaceAll("[a-c]", " ").trim().split(" ")) {
            if(!str.equals(""))
                result.add(str);
        }
        
        return result.isEmpty() ? new String[]{"EMPTY"} : result.toArray(new String[0]);
    }
}