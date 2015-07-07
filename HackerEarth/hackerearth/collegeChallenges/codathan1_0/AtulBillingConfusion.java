package collegeChallenges.codathan1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class AtulBillingConfusion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long p=Long.parseLong(st.nextToken());
				long q=Long.parseLong(st.nextToken());
				long t=Long.parseLong(st.nextToken());
				if(p*q==t)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

}
