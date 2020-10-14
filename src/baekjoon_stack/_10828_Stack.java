package baekjoon_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10828_Stack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		int[] stack = new int[10000];
		int size = 0;

		for(int i=0; i < num; i++) {
			String[] strSplit = br.readLine().split(" ");
			String str = strSplit[0];
			
			if(str.equals("push")) {
				stack[size++] = Integer.parseInt(strSplit[1]);
			}
			else if(str.equals("top")) {
				if(size != 0) {
					System.out.println(stack[size-1]);
				} else {
					System.out.println(-1);
				}
			}
			else if(str.equals("size")) {
				System.out.println(size);
			}
			else if(str.equals("empty")) {
				if(size == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			else if(str.equals("pop")) {
				if(size == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack[size-1]);
					size--;
				}
			}
		}
	}
	
}
