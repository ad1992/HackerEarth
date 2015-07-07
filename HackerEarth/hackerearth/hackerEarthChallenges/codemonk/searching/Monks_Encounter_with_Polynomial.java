package hackerEarthChallenges.codemonk.searching;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *       Problem Link:
 *       https://www.hackerearth.com/code-monk-searching/algorithm/monks-encounter-with-polynomial/description
 */
public class Monks_Encounter_with_Polynomial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				
				st=new StringTokenizer(s);
				long  A=Long.parseLong(st.nextToken());
				long B=Long.parseLong(st.nextToken());
				long  C=Long.parseLong(st.nextToken());
				long K=Long.parseLong(st.nextToken());
				int u=100000;
				int l=0,mid=0;int ans=0;
				while(l<=u)
				{
					mid=(l+u)/2;
					long exp=A*mid*mid+B*mid+C;
					if(exp<K)
					{
						l=mid+1;
					}
					else if(exp>=K)
					{
						ans=mid;
						u=mid-1;
					}					
					
					
				}
				out.println(ans);
				
				T--;
			}
			
		}
		out.close();
	}

}
