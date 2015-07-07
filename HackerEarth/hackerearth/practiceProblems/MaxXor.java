package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaxXor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s;
	        int T=Integer.parseInt(br.readLine());
	        while(T-->0)
	        {
	        	int N=Integer.parseInt(br.readLine());
	        	long power;
	        	power=(long) Math.ceil(Math.log(N)/Math.log(2));
	        	int arr[][]=new int[N][N];
	        	for(int i=0;i<N;i++)
	        	{
	        		for(int j=0;j<N;j++)
	        		{
	        			arr[i][j]=i^j;
	        		}
	        	}
	        	for(int i=0;i<N;i++)
	        	{
	        		for(int j=0;j<N;j++)
	        		{
	        			System.out.print(arr[i][j]+"  ");
	        		}
	        		System.out.println();
	        	}
	        	boolean flag=false;
	        	if((N&N-1)==0)
	        	{
	        		power++;
	        		flag=true;
	        		
	        	}
	        	System.out.println(power);
	        	long freq=2;
	        	long ans=0;
	        	if(flag)
	        	{
	        		freq=2;
	        		ans=(long) Math.pow(2,power);
	        	}
	        	else
	        	{
	        		long start=(long) Math.pow(2, power);
	        		long end=(long) Math.pow(2, power+1);
	        		long diff=end-start;
	        		freq+=diff*2;
	        		ans=(long) Math.pow(2,power);
	        	}
	        	System.out.println(ans+" "+freq);
	        	
	        }

	}

}
