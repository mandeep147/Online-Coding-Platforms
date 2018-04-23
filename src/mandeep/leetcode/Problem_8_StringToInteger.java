/**
 * 8. String to Integer (atoi)
 * 
 * Implement atoi to convert a string to an integer.
 */
package mandeep.leetcode;

/**
 * @author mandeep
 *
 *The following cases should be considered for this problem:
 * 1. null or empty string
 * 2. white spaces
 * 3. +/- sign
 * 4. calculate real value
 * 5. handle min & max
 */
public class Problem_8_StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "123";
		System.out.println("Integer: " + atoi(s));
	}

	/**
	 * @param s
	 * @return
	 */
	private static int atoi(String s) {
		if(s == null || s.length() < 1)
			return 0;
		
		s = s.trim();
		
		char flag = '+';
		int i = 0;
		if(s.charAt(0) == '-'){
			flag = '-';
			i++;
		}else if(s.charAt(0) == '+'){
			i++;
		}
		
		double res = 0;
		while(s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
			res = res * 10 + (s.charAt(i) - '0');
			i++;
		}
		
		if(flag == '-')
			res = -res;
		
		if(res > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		if(res < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) res;
	}

}