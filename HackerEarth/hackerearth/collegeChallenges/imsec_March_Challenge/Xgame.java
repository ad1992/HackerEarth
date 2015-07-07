package collegeChallenges.imsec_March_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Xgame {
private static final long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long or=0;long power=1;
				for(int i=0;i<N;i++)
				{
					int num=Integer.parseInt(st.nextToken());
					or|=num;
					if(i>0)
					{
						power=power%con*2;
					}
				}
				power=power%con*or%con;
				System.out.println(power);
				
			}
		}
				
	}

}
