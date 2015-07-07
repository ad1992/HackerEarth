package practiceProblems;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * @author Aakansha Doshi
 *
 */
public class voidFnx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Long> st=new HashSet<Long>();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long pals=0l;
		int sqrt=(int) (Math.floor( Math.sqrt(b)));
		long arr[]=new long[sqrt];

		for(int i=1;i<sqrt;i++)
		{
			arr[i]=(long)i*i;
		}
		for(int i=1;i<sqrt;i++)
		{
			for(int j=1;j<=sqrt-i;j++)
			{
				
					arr[j]=arr[j]+(long)(Math.pow(i+j, 2));
					
					//System.out.println(arr[j]);
					if(!st.contains(arr[j])&&arr[j]>=a&&arr[j]<=b&&pal(arr[j]))
					{
						System.out.println(arr[j]);
						pals+=arr[j];
						st.add(arr[j]);
					}
				
			}
		}
		System.out.println(pals);
		sc.close();
	}

	private static boolean pal(long sum) {
		// TODO Auto-generated method stub
		long s=sum;
		long newsum=0l;
		int r=0;
		while(s>0)
		{
			r=(int) (s%10);
			newsum=newsum*10+r;
			s/=10;
		}
		if(newsum==sum)
		return true;
		return false;
	}

}
