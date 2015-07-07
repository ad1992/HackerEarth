package hackerEarthChallenges.codemonk.number_theory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         The Monk wants to teach all its disciples a lesson about patience,
 *         since they are always in a hurry to do something crazy. To teach them
 *         this, he gives them a list of N numbers, which may or may not be
 *         distinct. The students are supposed to solve a simple Mathematical
 *         equation based on the array of these N numbers.
 * 
 *         g(x) - GCD (a[ 0 ], a[ 1 ], a[ 2 ]... a[n-1] ) f(x) - (a[ 0 ] * a[ 1
 *         ] * a[ 2 ]... * a[n-1] )
 * 
 *         The value of the MonkQuotient is: 109 + 7.
 * 
 *         The equation to be solved is: ( f(x)g(x) ) % MonkQuotient
 * 
 *         Input constraints: The first line of input will contain an integer ?
 *         N. The next line will contain N integers denoting the elements of the
 *         list.
 * 
 *         Output constraints: Print the required answer of the equation.
 * 
 */
public class The_Confused_Monk {
private static long con=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		s=br.readLine();
		st=new StringTokenizer(s);
		int arr[]=new int[N];
		long fx=1l;int gcd=1;
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			fx=(fx*arr[i])%con;
			
		}
		gcd=arr[0];
		for(int i=1;i<N;i++)
		{
			gcd=GCD(gcd,arr[i]);
			if(gcd==1)
				break;
		}
		long a=0;
		if(gcd>1)
		{
		    a=fx;
			for(int i=1;i<gcd;i++)
			{
				fx=(fx*a)%con;
			}
		}
		out.println(fx);
		out.close();
		
	}
	private static int GCD(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		return GCD(b,a%b);
	}

}
