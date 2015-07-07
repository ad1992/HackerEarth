package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class RoyAndMatrixSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long sum=0l;
			long a=1;
			for(int i=N-1;i>=1;i--)
			{
				sum+=(a*i);
				//System.out.println(sum);
				a++;
			}
			sum*=2;
			System.out.println(sum);
		}

	}

}
