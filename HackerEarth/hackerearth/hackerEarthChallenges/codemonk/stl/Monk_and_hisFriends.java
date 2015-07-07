package hackerEarthChallenges.codemonk.stl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi Monk is standing at the door of his classroom. There
 *         are currently N students in the class, i'th student got Ai candies.
 *         There are still M more students to come. At every instant, a student
 *         enters the class and wishes to be seated with a student who has
 *         exactly the same number of candies. For each student, Monk shouts YES
 *         if such a student is found, NO otherwise.
 * 
 *         Input: First line contains an integer T. T test cases follow. First
 *         line of each case contains two space-separated integers N and M.
 *         Second line contains N + M space-separated integers, the candies of
 *         the students.
 * 
 *         Output: For each test case, output M new line, Monk's answer to the M
 *         students. Print "YES" (without the quotes) or "NO" (without the
 *         quotes) pertaining to the Monk's answer.
 * 
 * 
 */
public class Monk_and_hisFriends {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int N = Integer.parseInt(st.nextToken());
				int M = Integer.parseInt(st.nextToken());
				Set<Long> arr = new HashSet<Long>();
				StringBuilder ans = new StringBuilder();

				if ((s = br.readLine().trim()) != null) {
					st = new StringTokenizer(s);
					for (int i = 0; i < N; i++) {
						long num = Long.parseLong(st.nextToken());
						arr.add(num);
					}
					for (int i = 0; i < M; i++) {
						long num = Long.parseLong(st.nextToken());
						if (arr.contains(num)) {

							ans.append("YES\n");
						} else {
							arr.add(num);
							ans.append("NO\n");
						}

					}
					out.print(ans);
					T--;
				}
			}
		}
		out.close();

	}

}
