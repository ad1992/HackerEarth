package collegeChallenges.codestellar2_0
;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class BhargavAndGRE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine().trim();
		String s1;
		int T=Integer.parseInt(br.readLine());
		int a=0,s=0;
		while(T-->0)
		{
			if((s1=br.readLine().trim())!=null)
			{
				if(word.length()==s1.length())
				{
					if(word.charAt(0)==s1.charAt(0))
					{
						s++;
					}
					else if(word.charAt(0)+3==s1.charAt(0))
					{
						a++;
					}
					
				}
				System.out.println(s+" "+a);
			}
		}
	}

}
