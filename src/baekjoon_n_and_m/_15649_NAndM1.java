package baekjoon_n_and_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _15649_NAndM1 {
    private static int n;
    private static int m;
    private static boolean visited[];
    private static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        visited = new boolean[n];

        result = new int[m];



        DFS(0);
    }

    public static void DFS(int depth){
        if(depth == m){
            String output = Arrays.toString(result);
            output = output.substring(1, output.length()-1);
            output = output.replaceAll(",", "");
            System.out.println(output);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                result[depth] = i+1;
                visited[i] = true;
                DFS(depth+1);
                visited[i] = false;
            }
        }
    }
}
