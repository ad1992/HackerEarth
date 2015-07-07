package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class RanjanAndHisFirstQuestion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine().trim());
		String s="";StringTokenizer st;
		while(N>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				long Num=Long.parseLong(st.nextToken());
				long mod=Long.parseLong(st.nextToken());
				long count=(Num)/(mod);
				long rem=Num%(mod);	
				rem=rem*(rem+1)/2;
				mod--;
				long ans=mod*(mod+1)/2;
				ans*=count;
				ans+=rem;
				
				System.out.print(ans+"\n");
				N--;
			}
		}
	}

}
