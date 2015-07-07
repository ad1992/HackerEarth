package collegeChallenges.crazy_summer;
import java.io.BufferedReader;import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *       
 */
public class Crazy_Fraction {
private static long con = 1000003;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		long N[]=new long[1000007];
		long fact[]=new long[1000007];
		long D[]=new long[1000007];
		N[0]=D[0]=fact[0]=1;
		for(int i=1;i<N.length;i++)
		{
			N[i]=cal(i+1,i);
			N[i]=(N[i]%con+N[i-1]%con)%con;
		}
		
		for(int i=1;i<D.length;i++)
		{
			fact[i]=(fact[i-1]*i)%con;		
			D[i]=(fact[i]%con+D[i-1]%con)%con;
		}
	
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int L=Integer.parseInt(st.nextToken());
				int R=Integer.parseInt(st.nextToken());
				long numerator=N[R]-N[L-1]+con;
				//System.out.println(numerator);
				long denomenator=D[R]-D[L-1]+con;
				numerator=numerator%con;
				denomenator=denomenator%con;
				//System.out.println(denomenator);
				long ans=(con+numerator-denomenator)%con;
				out.println(ans);
				T--;
			}
		}
		out.close();
	}
	private static long cal(long x, long n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		return ((n & 1) == 1) ? x % con * cal((x * x) % con, n / 2) % con
				: cal((x * x) % con, n / 2);
 
	}

}
