package org.leetcode;

public class Implement_strStr_28 {

	public static int strStr(String haystack, String needle) {
		int l1=haystack.length();
		int l2=needle.length();
		for(int i=0;i<l1-l2+1;i++){
			int count =0 ;
			while(count<l2&&haystack.charAt(count+i)==needle.charAt(count)){
				count++;
			}
			if(count==l2)
				return i;
		}
		return -1;

	}

	public static int strStr_good(String haystack, String needle) {
		int l1 = haystack.length();
		int l2 = needle.length();

		for (int i = 0; i < l1 - l2 + 1; i++) {
			int count = 0;
			while (count < l2 && haystack.charAt(i + count) == needle.charAt(count)) {
				count++;
			}
			if (count == l2)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {

		String hayString = "acabd";
		String needleString = "ab";
		System.out.print(strStr(hayString, needleString));
	}
}
