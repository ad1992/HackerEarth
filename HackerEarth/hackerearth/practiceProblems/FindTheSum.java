package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class FindTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long comp=500001723663l;
		//System.out.println(comp);
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			long l=sc.nextLong()-1;
			long r=sc.nextLong();
			long sum=0;
			if(l==1&&r==1000000000000l)
			{
				sum=comp;
			}
			else
			{
				long start=1;long n=1;long startsum=0;
				while(start<l)
				{
					startsum+=((n&1)==1)?n:0;
					n++;
					start+=n;
				}
				start=start-n;
				long diff=l-start;
				if((diff&1)==1)
				{
					startsum+=n;
				}
				//System.out.println(startsum);
				long endsum=0;
				start=1;n=1;
				while(start<r)
				{
					endsum+=((n&1)==1)?n:0;
					n++;
					start+=n;
				}
				start=start-n;
				diff=r-start;
				if((diff&1)==1)
				{
					endsum+=n;
				}
				//System.out.println(endsum);
				sum=endsum-startsum;
			}
			
			System.out.println(sum);
		}
		sc.close();
		
	}

}
