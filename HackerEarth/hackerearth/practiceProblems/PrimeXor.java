package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class PrimeXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[1000010];int k1=0;
	
	for(int i=2;i<1000010;i++)
	{
		if(arr[i]==0)
		{
			k1++;
			//System.out.println(i);
			arr[i]=1;
			for(int j=i+i;j<1000010;j+=i)
			{
				arr[j]=2;
				
			}
			
		}
			
	}
	for(int i=0;i<1000010;i++)
	{
		if(arr[i]==2)
		{
			arr[i]=0;
		}
	}
	for(int i=1;i<1000010;i++)
	{
		arr[i]+=arr[i-1];
	}
//	System.out.println(k1);
	int T=sc.nextInt();
	while(T-->0)
	{
		sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();long ans=0l;
		if(a!=b&&(a==1||a==2))
			ans=arr[b]-1;
		
	
		
		System.out.println(ans);
		}
		
		
	}
	
	
	
	

}
