package hackerEarthChallenges.practo_hiring_challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Stannis borathean is attacking kings landing from three gates.To
 *         defend the city Tyrion again comes up with a fair solution. Tyrion
 *         has N soldier troops with given strengths. Tyrion wants to divide
 *         army into 3 sets such that the sum of strengths in these three sets
 *         are as equal as possible. In other words he wants to make three sums
 *         S1, S2 and S3 using all troops with constraint that S1 ≥ S2 ≥ S3 and
 *         S1 is as less as possible.
 * 
 */
class DivideintoThree {
	public static void main(String args[]) throws Exception {

		// Read input from stdin and provide input before running

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			sum = sum + num;

		}
		long s = Math.round((sum / 3));
		double left = sum - s;
		long s1 = Math.round((left / 2));
		long ans = (long) Math.max(s, s1);
		System.out.println(ans);

	}
}
