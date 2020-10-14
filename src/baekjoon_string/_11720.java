package baekjoon_string;

import java.util.Scanner;

public class _11720 {
// 문자열 - 숫자의 합
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int answer = 0;

		
		String str = sc.next();
		char[] chars = str.toCharArray();
		for(int i=0; i<num; i++) {
			answer += chars[i] - '0';
		}
		
		System.out.println(answer);
	}

}
