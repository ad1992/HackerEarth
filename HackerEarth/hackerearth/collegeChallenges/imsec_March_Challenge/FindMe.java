package collegeChallenges.imsec_March_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FindMe {

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
				int P=Integer.parseInt(st.nextToken());
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
				
					int arr[]=new int[N];
					boolean flag=false;int c=0;
					for(int i=0;i<N;i++)
					{
						arr[i]=Integer.parseInt(st.nextToken());
						if(arr[i]>N)
							c++;
						if(arr[i]==N)
						{
							flag=true;
							
						}
					}
					if(flag)
					{
						System.out.println("YES "+c);
						
					}
					else
					{
						System.out.println("No "+"0");
					}
				}
			}
		}
	}

}
