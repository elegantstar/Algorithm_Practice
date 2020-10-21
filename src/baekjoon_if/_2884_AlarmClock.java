package baekjoon_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2884_AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        if(minute >= 45){
            System.out.print(hour + " " + (minute-45));
        } else if(minute < 45 && hour != 0) {
            System.out.println((hour-1) + " " + (60+minute-45));
        } else {
            System.out.println(23 + " " + (60+minute-45));
        }
    }
}
