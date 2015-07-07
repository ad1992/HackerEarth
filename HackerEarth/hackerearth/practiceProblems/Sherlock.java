package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 			 @username Aakansha Doshi
 * 			 You are given an array A1,A2...AN. You have to tell how many
 *           pairs (i, j) exist such that 1 ≤ i < j ≤ N and Ai XOR Aj is odd. * 
 *           Input and Output First line T, the number of testcases. Each
 *           testcase: first line N, followed by N integers in next line. For
 *           each testcase, print the required answer in one line.
 */
public class Sherlock {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
			long even=0,odd=0l;
				while(st.hasMoreTokens())
				{
					long num=Long.parseLong(st.nextToken());
					if((num&1)==0)
						even++;
					else
						odd++;
				}
				System.out.println(even*odd);
				T--;
			}
		}

	}

}
