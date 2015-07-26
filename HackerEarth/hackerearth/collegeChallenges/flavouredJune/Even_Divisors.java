package collegeChallenges.flavouredJune;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

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
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			
			int T=Integer.parseInt(br.readLine().trim());
			
			while(T-->0)
			{
				long N=Long.parseLong(br.readLine().trim());
				int ans=get_EverDivisor_Count(N);
	            System.out.println(ans);
			}

		}

		private static int get_EverDivisor_Count(long N) {
	        Set<Long> set=new HashSet<>();
			long sqrt=(long)Math.ceil((Math.sqrt(N)));
			long i=2;		
	        if(N==2)
	            return 1;
	        if((N&1)==0)
	            set.add(N);
	        
			while(i<=sqrt)
			{
				if(N%i==0)
				{
					if((i&1)==0)
	                    set.add(i);              
	                long a=N/i;
	                if(i*i!=N&&(a&1)==0)	
	                     set.add(a);				
					//System.out.println(c+" "+i);           
	              
						
				}
				i++;
			}
			return set.size();
		}
}
