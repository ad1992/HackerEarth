package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class DSDNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[30000001];
		for(int i=1;i<=30000000;i++)
		{
			arr[i]=arr[i-1];
			int N=i;int s=0;
			while(N>0)
			{
				s+=N%10;
				N/=10;
			}
			if(i%s==0)
				arr[i]++;			
		}
		int left=1000000000-30000000;		
		int arr1[]=new int[left+1];
		arr1[1]=arr[arr.length-1];
		for(int i=30000002;i<=1000000000;i++)
		{
			arr[i-30000000]=arr[i-30000000-1];
			int N=i;int s=0;
			while(N>0)
			{
				s+=N%10;
				N/=10;
			}
			if(i%s==0)
				arr[i-30000000]++;
				
		}
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();int c=0;
			int L=sc.nextInt();
			int R=sc.nextInt();
			int ans=0;
			if(R>30000000)
			{
				ans=arr[30000000]-arr[L-1];
				int more=R-30000000;
				ans+=arr1[more];
				///	System.out.println(ans);
				
			}
			else{
			ans=arr[R]-arr[L-1];
			}
			System.out.print(ans+"\n");
		}
	}

}
