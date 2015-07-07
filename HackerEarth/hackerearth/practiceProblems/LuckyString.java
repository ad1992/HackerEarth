package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class LuckyString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int K=Integer.parseInt(br.readLine());
			String ans="";
			for(int i='a'+K;i>=97;i--)
			{
				ans+=(char)i;
			}
			System.out.print(ans+"\n");
		}
	}

}
