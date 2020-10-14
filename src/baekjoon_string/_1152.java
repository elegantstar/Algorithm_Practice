package baekjoon_string;

import java.util.Scanner;

public class _1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().trim();
		String[] words = sentence.split(" ");		
		int answer = sentence.equals("") ? 0 : words.length;
		
		System.out.println(answer);
		
		sc.close();
		
		
		
	}

}
