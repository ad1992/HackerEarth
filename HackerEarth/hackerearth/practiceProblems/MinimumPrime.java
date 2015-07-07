package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MinimumPrime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int prime[]={2,3,5,7};
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());int c=0;
			int table[][]=new int[N+1][4];
		
			for(int i=0;i<=N;i++)
			{
				for(int j=0;j<4;j++)
				{
						table[i][j]=Integer.MAX_VALUE-1;	
				}
			}
			for(int k=0;k<4;k++){
			for(int i=0;i<4;i++)
			{
				if(prime[k]<=N)
				table[prime[k]][i]=1;
				//System.out.print(prime[i]+" ");
			}
			}
			for(int i=0;i<=N;i++)
			{
				for(int j=0;j<4;j++)
				{
					
				
					if(prime[j]<=i&&table[i][j]>table[i-prime[j]][j]+1)
					{
						table[i][j]=table[i-prime[j]][j]+1;
					}
					else if(j>0)
						table[i][j]=table[i][j-1];
				}
			}
			
				
			
			for(int i=0;i<=N;i++)
			{
				for(int j=0;j<4;j++)
				{
						System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(table[N][3]);
		}

	}

}
