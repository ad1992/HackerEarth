package collegeChallenges.codesteller_4_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Aakansha Doshi
 * 
 *         find the sum of the even fibonacci numbers till the given number(it
 *         is the value not index). INPUT: T test cases next T lines consists of
 *         a number n. OUTPUT: Output the sum value.
 * 
 *         0<t<10 2<n<10^20 Example: if n=10 the numbers which are less than 10
 *         are 2 and 8 in fibonacci. sum = 2+8=10
 * 
 * 
 */
public class Fun_with_fibonacci {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		while (T-- > 0) {
			BigInteger num = new BigInteger(br.readLine());
			BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, sum = BigInteger.ZERO;
			BigInteger m = new BigInteger("2");
			BigInteger c = a.add(b);
			while (c.compareTo(num) < 0) {
				BigInteger rem = c.mod(m);
				if (rem.compareTo(BigInteger.ZERO) == 0) {
					sum = sum.add(c);
				}
				a = b;
				b = c;
				c = a.add(b);
			}
			System.out.println(sum);
		}

	}

}
