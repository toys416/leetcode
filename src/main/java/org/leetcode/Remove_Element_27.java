package org.leetcode;


public class Remove_Element_27 {

	public static int removeElement(int[] A, int val) {
		int len=A.length;
		for(int i=0;i<len;i++){
			while (A[i]==val&&i<len){
				A[i]=A[--len];
			}
		}
		return len;
	}

	// The basic idea is when elem is found at index i,
	// let A[i] = the last element in the modifying array, then repeat searching
	// until elem is not found.
	public static int removeElement_good(int[] A, int elem) {
		int len = A.length;
		for (int i = 0; i < len; ++i) {
			while (A[i] == elem && i < len) {
				A[i] = A[--len];
			}
		}
		return len;
	}

	// When nums[j]nums[j] equals to the given value, skip this element by
	// incrementing jj.
	// As long as nums[j] \neq valnums[j]≠val, we copy nums[j]nums[j] to
	// nums[i]nums[i] and increment both indexes at the same time.
	// Repeat the process until jj reaches the end of the array and the new
	// length is ii.
	public int removeElement_good2(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String args[]) {
		int a[] = { 3, 2, 2, 5, 3, 4 };
		int b = removeElement_good(a, 3);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print(b);

	}

}
