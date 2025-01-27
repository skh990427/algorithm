import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[20];
        int num = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String cmd = input.split(" ")[0];
            if (!cmd.equals("all") && !cmd.equals("empty")) {
                num = Integer.parseInt(input.split(" ")[1]);
            }

            if (cmd.equals("add")) {
                arr[num - 1] = true;
            } else if (cmd.equals("remove")) {
                arr[num - 1] = false;
            } else if (cmd.equals("check")) {
                if (arr[num - 1]) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (cmd.equals("toggle")) {
                if (arr[num - 1]) {
                    arr[num - 1] = false;
                } else {
                    arr[num - 1] = true;
                }
            } else if (cmd.equals("all")) {
                for (int j = 0; j < 20; j++) {
                    arr[j] = true;
                }
            } else if (cmd.equals("empty")) {
                for (int j = 0; j < 20; j++) {
                    arr[j] = false;
                }
            }
        }
        bw.flush();
    }
}
