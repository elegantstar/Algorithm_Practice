package baekjoon_string;

import java.util.Scanner;

public class _2675_문자열반복 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine(); // str = {number1 String1, number2 String2}
		}

		for (int j = 0; j < str.length; j++) {
			String[] strSplit = str[j].split(" ");
			int num = Integer.parseInt(strSplit[0]);
			for (int k = 0; k < strSplit[1].length(); k++) {
				for (int l = 0; l < num; l++) {
					System.out.print(strSplit[1].charAt(k));
				}
			}
			System.out.println();

		}

	}

}
