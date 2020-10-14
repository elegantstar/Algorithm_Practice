package baekjoon_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class _1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int answer = 0;
		ArrayList<String> strList = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			strList.add(sc.next());
		}
		
		// for(String word : strList){} 향상된 for문 활용
		
		for (int i = 0; i < num; i++) {
			// happy
			String word = strList.get(i);
			HashSet<Character> set = new HashSet<>();
			boolean isGroupWord = true;

			for (int j = 0; j < word.length(); j++) { // [h, a, p, p, y]
				char ch = word.charAt(j); // ch = h
				if (!set.contains(ch)) {
					set.add(ch); // set = {h}
					continue;
				}
				if (set.contains(ch) && ch != word.charAt(j - 1)) {
					isGroupWord = false;
					break;
				}
			}

			if (isGroupWord) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}
