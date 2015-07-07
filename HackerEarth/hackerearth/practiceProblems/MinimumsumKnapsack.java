package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MinimumsumKnapsack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int prime[]={2,3,5,7};
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());int c=0;
			int table[]=new int[N+1];
			for(int i=0;i<=N;i++)
			{
				table[i]=Integer.MAX_VALUE-1;
			}
			for(int i=0;i<4;i++)
			{
				if(prime[i]<=N)
				{
					table[prime[i]]=1;
					//System.out.println(table[i]);
				}
					
			}
			for(int i=4;i<=N;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(prime[j]<=i&&table[i]>table[i-prime[j]]+1)
					{
						table[i]=table[i-prime[j]]+1;
						//System.out.println(i+" "+table[i]);
					}
					
					
				}
			}
			/*for(int i=0;i<=N;i++)
			{
				System.out.println(table[i]);
			}*/
			if(table[N]==Integer.MAX_VALUE-1)
				table[N]=-1;
			System.out.println(table[N]);
		}
	}

}
