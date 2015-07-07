package hackerEarthChallenges.rate_and_floor_Hiring__Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * @author Aakansha Doshi
 * 
 *         Chandan is an extremely biased person, and he dislikes people who
 *         fail to solve all the problems in the interview he takes for hiring
 *         people. There are n people on a day who came to be interviewed by
 *         Chandan.
 * 
 *         Chandan rates every candidate from 0 to 10. He has to output the
 *         total ratings of all the people who came in a day. But, here's the
 *         problem: Chandan gets extremely frustrated when someone ends up
 *         scoring a 0 in the interview. So in frustration he ends up removing
 *         the candidate who scored that 0, and also removes the candidate who
 *         came before him. If there is no candidate before the one who scores a
 *         0, he does nothing.
 * 
 *         You've to find the summation of all the ratings in a day for Chandan.
 * 
 *         Input constraints: The first line of input will contain an integer —
 *         n. The next n lines will contain an integer, where the ith integer
 *         represents the rating of the ith person.
 * 
 *         Output constraints: Print the required sum.
 * 
 */
public class Biased_Chandan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine().trim());
		Stack<Integer> st=new Stack<>();
		while(n-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			if(num==0&&!st.isEmpty())
			{
				st.pop();
			}
			else
			{
				st.push(num);
			}
			
		}
		int sum=0;
		for(int i:st)
		{
			sum+=i;
		}
		out.println(sum);
		out.close();

	}

}
