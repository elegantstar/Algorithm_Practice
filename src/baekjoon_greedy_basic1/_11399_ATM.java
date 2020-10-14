package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11399_ATM {

	public static void main(String[] args) throws IOException {

		// 1. 오름차순 정렬
		// 2. 순차적으로 N, N-1, N-2, ..., 2, 1을 곱하고 합산
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] nums = new int[input];
		String[] str = br.readLine().split(" ");
		int result = 0;
		int times = input;
		
		for(int i=0; i<str.length; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			result += times*nums[i];
			times--;
		}
		
		System.out.println(result);
	}

}