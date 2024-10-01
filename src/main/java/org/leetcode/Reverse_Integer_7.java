package org.leetcode;

public class Reverse_Integer_7 {
	public static int reverse_mine(int x) {
		String string_x = String.valueOf(x);
		char[] chars = string_x.toCharArray();
		int length = chars.length;
		char[] output = new char[length];

		for (int i = 0; i < length; i++) {
			output[i] = chars[length - 1 - i];
		}
		String out_x = String.valueOf(output);
		return Integer.parseInt(out_x);
	}

	
	public static int reverse_good(int x) {
		long answer = 0;
		while (x != 0) {
			answer = 10 * answer + x % 10;
			x=x/10;
		}
		return (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) ? 0 : (int) answer;

	}

	public static void main(String args[]) {
//		int output = reverse_mine(321);
//		System.out.println(output);
		
		int output_good = reverse_good(-4321);
		System.out.println(output_good);
		
	}

}
