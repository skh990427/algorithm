import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i = 0 ; i < a.length() ; i++) {
            if(a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                result += (char) (a.charAt(i) + 32);
            } else {
                result += (char) (a.charAt(i) - 32);
            }
        }
        
        System.out.println(result);
    }
}