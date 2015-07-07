package hackerEarthChallenges.broadridge_CODE_BEE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class PlayingCards {
private static long con=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int M=Integer.parseInt(st.nextToken());long ans=0l;
				if((M&1)==0)
				{
					long red=M/2;
					long facecard=6*N;
					long rankcard=18*N;
					if(red<=facecard){
					for(long i=0;i<=M/2;i++)
					{
						long a=((ncr(facecard,i)%con*ncr(rankcard,red-i)%con*ncr(facecard,red-i)%con*ncr(rankcard,i))%con)%con;					
						ans=(ans%con+a%con)%con;
					
				
				}
				}
				
			}
				System.out.println(ans);
				T--;
		}
	}
	}
	private static long ncr(long n, long r) {
		// TODO Auto-generated method stub
		if(n-r>r)r=n-r;
		long a=1l,i=0;
		while(i++<n-r)
		{
		a=(((a%con*(r+i)%con)*modinverse(i))%con)%con;
		}
		return a;
		}
		 
		private static long modinverse(long x) {
		// TODO Auto-generated method stub
		long p=con-2;
		long a=1l,b=x;
		while(p>0)
		{
		if((p&1)==1)
		{
		a=(a*b)%con;
		}
		b=(b*b)%con;
		p>>=1;
		}
		return a;
		}

}
