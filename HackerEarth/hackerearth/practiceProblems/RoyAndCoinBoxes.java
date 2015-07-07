package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class RoyAndCoinBoxes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine().trim());
		int count[]=new int[N+1];		
		int m=Integer.parseInt(br.readLine().trim());
		int M=m;
		while(m>0)
		{
			s=br.readLine().trim();
			if(s!=null&&!s.isEmpty())
			{
			st=new StringTokenizer(s);				
			int L=Integer.parseInt(st.nextToken());
			int R=Integer.parseInt(st.nextToken());
			count[L]+=1;
			if(R+1<=N)
			count[R+1]=count[R+1]-1;
			m--;
			}
			
		}
	
		int coin[]=new int[M+1];
		for(int b=1;b<=N;b++)
		{
			count[b]+=count[b-1];
			coin[count[b]]++;
			
			
		}
		for(int i=M-1;i>=1;i--)
		{
			coin[i]+=coin[i+1];
		}
		/*for(int b=1;b<=M;b++)
		{
			System.out.println(b+" " +coin[b]);
		}*/
		
		
		
		int Q=Integer.parseInt(br.readLine().trim());
		
		while(Q-->0)
		{
			
			int X=Integer.parseInt(br.readLine().trim());
			int ans=0;
			if(X<=M)
			{
				ans=coin[X];
				
				
			}		
		out.print(ans+"\n");
		
		}
			out.close();
		
	}

}
