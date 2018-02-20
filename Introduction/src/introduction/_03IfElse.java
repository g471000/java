package introduction;

/**
 * 
 * @author Jieun Chon
 * @version Feb 19, 2018 10:14:42 PM
 *
 */

import java.util.*;

public class _03IfElse {

	/**
	 * 1 <= n <= 100
	 * 
	 * Task Given an integer, , perform the following conditional actions:
	 * 
	 * If is odd, print Weird
	 * 
	 * If is even and in the inclusive range of 6 to 20, print Weird. Otherwise,
	 * print Not Weird
	 * 
	 * @param args
	 *            argument
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n >= 6 && n <= 20) {
				ans = "Weird";
			} else {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);

	}
}