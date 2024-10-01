package org.leetcode;

public class Remove_Duplicates_from_Sorted_Array_26 {
	public static int removeDuplicates(int[] num) {
		int i=0;
		for (int j=1;i<num.length;j++){
			if(num[j]!=num[i]){
				i++;
				num[i]=num[j];
			}
		}
		return i+1;

	}
	
/*
 Since the array is already sorted, we can keep two pointers ii and jj, where ii is the slow-runner while jj is the fast-runner. 
 As long as nums[i] = nums[j]nums[i]=nums[j], we increment jj to skip the duplicate.

When we encounter nums[j] \neq nums[i]nums[j]≠nums[i], the duplicate run has ended so we must copy its value to nums[i + 1]nums[i+1]. 
i is then incremented and we repeat the same process again until jj reaches the end of array.
 */
	public static int removeDuplicates_good(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	
	public static void main(String args[]) {
		int a[] = { 1,1,2 };
		int b = removeDuplicates_good(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print(b);

	}
}
