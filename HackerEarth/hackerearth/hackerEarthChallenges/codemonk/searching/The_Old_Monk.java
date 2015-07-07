package hackerEarthChallenges.codemonk.searching;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Big Chandan is a dire lover of Biryani, especially Old Monk's
 *         Biryani. Today, he went over to have some of it. To his surprise, the
 *         waiter turns out be to be a coding geek and refuses to serves him
 *         unless Chandu solves his two- arrays problem, stated as:
 * 
 *         Given two non-increasing array of integers A,B i.e A[i] >= A[i+1] and
 *         B[i] >= B[i+1] and for all i, 0 ≤ i < n-1.
 * 
 *         The monkiness of two numbers is given by: M (A[i],B[j]) = j - i , if
 *         j >=i and B[j] >= A[i], or 0 otherwise.
 * 
 * 
 *         Find the monkiness of the two arrays, that is given by: M (A,B)= max
 *         (M(A[i],B[j])) for 0≤ i, j< n-1.
 * 
 *         Input Format: The first line contains an integer, tc, denoting the
 *         number of test cases. The next line contains an integer, n, denoting
 *         the size of the two arrays. The size of both the arrays will be
 *         equal. After that line, the next line contains n integers denoting
 *         the numbers in the array A, and in the next line, there will be n
 *         numbers denoting the numbers in the array B.
 * 
 *         Output format: Print the monkiness of the two arrays.
 * 
 */
public class The_Old_Monk {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		
		String s;
		StringTokenizer st;
	
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long A[]=new long[N];
			long B[]=new long[N];
			if((s=br.readLine().trim())!=null)
			{
				
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					A[i]=Long.parseLong(st.nextToken());
				}
				if((s=br.readLine().trim())!=null)
				{
					
					st=new StringTokenizer(s);
					for(int i=0;i<N;i++)
					{
						B[i]=Long.parseLong(st.nextToken());
					}
					int ans=-1;
					for(int i=0;i<N;i++)
					{
						int j=binarysearch(B,A[i],i);
						ans=Math.max(ans, j-i);
					}
					out.println(ans);
					T--;
				}
			}
		}
		out.close();
	}

	private static int binarysearch(long[] b, long n,int i) {
		// TODO Auto-generated method stub
		int len=b.length;
		int mid=0,l=i,u=len-1,pos=0;
		while(l<=u)
		{
			mid=(l+u)/2;
			if(b[mid]<n)
			{
				u=mid-1;
			}
			else if(b[mid]>=n)
			{
				pos=mid;
				l=mid+1;
			}
		}
		return pos;
	}

}
