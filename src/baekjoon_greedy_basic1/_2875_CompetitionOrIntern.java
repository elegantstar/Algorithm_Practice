package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2875_CompetitionOrIntern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int result = 0;

        int[] team = new int[2];
        for(int i = 0; i < m+1; i++){
            team[0] = 2*i;
            team[1] = i;
            // 팀을 만들 수 있는 조건 : n >= team[0] && m >= team[1]

            // 팀이 불가능한 경우에는 continue
            if(n < team[0] || m < team[1]){
                continue;
            }
            if(n-team[0] + m-team[1] >= k){
                result = i;
            }
        }
        System.out.println(result);
    }
}