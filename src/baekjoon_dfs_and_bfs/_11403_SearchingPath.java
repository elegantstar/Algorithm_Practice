package baekjoon_dfs_and_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _11403_SearchingPath {
    private static int n;
    private static int[][] edges;
    private static StringTokenizer st;
    private static int[][] results;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        edges = new int[n][n];
        results = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                edges[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {

            List<Integer> connectedNodes = BFS(i); // [0,1,3]
            for (Integer connectedNode : connectedNodes) {
                results[i][connectedNode] = 1;
            }

            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(results[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> BFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        queue.add(x);

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            for (int i = 0; i < n; i++) {
                if (edges[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    nums.add(i);
                }
            }
        }
        return nums;

    }
}
