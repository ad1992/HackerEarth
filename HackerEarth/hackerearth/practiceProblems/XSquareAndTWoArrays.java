package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @username Aakansha Doshi
 * 
 *           Xsquare loves to play with arrays a lot. Today, he has two arrays
 *           named as A and B. Each array consists of N positive integers.
 * 
 *           Xsquare has decided to fulfill following types of queries over his
 *           array A and array B.
 * 
 *           1 L R : Print the value of AL + BL+1 + AL+2 + BL+3 + ... upto Rth
 *           term. 2 L R : Print the value of BL + AL+1 + BL+2 + AL+3 + ... upto
 *           Rth term.
 * 
 * 
 */
public class XSquareAndTWoArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		long A[]=new long[N];
		long B[]=new long[N];
		if((s=br.readLine().trim())!=null)
		{
			st=new StringTokenizer(s);
			for(int i=0;i<N;i++)
			A[i]=Long.parseLong(st.nextToken());
			
		}
		if((s=br.readLine().trim())!=null)
		{
			st=new StringTokenizer(s);
			for(int i=0;i<N;i++)
				B[i]=Long.parseLong(st.nextToken());
			
		}
		//System.out.println(s);
		//Swapping the A[i] And B[i] at even positions
		for(int i=1;i<N;i+=2)
		{
			long temp;
			temp=A[i];
			A[i]=B[i];
			B[i]=temp;
		}
		for(int i=1;i<N;i++)
		{
			A[i]+=A[i-1];
			B[i]+=B[i-1];
		}
		while(Q>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int c=Integer.parseInt(st.nextToken());
				int L=Integer.parseInt(st.nextToken())-1;
				int R=Integer.parseInt(st.nextToken())-1;
				long ans=0l;
				if(c==1)
				{
					if((L&1)==1)
					{
						if(L==0)
						ans=B[R];
						else
						ans=B[R]-B[L-1];
					}
					else
					{
						if(L==0)
						ans=A[R];
						else
						ans=A[R]-A[L-1];
					}
				}
				else
				{
					if((L&1)==1)
					{
						if(L==0)
						ans=A[R];
						else
						ans=A[R]-A[L-1];
					}
					else
					{
						if(L==0)
						ans=B[R];
						else
						ans=B[R]-B[L-1];
					}
				}
				System.out.println(ans);
				Q--;
			}
		}
		

	}

}
