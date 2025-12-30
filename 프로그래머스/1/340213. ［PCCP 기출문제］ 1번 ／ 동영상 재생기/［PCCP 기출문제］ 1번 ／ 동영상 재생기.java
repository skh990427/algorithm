class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int totalTime = Integer.valueOf(video_len.substring(0,2)) * 60 + Integer.valueOf(video_len.substring(3,5));;
        int posTime = Integer.valueOf(pos.substring(0,2)) * 60 + Integer.valueOf(pos.substring(3,5));
        int opStartTime = Integer.valueOf(op_start.substring(0,2)) * 60 + Integer.valueOf(op_start.substring(3,5));
        int opEndTime = Integer.valueOf(op_end.substring(0,2)) * 60 + Integer.valueOf(op_end.substring(3,5));
        
        if(opStartTime <= posTime && posTime <= opEndTime) posTime = opEndTime;
        
        for(String cmd : commands) {
            switch(cmd) {
                case "prev":
                    if(posTime < 10) posTime = 0;
                    else posTime -= 10;
                    
                    if(opStartTime <= posTime && posTime <= opEndTime) posTime = opEndTime;
                    break;
                case "next":
                    if(posTime > totalTime - 10) posTime = totalTime;
                    else posTime += 10;
                    
                    if(opStartTime <= posTime && posTime <= opEndTime) posTime = opEndTime;
                    break;
            }
        }
        
        return String.format("%02d:%02d", posTime/60, posTime%60);
    }
}