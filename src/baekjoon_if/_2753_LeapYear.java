package baekjoon_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2753_LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        if(n%4 == 0 && n%100 != 0) {
            System.out.println(1);
        } else if(n%400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
