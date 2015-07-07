package collegeChallenges.crazy_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Abhimanyu has magical function F(N):
 * 
 *         F(N) = Z(N + 2) / Z(N) Z(N) = N! N >= 1
 * 
 *         Now for two magical integers L and R (L <= R), he wants to find S:
 * 
 *         S = F(L) + F(L + 1) + .... + F(R - 1) + F(R)
 * 
 *         For an integer L, Abhimanyu defines two magical integers A and C:
 * 
 *         A = L3 + (2 x L2) + L C = L3 + (4 x L2) + (3 x L)
 * 
 *         For an integer R, Abhimanyu defines two magical integers X and Z:
 * 
 *         X = R3 + (4 x R2) + (10 x R) Z = R3 + (8 x R2) + (12 x R)
 * 
 *         You are given A, C, X and Z. Find the value of S.
 * 
 *         Input
 * 
 *         First line of input is an integer T, total number of test cases. Each
 *         of next T lines contains four space separated integers A, C, X and Z.
 * 
 *         Output
 * 
 *         Output the value of S in single line for each test case.
 * 
 */
public class Crazy_Function {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				long A=Long.parseLong(st.nextToken());
				long C=Long.parseLong(st.nextToken());
				long X=Long.parseLong(st.nextToken());
				long Z=Long.parseLong(st.nextToken());
				long L=(A+C)/2-6;
				long R=(Z+X)/2;
				long ans=(R-L)/3;
				out.println(ans);
				T--;
			}		

		}
		out.close();

	}
}