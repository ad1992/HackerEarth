package hackerEarthChallenges.june_Easy_Challenge15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         A Nice-P sequence is defined as a sequence such that a1 x a2=1 (mod
 *         p), a2 x a3=1 (mod p) ..., an-1 x an = 1 (mod p). In addition, a1, a
 *         2, a 3, ... an must be less than p and greater than or equal to 0.
 *         Given one element, a1, find the sum of the entire Nice-P sequence of
 *         length n. If, for any ai, where i>=1, there exists no ai+1 such that
 *         ai x ai+1 = 1 (mod p), output -1.
 * 
 *         NOTE: p IS NOT NECESSARILY A PRIME
 * 
 *         Input:
 * 
 *         The first line contains T, the number of test cases. T lines follow,
 *         each containing a1, p, and n.
 * 
 *         Output:
 * 
 *         For each test case, output one line, the required sum.
 * 
 */
public class Nice_P_Sequence {
private static long x;
private static long y;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				long a=Long.parseLong(st.nextToken());
				long p=Long.parseLong(st.nextToken());
				long n=Long.parseLong(st.nextToken());
				 x=y=0;
				 //out.println(gcd(a,p));
				if(gcd(a,p)==1)
				{
					extendedElucidean(a,p);
					if(x<0)
					{
						x+=p;
						
					}
					long ans=0l;
					
					long half=(long)Math.ceil((double)(n*1.0)/2);
					//out.println("half "+half);
					ans+=a*half;
					//out.println("asum "+ans);
					if((n&1)==1)
					{
						ans+=x*(half-1);
						//out.println("inversesum "+ans);
					}
					else
					{
						ans+=x*half;
						//out.println("inversesum "+ans);
					}
					//out.println("inverse "+x);
					out.println(ans);
				}
				else
				{
					out.println(-1);
				}
				T--;
			}
		}
		out.close();

	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		return gcd(b,a%b);
		
	}

	private static void extendedElucidean(long a, long b) {
		// TODO Auto-generated method stub
		if(a%b==0)
		{
			x=0;
			y=1;
			return;
		}
		extendedElucidean(b, a%b);
		long temp=x;
		//System.out.println("temp="+temp);
		x=y;
		//System.out.println("x="+x);
		y=temp-y*(a/b);
		//System.out.println("y="+y+" a="+a+" b="+b);
	}

}
