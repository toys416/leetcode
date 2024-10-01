package org.leetcode;

import java.util.HashMap;
import java.util.Map;


/*A simple implementation uses two iterations. In the first iteration, we add each element's value and its index to the table. 
 * Then, in the second iteration we check if each element's complement (target - nums[i]target−nums[i]) exists in the table. 
 * Beware that the complement must not be nums[i]nums[i] itself!
 */
public class Tow_Sum_1 {
	public static int[] twoSum_good1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/*
	 * It turns out we can do it in one-pass. While we iterate and inserting
	 * elements into the table, we also look back to check if current element's
	 * complement already exists in the table. If it exists, we have found a
	 * solution and return immediately.
	 */
	public static int[] twoSum_good2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String args[]) {

		int[] output = twoSum_good1(new int[] { 2, 7, 11, 19 }, 9);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}

	}

}
