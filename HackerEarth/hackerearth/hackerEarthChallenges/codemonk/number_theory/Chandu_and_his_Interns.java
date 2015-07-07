package hackerEarthChallenges.codemonk.number_theory;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Chandu is a very strict mentor. He always gives a lot of work to his
 *         interns. So his interns decided to kill him. There is a party in the
 *         office on Saturday Night, and the interns decided to kill him on the
 *         same day. In the party, there are N beer bottles. Each bottle has a
 *         integer X written on it. Interns decided to mix poison in some of the
 *         beer bottles. They made a plan that they will add poison into a
 *         bottle only if the integer on the beer bottle has number of divisors
 *         strictly less than 4. Chandu came to know about the plan of the
 *         interns. So he needs to your help to save his life. Tell Chandu if he
 *         can drink the beer or not.
 * 
 *         Input: First line of contains an integer N, denoting the number of
 *         bottles. Each test case contains an integer X, denoting the number on
 *         the beer bottle.
 * 
 *         Output: For each beer bottle, print YES if Chandu can drink that
 *         beer, otherwise print NO.
 * 
 * 
 * 
 */
public class Chandu_and_his_Interns {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		while(N-->0)
		{
			int num=Integer.parseInt(br.readLine());
			if(checkprime(num))
			{
				
				out.println("NO");
			}
			else
			{
				out.println("YES");
			}
		}
		out.close();

	}

	private static boolean checkprime(int num) {
		
		if(num==2||num==3)
			return true;
		int sqr=(int) Math.sqrt(num);
		
		for(int i=2;i<=sqr;i++)
		{
			
			if(num%i==0)
			{
				if(i*i==num)	//to avoid number which are perfect square
					return true;
				else
					return false;
			}
		}
		return true;
	}

}
