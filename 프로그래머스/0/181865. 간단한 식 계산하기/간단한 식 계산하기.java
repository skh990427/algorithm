class Solution {
    public int solution(String binomial) {
        String[] cmds = binomial.split(" ");
        int a = Integer.parseInt(cmds[0]);
        int b = Integer.parseInt(cmds[2]);
        switch(cmds[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return a * b;
        }
    }
}