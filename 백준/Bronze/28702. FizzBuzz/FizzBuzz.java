import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("-?\\d+(\\.\\d+)?")) { // 문자열 매치 숫자 정규식
                int n = Integer.parseInt(arr[i]) + 3 - i;
                if (n % 3 == 0) {
                    if (n % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else {
                    if(n % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(n);
                    }
                }
                break;
            }
        }
    }
}
