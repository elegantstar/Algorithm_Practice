package baekjoon_for;

import java.io.*;

public class _2741_PuttingN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n+1; i++){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
