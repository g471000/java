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
	 * Task Given an integer, , perform the following conditional
	 * actions:
	 * 
	 * If is odd, print Weird If is even and in the inclusive range of to ,
	 * print Not Weird If is even and in the inclusive range of to , print Weird
	 * If is even and greater than , print Not Weird
	 * 
	 * @param args
	 *            argument
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {


		}
		System.out.println(ans);

	}
}