package collegeChallenges.clash_of_coders1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class CubicCurrency {
static int coin[]=new int[217];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		for(int i=1;i<=216;i++)
		{
			coin[i]=i*i*i;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			long ways[][]=new long[N+1][217];
			for(int i=0;i<=216;i++)
				ways[0][i]=1;
			for(int i=1;i<=N;i++)
			{
				for(int j=0;j<217;j++)
				{
					if(coin[j]<=i)
					{
						ways[i][j]+=ways[i-coin[j]][j];
					}
					if(j>=1)
					{
						ways[i][j]+=ways[i][j-1];
					}
				}
			}
			System.out.println(ways[N][216]);
		}

	}
	
}
