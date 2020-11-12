package baekjoon_dfs_and_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1260_DFSAndBFS {
    private static int n, m, v;
    private static StringTokenizer st;
    private static List<LinkedList<Integer>> edges;
    private static boolean[] visited;
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken()) -1;

        edges = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            edges.add(new LinkedList<>());
        }

        visited = new boolean[n];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges.get(a-1).add(b-1);
            edges.get(b-1).add(a-1);
        }

        for(int i = 0; i < n; i++) Collections.sort(edges.get(i));


        DFS(v);
        System.out.println(output);

        visited = new boolean[n];
        output = new StringBuilder();

        BFS(v);
        System.out.println(output);

    }

    public static void DFS(int x) {
        LinkedList<Integer> linkedList = edges.get(x);
        visited[x] = true;
        output.append(x+1).append(" ");

        for(int u : linkedList) {
            if(!visited[u]) {
                visited[u] = true;
                DFS(u);
            }
        }
    }


    public static void BFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;
        output.append(x+1).append(" ");

        while (!queue.isEmpty()) {
            int point = queue.poll();
            LinkedList<Integer> linkedList = edges.get(point);

            for(Integer nextPoint : linkedList) {
                if(!visited[nextPoint]) {
                    queue.add(nextPoint);
                    visited[nextPoint] = true;
                    output.append(nextPoint+1).append(" ");
                }
            }

        }

    }
}