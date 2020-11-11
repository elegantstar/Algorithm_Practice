package baekjoon_n_and_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15657_NAndM8 {
    private static int n, m;
    private static int[] input;
    private static int[] results;
    private static StringTokenizer st;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        input = new int[n];
        results = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        DFS(0, 0);
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

        for (int i = at; i < n; i++) {
            results[depth] = input[i];
            DFS(depth + 1, i);
        }
    }
}
