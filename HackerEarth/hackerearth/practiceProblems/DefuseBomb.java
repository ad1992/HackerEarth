package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class DefuseBomb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				String s1=st.nextToken();
				String s2=st.nextToken();
				long b=Long.parseLong(s2);
				int i=0;int end=s2.length();
				while(end<=s1.length())
				{
					String sub=s1.substring(i,end);
					long b1=Long.parseLong(sub);
					Long ans=b1*b;
					System.out.println(ans);
					i=end;
					end*=2;
				}
			}
		}
	}

}
