package baekjoon_for;

import java.io.*;
import java.util.StringTokenizer;

public class _10871_TheNumberSmallerThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int a;
        StringTokenizer nums = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            a = Integer.parseInt(nums.nextToken());
            if(a < x){
                bw.write(a + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
