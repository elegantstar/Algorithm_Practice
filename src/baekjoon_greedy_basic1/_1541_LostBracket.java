package baekjoon_greedy_basic1;

import java.util.Scanner;

public class _1541_LostBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] nums = input.split("-");
		int min = 0;
		int positive = 0;
		int negative = 0;
		
		String[] numSet1 = nums[0].split("\\+");
		for(int i = 0; i < numSet1.length; i++) {
			positive += Integer.parseInt(numSet1[i]);
		}
		
		for(int i = 1; i < nums.length; i++) {
			String[] numSet2 = nums[i].split("\\+");
			for(int j = 0; j < numSet2.length; j++) {
				negative += Integer.parseInt(numSet2[j]);
			}
		}
		
		min = positive - negative;
		System.out.println(min);
	}
}
