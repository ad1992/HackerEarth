package collegeChallenges.imsec_January_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class FRIENDS {
	static final long con=1000000007;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();long sum;
		long ending[]=new long[s.length()];
		ending[0]=s.charAt(0)-48;
		sum=ending[0];
		for(int i=1;i<s.length();i++)
		{
			int num=s.charAt(i)-48;
			ending[i]=(((i+1)*num)%con+((10*ending[i-1])%con))%con;
			sum=(sum+ending[i])%con;
				
		}
		System.out.println(sum);
		
	}
}

			
		

		




