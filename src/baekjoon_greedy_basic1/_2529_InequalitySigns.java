package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2529_InequalitySigns {

    private static int k;
    private static String[] inequalitySigns;
    private static int[] maxResult;
    private static int[] minResult;
    private static boolean[] visited;
    private static boolean isFound = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        k = Integer.parseInt(input);
        inequalitySigns = br.readLine().split(" ");

        maxResult = new int[k+1];
        minResult = new int[k+1];
        visited = new boolean[10];

        DFSMax(0);
        isFound = false;
        DFSMin(0);

        for(int i = 0; i < maxResult.length; i++){
            System.out.print(maxResult[i]);
        }
        System.out.println();
        for(int i = 0; i < minResult.length; i++){
            System.out.print(minResult[i]);
        }

    }

    public static void DFSMax(int depth){
        if(depth == k+1) {
            isFound = true;
            return;
        }

        for(int i = 9; i >= 0; i--){
            if(isFound) return;

            if(!visited[i]){
                maxResult[depth] = i;
                if(isRight(depth, maxResult)){
                    visited[i] = true;
                    DFSMax(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void DFSMin(int depth){
        if(depth == k+1) {
            isFound = true;
            return;
        }

        for(int i = 0; i < 10; i++){
            if(isFound) return;

            if(!visited[i]){
                minResult[depth] = i;
                if(isRight(depth, minResult)){
                    visited[i] = true;
                    DFSMin(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }


    public static boolean isRight(int depth, int[] result){
        if(depth == 0) return true;

        int right = result[depth];
        int left = result[depth-1];

        if(inequalitySigns[depth-1].equals(">")){
            return left > right;
        } else {
            return left < right;
        }
    }
}
