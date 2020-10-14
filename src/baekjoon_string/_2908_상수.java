package baekjoon_string;

import java.util.Scanner;

public class _2908_상수 {
// ���ڿ� - ���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		String num1 = "";
		String num2 = "";
		
		for(int i=2; i>=0; i--) {
			num1 += nums[0].charAt(i);
		}
		for(int i=2; i>=0; i--) {
			num2 += nums[1].charAt(i);
		}
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		if(n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}
}
