package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11047_Coin0 {
// 1. 가장 큰 단위부터 목표 금액(value)을 나누고 몫이 0이면 다음 단위로...
// 2. 몫이 0이면, result에 몫을 더하고 value = 나머지로 한다.
// 3. 다시 작은 단위로 value를 나눈다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int count = Integer.parseInt(input[0]);
		int value = Integer.parseInt(input[1]);
		int[] coins = new int[count];
		int result = 0;
		
		for(int i=0; i<count; i++) {
			coins[count-1-i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<coins.length; i++) {
			if(value/coins[i] == 0) {
				continue;
			} else {
				result += value/coins[i];
				value = value % coins[i];
			}
		}
		
		System.out.println(result);
	}

}
