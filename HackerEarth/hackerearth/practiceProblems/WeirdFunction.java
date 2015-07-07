package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 		 @user Aakansha Doshi
 * 		 Chandu is working on Weird function these days. A weird function
 *       is defined as: W(a,b) = MW(a) + MW(a+1) + MW(a+2)... + MW(b) (a and b
 *       both inclusive) where a and b are integers and MW is mini weird
 *       function, which is defined as: MW(i) = p^i + q^i + ... where p and q
 *       (less than or equal to i) are all possible integers such that gcd(p,i)
 *       = p, gcd(q,i)= q ... and so on.
 * 
 *       For example: MW(10) = 1^10 + 2^10 + 5^10 + 10^10 where gcd(1,10) = 1,
 *       gcd(2,10) = 2, gcd(5,10) = 5, gcd(10,10) = 10
 * 
 *       Your task is to find W(a,b) for given a and b.
 * 
 */
public class WeirdFunction {
private static long con=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long powersum[]=new long[10001];
		
		//System.out.println(power(2, 7-1)+" "+fast_exp(2, 7));
		powersum[1]=1l;
		
		for(int i=2;i<=10000;i++)
		{
			int j=1;
			powersum[i]=0l;
			while(j<=(Math.sqrt(i)))
			{
				if(i%j==0)
				{
					powersum[i]=(powersum[i]%con+power(j,i-1)%con)%con;
					
					//powersum[i]=(powersum[i]%con+fast_exp(j,i)%con)%con;
					if(j*j!=i){
					powersum[i]=(powersum[i]%con+power(i/j,i-1)%con)%con;
					//powersum[i]=(powersum[i]%con+fast_exp(i/j,i)%con)%con;
					}
						
				 	
				}
				j++;
				
				//System.out.println(j);
			}
			//System.out.println(powersum[2]);
			
		}
		for(int i=1;i<=10000;i++)
		{
			powersum[i]=(powersum[i]%con+powersum[i-1]%con)%con;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				//System.out.println(powersum[i-1]+" "+powersum[j]);
				long ans=0l;
				 ans=(powersum[j]-powersum[i-1]+con)%con;
				
				System.out.print(ans+"\n");
				T--;
				
			}
		}
	}
	private static long power(long j,long i) {
		// TODO Auto-generated method stub
		long x=j;
		while(i>0){
		if((i&1)==1){
			x=(x*j)%con;
		}		
		j=(j*j)%con;		
		i>>=1;
		}
		return x;
	}
	
}
