package collegeChallenges.codeX5_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Ramesh and Suresh had a draw yet again! I know it is very
 *         frustrating, they are tired of all this too and want to determine who
 *         is smarter too. But after two such draws and no answer, they have
 *         lost their faith in the Mathematics professor. They have approached
 *         the Computer Science professor this time.
 * 
 *         The CS professor is quite a young one and a competitive coder by
 *         night. He had just the right question for them. It was the one he
 *         used as a tie-breaker in a similar situation during his college and
 *         was confident that I would surely do the trick. The question goes
 *         like this:
 * 
 *         The problem is to verify whether the method they are using to read
 *         input data is sufficiently fast to handle problems branded with the
 *         enormous Input/Output warning. They are expected to be able to
 *         process at least 2.5MB of input data per second at runtime.
 * 
 *         The professor likes laptop stickers. All his stickers are rectangular
 *         in shape. Since he has less space on his laptop, he likes to stick
 *         only the stickers whose length is less than 3*10^8 nm. Since he is
 *         running short of time, he asks them the number of stickers he will be
 *         able to put on his laptop. This way, he can get his work done and
 *         also break the tie between them.
 * 
 *         Input: The input begins with a positive integer N (N<=10^9). The next
 *         line of input contains N space-separated, positive integers, not
 *         greater than 10^10 each. Ti is the length of ith sticker in
 *         nanometres.
 * 
 *         Output: Print the answer.
 * 
 */
public class The_Faster_The_Smarter {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		long N=Long.parseLong(br.readLine().trim());
		s=br.readLine();
		st=new StringTokenizer(s);
		long c=0;
		while(N-->0)
		{
			long num=Long.parseLong(st.nextToken());
			if(num<300000000)
			{
				c++;
			}
		}
		out.print(c);
		out.close();
		

	}

}
