package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class CountZerosInfactorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int five=N/5;
			int twentifive=N/25;
			int total=five+twentifive;
			int two=N/2;
			int ans=Math.min(total, two);
			System.out.println(ans);
		}
	

}
}