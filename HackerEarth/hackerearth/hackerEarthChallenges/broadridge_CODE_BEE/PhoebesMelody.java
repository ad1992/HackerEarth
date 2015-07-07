package hackerEarthChallenges.broadridge_CODE_BEE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class PhoebesMelody {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		String s;	
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					int arr[]=new int [N];
					int pos[]=new int[N+1];
					for(int i=0;i<N;i++){
						arr[i]=Integer.parseInt(st.nextToken());
						pos[arr[i]]=i;
											
				}
				int dp[]=new int[N];
				for(int i=0;i<N;i++)
				{
					int cur1=i+K;
					int cur2=i-K;
					while(cur2>=0||cur1<N)
					{
						if((cur1<N&&arr[cur1]<arr[i])||(cur2>=0&&arr[cur2]<arr[i]))
						{
							dp[i]=cur1-i;
							break;
						}
						cur1++;
						cur2--;
						
					}
					
						
				}
				long sum=0l;
				for(int i=0;i<N;i++)
				{
					sum+=dp[i];
				}
				System.out.println(sum);
					
					T--;
				}
			}

		}
	}
	
	

}
