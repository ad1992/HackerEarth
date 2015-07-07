package collegeChallenges.flavouredJune;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Tom gives a number N to Roy and ask him to tell the total number of
 *         even divisors of the number N. Help Roy to answer the question of
 *         Tom.
 * 
 *         INPUT:
 * 
 *         First line contains the number of testcases T, followed by T lines
 *         each containing an integer N.
 * 
 *         OUTPUT:
 * 
 *         For each testcase, print the required answer in a singlr line.
 * 
 */
public class Even_Divisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine());			
			int i=2;
			int limit=(int) Math.ceil(Math.sqrt(N));
			//System.out.println(limit);
			int ans=0;
			if(N==2)
				ans=1;
			else if((N&1)==0)
			{
				ans=1;
				while(i<=limit)
				{
					if(N%i==0)
					{
						if((i&1)==0)
						{
							ans++;
						}
						long next=N/i;
						//System.out.println(i+" " +next);
						if(i*i!=N&&(next&1)==0)
						{
							ans++;
							//System.out.println(i+" " +next);
						}
						
						
						
					}
					i++;
				}
			}			
			System.out.println(ans);
		
		}
	}

}
