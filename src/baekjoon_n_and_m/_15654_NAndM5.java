package baekjoon_n_and_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15654_NAndM5 {
    private static int n, m;
    private static boolean[] visited;
    private static int[] input;
    private static int[] results;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        results = new int[m];
        visited = new boolean[n];

        input = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

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
            if(!visited[i]) {
                results[depth] = input[i];
                visited[i] = true;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}