package baekjoon_for;

import java.io.*;
import java.util.StringTokenizer;

public class _11022_APlusB8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a;
        int b;
        int sum;

        for(int i = 1; i < t+1; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
