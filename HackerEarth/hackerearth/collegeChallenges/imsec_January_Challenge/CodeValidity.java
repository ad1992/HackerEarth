package collegeChallenges.imsec_January_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class CodeValidity{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());String s;StringTokenizer st;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int n1=0,n2=1;int count=0;
				if(n1>=a &&n1<=b)
				count++;
				if(n2>=a &&n1<=b)
				count++;
				while(true)
				{
					int c=n1+n2;
					if(c>b)
						break;
					if(c>=a && c<=b)
					{
						count++;
					}
					n1=n2;
					n2=c;
				
				}
				if(count%2==0)
				System.out.println("VALID");
				else
				System.out.println("INVALID");
				
			}
		}

	}

}
	
