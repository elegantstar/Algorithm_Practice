package baekjoon_for;

import java.io.*;

public class _2742_ReversePuttingN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = n; i > 0; i--) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
