package baekjoon_string;

import java.util.Scanner;

public class _2941_크로아티아알파벳 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		
		for(int i=0; i<word.length(); i++) {
			count++;
			if(i < word.length() -1 && word.charAt(i) == 'c' && word.charAt(i+1) == '=') {
				i++;
			}
			else if(i < word.length() -1 && word.charAt(i) == 'c' && word.charAt(i+1) == '-') {
				i++;
			}
			else if(i < word.length() -2 && word.charAt(i) == 'd' && word.charAt(i+1) == 'z' && word.charAt(i+2) == '=') {
				i = i +2;
			}
			else if(i < word.length() -1 && word.charAt(i) == 'd' && word.charAt(i+1) == '-') {
				i++;
			}
			else if(i < word.length() -1 && word.charAt(i) == 'l' && word.charAt(i+1) == 'j') {
				i++;
			}
			else if(i < word.length() -1 && word.charAt(i) == 'n' && word.charAt(i+1) == 'j') {
				i++;
			}
			else if(i < word.length() -1 && word.charAt(i) == 's' && word.charAt(i+1) == '=') {
				i++;
			}
			else if(i < word.length() -1 && word.charAt(i) == 'z' && word.charAt(i+1) == '=') {
				i++;
			}
		}
		
		
		
		System.out.println(count);
		
	}

}
