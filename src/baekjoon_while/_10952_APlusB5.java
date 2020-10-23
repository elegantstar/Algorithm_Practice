package baekjoon_while;

import java.io.*;

public class _10952_APlusB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb= new StringBuilder();
        int a;
        int b;

        while(true){
            String str = br.readLine();
            a = str.charAt(0) - '0';
            b = str.charAt(2) - '0';
            if(a == 0 && b == 0){
                break;
            }
            sb.append(a+b).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
