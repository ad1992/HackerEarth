package collegeChallenges.dCRUST_Beginners_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class TheFight {
	private static int max=1000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(System.out);  
		int N=Integer.parseInt(br.readLine().trim());
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		long arr[]=new long[N+1];
		long temp[]=new long[N+1];
		for(int i=1;i<=N;i++)
		{
			arr[i]=Long.parseLong(st.nextToken());
		}
		int M=Integer.parseInt(br.readLine().trim());
		while(M>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				int k=Integer.parseInt(st.nextToken());
				temp[i]+=k;
				if(j<N)
				temp[j+1]-=k;
				M--;
			}
		}
		for(int i=1;i<=N;i++)
		{
			temp[i]+=temp[i-1];
		}
		for(int i=1;i<=N;i++)
		{
			out.println(arr[i]+temp[i]);
		}
		out.close();
	}

}
