import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> result = new ArrayList<>();
        
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        
        for(String str : arr)
            if(!str.equals(""))
                result.add(str);
        
        return result.toArray(new String[result.size()]);
    }
}