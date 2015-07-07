package collegeChallenges.codathan1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class AdityasLoveForStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
		String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				boolean arr[]=new boolean[26];int unique=0;
				for(int i=0;i<s.length();i++)
				{
					int ch=s.charAt(i);
					if(!arr[ch-97])
					{
						arr[ch-97]=true;
						unique++;
					}
					
				}
				System.out.println(unique);
			}
		}

	}

}
