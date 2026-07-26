import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        int range = 'a' - 'A';
        
        for(int i = 0 ; i < a.length() ; i++) {
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                result += (char) (a.charAt(i) + range);
            } else {
                result += (char) (a.charAt(i) - range);
            }
        }
        
        System.out.println(result);
    }
}