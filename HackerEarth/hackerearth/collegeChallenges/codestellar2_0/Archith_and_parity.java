package collegeChallenges.codestellar2_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class Archith_and_parity {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			long num=Long.parseLong(br.readLine().trim());
			String s="";
			while(num>0)
			{
				s=num%2+s;
				num>>=1;
			}
		//	System.out.println(s);
		long ones=0l;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='1')
					ones++;
			}
			if((ones&1)==1)
			{
				System.out.print("odd\n");
			}
			else
			{
				System.out.print("even\n");
			}
			
		}
 
	}
 
}