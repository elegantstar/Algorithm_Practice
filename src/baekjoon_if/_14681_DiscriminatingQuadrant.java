package baekjoon_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14681_DiscriminatingQuadrant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        if(a>0 && b>0){
            System.out.println(1);
        } else if(a<0 && b>0) {
            System.out.println(2);
        } else if(a<0 && b<0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
