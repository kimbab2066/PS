package LEET;

public class RomanToInteger {
	public static void main(String[] args) {
		String s = "LVIII";
		System.out.println(Solution.romanToInt(s));
	}// end of main
}// end of class

class Solution {
	public static int romanToInt(String s) {
		int result = 0, yab = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			switch (ch) {
			case 'I':
				result = 1;
				break;
			case 'V':
				result = 5;
				break;
			case 'X':
				result = 10;
				break;
			case 'L':
				result = 50;
				break;
			case 'C':
				result = 100;
				break;
			case 'D':
				result = 500;
				break;
			case 'M':
				result = 1000;
				break;
			}// end of switch
			if (4 * result < yab)
				yab -= result;
			else
				yab += result;
		} // end of for
		return yab;
	}
}