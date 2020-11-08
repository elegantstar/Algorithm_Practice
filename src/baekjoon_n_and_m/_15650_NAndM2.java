package baekjoon_n_and_m;

import java.io.*;
import java.util.StringTokenizer;


public class _15650_NAndM2 {
    private static int n, m;
    private static int[] results;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        results = new int[m];

        DFS(0, 1);
        System.out.println(output);

    }

    public static void DFS(int depth, int at) {
        if (depth == m) {
            for (int result : results) {
                output.append(result).append(' ');
            }
            output.append('\n');
            return;
        }

        for (int i = at; i <= n; i++) {
            results[depth] = i;
            DFS(depth + 1, i + 1);
        }

    }

}
