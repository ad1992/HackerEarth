package collegeChallenges.code_IN_GBU;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         John designs the following lower triangular matrix :
 * 
 *         1 0 0 0 0 0 ... 2 2 0 0 0 0 ... 3 3 3 0 0 0 ... 4 4 4 4 0 0 ... 5 5 5
 *         5 5 0 ... 6 6 6 6 6 6 ... and so on ...
 * 
 *         He represented this matrix as [R , C] , where R is the number of rows
 *         and C is the number of columns in the matrix.
 * 
 *         Now he provides any random R and C to Ricky and asks him to tell the
 *         count of even and odd numbers in the matrix respectively.
 * 
 *         Note: 0 is neither even nor odd.
 * 
 *         Input:
 * 
 *         First line contains number of test cases T.Each test case contains
 *         two integers R and C.
 * 
 *         Output
 * 
 *         For each test case print count of even and odd numbers in matrix
 *         [R,C].
 * 
 */
public class Countplusplus {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String s;
		StringTokenizer st;
		while (T-- > 0) {
			if ((s = br.readLine()) != null) {
				st = new StringTokenizer(s);
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				long odd;
				long even;
				odd = even = 0;
				for (int i = 1; i <= r; i++) {
					if (i % 2 == 0) {
						if (i > c) {
							even += c;
						} else {
							even += i;
						}
					} else {
						if (i > c) {
							odd += c;
						} else {
							odd += i;
						}
					}
				}
				System.out.println(even + " " + odd);
			}
		}

	}
}
