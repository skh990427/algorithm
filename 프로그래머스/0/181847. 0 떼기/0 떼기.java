class Solution {
    public String solution(String n_str) {
        String[] nums = n_str.split("");
        for(int i = 0 ; i < nums.length ; i++) {
            if(!nums[i].equals("0"))
                return n_str.substring(i);
        }
        return null;
    }
}