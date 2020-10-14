package baekjoon_string;

import java.util.ArrayList;
import java.util.Scanner;

public class _10809_알파벳찾기{
//���ڿ� - ���ĺ� ã��

	private static final int ALPHABET_COUNT = 26;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder answer = new StringBuilder();
		String word = sc.next();
		ArrayList<Character> wordList = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			wordList.add(i, word.charAt(i));
		}

		for (int i = 0; i < ALPHABET_COUNT; i++) {
			char ch = (char) (i + 'a');

//			if (0 < i && i < 26) {
//				System.out.print(" ");
//			}
//			if (wordList.contains(ch)) {
//				System.out.print(wordList.indexOf(ch));
//			} else {
//				System.out.print(-1);
//			}
			
			if (wordList.contains(ch)) {
				answer.append(wordList.indexOf(ch) + " ");
			} else {
				answer.append("-1 ");
			}
		}
		System.out.println(answer.toString().trim());
		
	}

}
