package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class SherlockAndNumbers {

	public static void main(String[] args) throws IOException {
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
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				int P=Integer.parseInt(st.nextToken());
				int sumk=0;
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					for(int i=1;i<=K;i++)
					{
						int num=Integer.parseInt(st.nextToken());
						if(num<=P)
						{
							P++;
						}
					}
					
					if(P<=N)
					{
						System.out.println(P);
					}
					else
					{
						System.out.println(-1);
					}
				}
				
				
						
			}
		}

	}

}
