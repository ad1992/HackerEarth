package collegeChallenges.code_IN_GBU;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Ricky gives a number 'n' to John. Now Ricky wants John to generate Z
 *         with symbol "*" such that it spans n rows.
 * 
 *         Example:
 * 
 *         Input : n=3
 * 
 *         Output :
 * 
 			*** 
 			 * 
 			*** 
 * 
 *         Input : n=4
 * 
 *         Output :
 * 
 			**** 
 			  * 
 			* 
 			**** 
 * 
 */
public class GenerateZ {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = n; i >= 1; i--) {

			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");

				}

			} else {
				for (int k = 1; k < i; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
			

		}

	}
}
