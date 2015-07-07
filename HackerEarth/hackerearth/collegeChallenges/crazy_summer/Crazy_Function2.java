package collegeChallenges.crazy_summer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
/**
 * @author Aakansha Doshi * 
 *        
 */
public class Crazy_Function2 {
	private static long con = 1000000007;
 
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		long ans=0l;
		int T = Integer.parseInt(br.readLine().trim());
		while (T-->0) {
			long X = Long.parseLong(br.readLine());
			
		
				ans = cal(2,X);			
				//System.out.println(ans);
				ans=(ans*(7*ans-1))%con;
			
			out.println(ans);
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
