package collegeChallenges.imsec_January_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Game_Of_Thrones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());String s;StringTokenizer st;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<String>();int c=0;
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					String n=st.nextToken();
					if(set.contains(n))
					{
						c++;
					}
					else
					{
						set.add(n);
					}
				}
				System.out.println(c);
				
		}
			
	}
	}
}
