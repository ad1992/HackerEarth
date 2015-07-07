package hackerEarthChallenges.june_Easy_Challenge15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Today, N candies were placed on the table. At any point, for the
 *         purpose of clarity, let X represent the number of candies left on the
 *         table. Every day, at 9 PM, if the number of candies remaining is
 *         divisible by 2, the child will take exactly X/2 candies. Otherwise,
 *         he will take (X+1)/2 candies.
 * 
 *         In addition, every day at 10 PM, another child will come and take
 *         X//4, where the "//" here represents integer division. Please, find
 *         the number of candies left at 11 PM after T days have passed.
 * 
 *         Input: The first line contains one integer, Q, the number of test
 *         cases. The next Q lines contain two integers, N and T.
 * 
 *         Output: Output Q lines, the answer for each test case.
 * 
 */
public class Children_Love_Candies {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int Q=Integer.parseInt(br.readLine().trim());
		while(Q>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				long N=Long.parseLong(st.nextToken());
				int T=Integer.parseInt(st.nextToken());
				while(T-->0)
				{
					long taken=(N&1)==0?N/2:(N+1)/2;
					N-=taken;
					N-=N/4;
				}
				out.println(N);
				Q--;
			}
		}
		out.close();

	}

}
