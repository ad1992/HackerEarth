package collegeChallenges.crazy_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Abhimanyu decided to smoke C(N) cigarettes each day:
 * 
 *         F(N) = 34N + (30 x N) + 32 C(N) = F(N) mod (11), where x mod (y) is
 *         the remainder obtained by diving x by y.
 * 
 *         But Abhimanyu's girlfriend wants that he doesn't smoke any cigarette,
 *         so she made modifications:
 * 
 *         F(N) = 34N + (30 x N) + (32 + M) C(N) = F(N) mod (11)
 * 
 * 
 * 
 */
public class Crazy_Smoker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine().trim());
			long ans=(11-((8*N)%11))%11;
			out.println(ans);
		}
		out.close();

	}
}