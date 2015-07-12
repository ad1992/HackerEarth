package collegeChallenges.codesteller_4_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         In vardhaman college of engineering, there is competition with name
 *         treasure lock. To make this competition the key for the lock should
 *         satisfy following rules. 1 .3, 5, or both as its digits. No other
 *         digit is allowed. 2. Number of times 3 appears is divisible by 5. 3.
 *         Number of times 5 appears is divisible by 3.
 * 
 *         Rakesh is very eager to win the championship. He is developing a code
 *         for that key.Assume yourself in that situation and solve for the key.
 * 
 *         INPUT: first line contains T testcases. Next T lines consists of the
 *         number. OUTPUT: Output the number satisfying the above conditions. if
 *         n cannot satisfy the above conditions print -1.
 * 
 *         0<t<10 0<n<1000
 * 
 */
public class The_treasure_lock {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times5 = 0, times3 = 0;
		int T = Integer.parseInt(br.readLine().trim());

		while (T-- > 0) {
			int len = Integer.parseInt(br.readLine().trim());
			StringBuilder ans = new StringBuilder();

			times3 = 5 * (2 * len % 3);
			times5 = len - times3;
			if (times5 < 0)
				System.out.println(-1);
			else {
				for (int i = 0; i < times5; i++)
					ans.append("5");
				for (int i = 0; i < times3; i++)
					ans.append("3");
				System.out.println(ans);

			}
		}

		;
	}

}
