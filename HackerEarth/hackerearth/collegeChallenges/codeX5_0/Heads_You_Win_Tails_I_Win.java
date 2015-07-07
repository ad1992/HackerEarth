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
 *         Ramesh and Suresh's previous attempt to decide who is smarter of them
 *         turned out to be indecisive. There was a tie in that too. Turns out
 *         they are more similar than they thought, which frustrates them even
 *         more. They are now very desperate to find out which one of them is
 *         smarter and so they have asked the Mathematics professor yet again to
 *         help them come to a conclusion.
 * 
 *         The Mathematics Professor is full of puzzles and problems and he
 *         already has one in mind for them. It's a game of flipping the coins.
 *         It's actually very simple. But this time they both have to do it on a
 *         computer. Don't worry, they know how to code so that won't be a
 *         problem. The rules go something like this: There are 'n' coins kept
 *         on the table, numbered from 0 to 'n-1'. Initially, each coin is kept
 *         tails up. You have to perform two types of operations :
 * 
 *         1. Flip all coins numbered between A and B inclusive. This is
 *         represented by the command: 0 A B 2. Answer how many coins numbered
 *         between A and B inclusive are heads up. This is represented by the
 *         command 1 A B
 * 
 *         You task, as usual, is to help the professor. So you are supposed to
 *         do the same thing Ramesh and Suresh are doing, just faster. So that
 *         by the time they are done with it, you would have told professor the
 *         answer.
 * 
 *         Input: The first two lines contain two integers, N and Q.The first
 *         line after inputting N and Q has to be of form (1).Each of the next Q
 *         lines are of the form (2) as mentioned above.
 * 
 *         Output: Output 1 line for each of the queries of the form (2)
 *         containing the required answer for the corresponding query just after
 *         the query.
 * 
 */
public class Heads_You_Win_Tails_I_Win {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int N=Integer.parseInt(br.readLine().trim());	
		int arr[]=new int[N];		
		int Q=Integer.parseInt(br.readLine().trim());	
		while(Q>0)
		{
			
			
				int m=Integer.parseInt(br.readLine().trim());	
				int A=Integer.parseInt(br.readLine().trim());	
				int B=Integer.parseInt(br.readLine().trim());	
				if(m==0)
				{
					for(int i=A;i<=B;i++)
					{
						arr[i]=1;
					}
				}
				else
				{
					int count=0;
					for(int i=A;i<=B;i++)
					{
						count=(arr[i]==1?count+1:count);
					}
					out.println(count);
				}
				Q--;
				
			
		}
		out.close();
		
	}
}

