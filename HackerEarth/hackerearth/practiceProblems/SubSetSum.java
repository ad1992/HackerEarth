package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class SubSetSum {
static private long coonst=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());			
			int size=1;
			long pow=1l;
			for(int i=1;i<N;i++)
			{
				pow=pow%coonst*2%coonst;
			}
			long sum=0l;
			for(int i=1;i<=N;i++)
			{
				sum=sum%coonst+i%coonst;
				
			}
			pow=pow%coonst*sum%coonst;
					
			
			System.out.println(pow);
		}
	}
	
}
