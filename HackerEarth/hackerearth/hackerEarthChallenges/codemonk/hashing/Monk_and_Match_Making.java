package hackerEarthChallenges.codemonk.hashing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Monk has magical powers, by which he can compare any part of the
 *         strings and figure out if they're equal. His magical powers are
 *         faster than a super computer even. So, to prove his worth, he's given
 *         a string and he has to answer multiple queries based on the string.
 * 
 *         Every query will have four integers - L1, R1, L2, R2. The first two
 *         integers denoting String [ L1, R1 ] (including both L1 and R1)
 *         denoting the first substring, the next two integers denoting the
 *         second substring String [ L2, R2 ] (including both L2 and R2).
 * 
 *         For every query, you've to answer in Yes or No whether the two
 *         substrings are equal or not. Easy enough?
 * 
 *         Input: The first line contains a string, S. Then, an integer Q
 *         denoting the number of queries in the next line. Then, for every
 *         query, there will be 4 integers L1 R1 L2 R2, denoting the substring
 *         S[L1 R1] and S[L2 R2].
 * 
 *         Output: For each query output "Yes" if the two substrings are same ,
 *         else output "No".
 * 
 */
public class Monk_and_Match_Making {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		long arr[]=new long[26];
		
		StringBuilder ans=new StringBuilder();
		String s;
        StringTokenizer st;
        String str=br.readLine();
        long sum[]=new long[str.length()+1];        
        sum[1]=str.charAt(0);
        for(int i=1;i<str.length();i++)
		{
        	int ch=str.charAt(i);
        	sum[i+1]=sum[i]+ch;
		}
        int Q=Integer.parseInt(br.readLine());
        while(Q>0)
        {
        		if((s=br.readLine())!=null&&!s.isEmpty())
        		{        		
	        		st=new StringTokenizer(s," ");
	        		int L1=Integer.parseInt(st.nextToken());
	        		int R1=Integer.parseInt(st.nextToken());
	        		int L2=Integer.parseInt(st.nextToken());
	        		int R2=Integer.parseInt(st.nextToken());
	        		long fir=sum[R1]-sum[L1-1];
	        		long sec=sum[R2]-sum[L2-1];
	        		int diff1=R1-L1;
	        		int diff2=R1-L1;
	        		if(str.charAt(L1-1)==str.charAt(L2-1)&&fir==sec)
	        		{
	        			ans.append("Yes\n");
	        			// System.out.println("Yes");
	        		
	        		}
	        		else
	        		{
	        			ans.append("No\n");
	        		//	 System.out.println("No");
	        			
	        		}
	        		Q--;
        		}
        	
        	
        }
        System.out.println(ans);
        

	}

}