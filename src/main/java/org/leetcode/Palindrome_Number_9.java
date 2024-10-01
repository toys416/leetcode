package org.leetcode;

public class Palindrome_Number_9 {
	public static boolean isPalindrome(int x) {
		int pre = x;
		long output = 0;
		while (x != 0) {
			output = output * 10 + x % 10;
			x = x / 10;
		}

		if (output == pre)
			return true;
		return false;
	}

	  public static boolean isPalindrome_good(int x) {
	        if(x<0) return false;
	        int pre=x;
	        int after=0;
	        while(x!=0){
	            after=after*10+x%10;
	            x=x/10;
	        }
	        if(pre==after) return true;
	        return false;
	    }


	public static void main(String args[]) {
		int a = 12321;
		boolean b = isPalindrome_good(a);
		// int b = isPalindrome_old(a);
		System.out.print(b);

	}

}
