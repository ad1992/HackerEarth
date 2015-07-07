package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class TastyNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		int prime[]=new int[100000000];int arr[]=new int[10000];int k=0;	
		for (int i = 1; i <100000000; ++i) 
     		 prime[i] = i;
		for(int i=2;i<10000;i++)
		{
			if(prime[i]==i)
			{
				prime[i]=i;		
				arr[k]=i;
				k++;
				for(int j=i*i;j<100000000;j+=i)
				{
					
					prime[j]=i;
					
				}
			}
		}
		int c1=0;
		
		
			
    			
    		
		//System.out.println(c1);
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine());
			int i=0;;
			String ans="";long c=0;
			while(N>1)
			{
				if(N%arr[i]==0)
				{
					ans=ans+arr[i]+" ";
					c++;
					while(N%arr[i]==0)
					{
						N=N/arr[i];
					}
				}
				i++;
			}
			if(c>2)
			{
				System.out.println("YES");
				System.out.println(ans);
			}
			else
				System.out.println("NO");
		}

	}

}
