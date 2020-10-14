package baekjoon_greedy_basic1;

import java.util.Scanner;

public class _1120_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int min = str[0].length();
		int temp = 0;

		if (str[0].length() == str[1].length()) {
			for (int i = 0; i < str[0].length(); i++) {
				if (str[0].charAt(i) != str[1].charAt(i)) {
					temp++;
				}
			}
			min = temp;
		} else {
			for (int i = 0; i < str[1].length() - str[0].length() + 1; i++) {
				for(int j = 0; j < str[0].length(); j++) {
					if(str[0].charAt(j) != str[1].charAt(i+j)) {
						temp++;
					}
				}
				if(temp < min) {
					min = temp;
				}
				temp = 0;
			}

		}
		
		System.out.println(min);

	}

}
