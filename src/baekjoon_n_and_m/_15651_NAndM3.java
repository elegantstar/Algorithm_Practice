package baekjoon_n_and_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15651_NAndM3 {

    private static int n, m;
    private static int[] results;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        results = new int[m];

        DFS(0);
        System.out.println(output);
    }

    public static void DFS(int depth) {
        if (depth == m) {
            for (int result : results) {
                output.append(result).append(' ');
            }
            output.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            results[depth] = i + 1;
            DFS(depth + 1);
        }
    }
}