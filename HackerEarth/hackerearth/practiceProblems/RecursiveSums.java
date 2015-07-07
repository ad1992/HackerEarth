package practiceProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Little Bear has received a home assignment to find the sum of all
 *         digits in a number N. Following his affinity towards single digit
 *         number, he intends to repeatedly compute the sum of all digits until
 *         the sum itself becomes a single digit number.
 * 
 *         Can you write a program to compute the final single-digit sum?
 * 
 *         As the number N is very big, it is given in the following run length
 *         encoded format - N is represented as a sequence of M blocks, where
 *         each block i (0 ? i < M) is represented by two integers - (len[i],
 *         d[i]). This implies that the digit d[i] occurs len[i] number of
 *         times.
 * 
 *         For example, {(2,1), (1,2), (2,9)} represents the number 11299. *         
 *         
 * 
 */
public class RecursiveSums {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());long ans=0l;
		String s;
		StringTokenizer st;
		long N=0l;
		while(T-->0)
		{
			
				int M=Integer.parseInt(br.readLine().trim());
				
				while(M>0)
				{
					if((s=br.readLine().trim())!=null)
					{
						st=new StringTokenizer(s);
						long len=Long.parseLong(st.nextToken());
						int digit=Integer.parseInt(st.nextToken());						
						N=(len*digit);
						ans=CalculateSum(N+ans);			
						M--;
					}
				}
				//System.out.println("case "+c++);				
				out.println(ans);				
				N=0l;
				ans=0l;
			

		}
		out.close();
	}

	private static long CalculateSum(long n) {
		// TODO Auto-generated method stub
		long sum=0l;
		do{
			while(n>0)
			{
				sum+=n%10;
				n/=10;
			}
			n=sum;
			sum=0l;
		}while(n>9);
		return n;
	}

}
