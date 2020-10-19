package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2217_Ropes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        int maxWeight = 0;

        for(int i = 0; i < n; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        for(int i = 0; i < n; i++){
            if(maxWeight < ropes[i]*(n-i)){
                maxWeight = ropes[i]*(n-i);
            }
        }

        System.out.println(maxWeight);
    }
}
