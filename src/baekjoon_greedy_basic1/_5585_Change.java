package baekjoon_greedy_basic1;

import java.util.Scanner;

public class _5585_Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] change = {500, 100, 50, 10, 5, 1};
		
		int value = 1000 - input;
		int result = 0;
		
		for(int i=0; i<change.length; i++) {
			if(value/change[i] == 0) {
				continue;
			} else {
				result += value/change[i];
				value = value % change[i];
			}
		}
		
		System.out.println(result);
	}

}
