package baekjoon_greedy_basic1;

import java.util.ArrayList;
import java.util.Scanner;

public class _1138_OneLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] nums = new int[input];
        ArrayList<Integer> order = new ArrayList<>();

        for(int i=0; i<input; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=input-1; i>=0; i--){
            order.add(nums[i], i+1);
        }

        for (Integer integer : order) {
            System.out.print(integer + " ");
        }
    }
}
