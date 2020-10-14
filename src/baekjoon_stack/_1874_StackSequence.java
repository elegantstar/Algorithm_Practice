package baekjoon_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874_StackSequence {

	public static void main(String[] args) throws IOException {
		// push x 4 --> stack = [1, 2, 3, 4] --> result = + + + +
		// pop x 2 --> stack = [1, 2] & sequence = [4, 3] --> result = + + + + - -
		// push x 2 --> stack = [1, 2, 5, 6] & sequence = [4, 3] --> result = + + + + - - + +
		// pop x 1 --> stack = [1, 2, 5] & sequence = [4, 3, 6] --> result = + + + + - - + + -
		
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine()); // input = n
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer results = new StringBuffer();
		int num = 1;

		for(int i=0; i < input; i++) {
			int value = Integer.parseInt(br.readLine());
			// num이 value보다 작으면 같아질 때까지 push하고
			// num이 value보다 크면 pop, pop 결과 == value이면 계속, pop 결과 != value이면 종료 후 NO 출력
			while(num <= value) {
				stack.push(num);
				num++;
				results.append("+\n");
			}

			if(num > value && stack.peek() == value) {
				stack.pop();
				results.append("-\n");
			}
			else if(num > value && stack.peek() != value) {
				break;
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(results);
		} else {
			System.out.println("NO");
		}
		
	}

}