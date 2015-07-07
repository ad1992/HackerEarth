package practiceProblems;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class TrailingZeroProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       
	        StringTokenizer st;
	        int T=sc.nextInt();
	        long result[]=new long[1000000];
	        int size=1;
	        while(T-->0)
	        {
	        	
	        	sc.nextLine();
	        	int N=sc.nextInt();
	        	result[0]=1;
	        	for(int i=2;i<=N;i++)
	        	{
	        		size=multiply(result,i,size);
	        		
	        	}
	        	long len=size;
	        	for(int i=size-1;i>=0;i--)
	        	{
	        		if(result[i]==0)
	        			len--;
	        	}
	        	System.out.println(len);
	        }
	        sc.close();

	}

	private static int multiply(long[] res, int n, int size) {
		// TODO Auto-generated method stub
		long c=0;
		for(int i=0;i<size;i++)
		{
			long prod=res[i]*n+c;
			res[i]=prod%10;
			c=prod/10;
			
		}
		
		while(c>0)
		{
			res[size]=c%10;
			c/=10;
			size++;
			
		}
		return size;
	}

	

}
