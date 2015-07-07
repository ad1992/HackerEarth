package collegeChallenges.codestellar2_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumberGame_1 {
static long arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			long num=Long.parseLong(br.readLine().trim());
	
		long steps=getMininum(num,Long.MAX_VALUE);
			System.out.print(steps+"\n");
		}
	}
 
	private static long getMininum(long num,long steps) {
		// TODO Auto-generated method stub
		
		if(num==1)
			return 0;		
		else if(num%3==0)
			steps=1+getMininum(num/3,steps);
		else if(num%2==0)
			steps=min(steps,1+getMininum(num/2,steps));
		else steps=min(steps,1+getMininum(num-1,steps));
		return steps;
		
	}
 
	private static long min(long steps, long l) {
		// TODO Auto-generated method stub
		if(steps>l)
			return l;
		return steps;
		
	}
 
}