package hackerEarthChallenges.glydel_Tech_Hiring_Challenge;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Alfi asked Roy to go for shopping with her. Witty Roy came up with a
 *         condition. He said, for each product of MRP (Maximum Retail Price) R,
 *         she'll have to pay minimum of all the prime factors of R and he
 *         himself will pay rest of the amount. Without giving it a second
 *         thought Alfi agreed.
 * 
 *         Now they bought N number of products. You're to find how much money
 *         did Roy had to pay for each product.
 * 
 *         Input:
 * 
 *         First line will contain integer N, number of products they bought.
 * 
 *         Next N lines each will contain R, MRP of each product.
 * 
 *         Output:
 * 
 *         Print single integer in a new line, the amount of money Roy had to
 *         pay for each product.
 * 
 */
public class Roy_and_Shopping {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder ans=new StringBuilder();
		int N=Integer.parseInt(br.readLine().trim());
		int prime[]=new int[1000001];
		for(int i=0;i<prime.length;i++)
		{
			prime[i]=i;
		}
	prime[0]=prime[1]=1;
		for(int i=2;i<=1000000;i++)
		{
			if(prime[i]==i)
			{
				for(int j=i;j<1000001;j+=i)
				{
					if(prime[j]==j)
					prime[j]=i;
				}
			}
		}
		while(N-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			int left=num-prime[num];
			ans.append(left+"\n");
			
		}
		System.out.println(ans);
	}

}
