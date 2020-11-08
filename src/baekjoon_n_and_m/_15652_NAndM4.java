package baekjoon_n_and_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _15652_NAndM4 {

    private static int n, m;
    private static int[] results;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        results = new int[m];

        DFS(0, 0);
        System.out.println(output);
    }

    public static void DFS(int depth, int at) {

        if (depth == m) {
            Arrays.stream(results).asLongStream()
                    .forEach(result -> output.append(result).append(' '));
            output.append('\n');
            return;
        }

        for (int i = at; i < n; i++) {
            results[depth] = i + 1;
            DFS(depth + 1, i);
        }
    }

}
