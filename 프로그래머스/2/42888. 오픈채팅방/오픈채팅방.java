import java.util.StringTokenizer;
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        List<String> message = new ArrayList<>();
        
        Map<String, String> users = new HashMap<>();
        for (String command : record)
        {
            StringTokenizer st = new StringTokenizer(command);
            String cmd = st.nextToken();
        
            if(!cmd.equals("Leave"))
            {
                String id = st.nextToken();
                String nickName = st.nextToken();
                users.put(id, nickName);
            }
        }
        
        for (String command : record)
        {
            StringTokenizer st = new StringTokenizer(command);
            String cmd = st.nextToken();
            String id = st.nextToken();
            
            if(cmd.equals("Enter"))
            {
                message.add(users.get(id)+"님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                message.add(users.get(id)+"님이 나갔습니다.");
            }
        }
    
        return message.stream().toArray(String[]::new);
    }
}