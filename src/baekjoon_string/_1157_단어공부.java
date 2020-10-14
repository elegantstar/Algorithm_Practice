package baekjoon_string;

import java.util.Scanner;

public class _1157_단어공부 {
// ���ڿ� - �ܾ� ����
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		char answer = solution(input);
		
		System.out.println(answer);
		
//		ArrayList<Character> alphabetList = new ArrayList<Character>();
//		char[] list = new char[input.length()];
//		
//		int count = 0;
//		char answer = 'a';
//		
//		for(int i=0; i<input.length(); i++) {
//			list[i] = input.charAt(i);	
//		}
//		
////		for(int i = 1; i < list.length; i++) {
////			char temp = list[i];
////			for(int j = i-1; j >= 0; j--) {
////				if(temp < list[j]) {
////					// �ؾ� �� �� (j��° ���� j+1�� �̵�) 
////					list[j+1] = list[j];
////					list[j] = temp;
////				} else {
////					break;
////				}
////			}
////		}
//		
//		Arrays.sort(list);
//		
//		for(int i = 0; i < list.length; i++) {
//			alphabetList.add(i, list[i]);
//		}
//		
//		for(int i=0; i < alphabetList.size(); i++) {
//			if(i<alphabetList.size()-1 && !alphabetList.get(i).equals(alphabetList.get(i+1))) {
//				if(count < alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1) {
//					count = alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1;
//					answer = alphabetList.get(i);
//				}
//				else if(count == alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1) {
//					answer = '?';
//				}
//			}
//			if(i == alphabetList.size()-1) {
//				if(count < alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1) {
//					count = alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1;
//					answer = alphabetList.get(i);
//				}
//				else if(count == alphabetList.lastIndexOf(alphabetList.get(i)) - alphabetList.indexOf(alphabetList.get(i)) + 1) {
//					answer = '?';
//				}
//			}
//		}
//		System.out.println(answer);
	}
	
	public static char solution(String str) {
		int[] counts = new int[26]; // 26�� ���� ����
		int count = 0;
		char answer = 'A';
		for(int i=0; i < str.length(); i++) {
			counts[str.charAt(i) - 'A'] += 1;
		}
		
		for(int i=0; i < counts.length; i++) {
			if(count < counts[i]) {
				count = counts[i];
				answer = (char) (i + 'A');
			}
			else if(count == counts[i]) {
				answer = '?';
			}
		}
		
		return answer;
	}
}
