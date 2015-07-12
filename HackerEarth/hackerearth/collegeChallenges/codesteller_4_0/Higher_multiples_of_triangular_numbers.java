package collegeChallenges.codesteller_4_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Archith loves to play with number series. Archith asked his
 *         girlfriend to a date. But she was busy in solving the homework on
 *         triangular series which stated that find the least number which has
 *         higher divisors than n in a triangular series. His girlfriend made a
 *         condition that if he solves this assignment for her she will come for
 *         date. Archith dont want to waste time he is developing a code. Put
 *         yourself in the position of archith and solve this
 *         problem.(#projecteuler 13)
 * 
 *         INPUT: T test cases every t lines consists of a number n which
 *         specifies the no of divisors. OUTPUT: output the least triangular
 *         number which has higher no of divisors than n.
 * 
 *         1<T<11 1<n<10^2
 * 
 *         example:
 * 
 *         triangular series will be as follows 1,3,6,10........ if n =2 6 has 4
 *         divisors.So 6 will be the least number to have more than n divisors.
 */
public class Higher_multiples_of_triangular_numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int count=0;
			int n=0,s=0;
			while(count<=N)
			{
				n+=s;
			
				int i=1;
				count=0;
				int sqrt=(int) Math.sqrt(n);
				while(i<=sqrt)
				{
					if(n%i==0)
					{
						count+=2;
					
					}
					i++;
				
				}
			
				if(sqrt*sqrt==n)
					count--;
			
				s++;
			}
			System.out.println(n);
		}

	}

}
