package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class RoyAndSubstrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int T=Integer.parseInt(br.readLine());
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine());
        	if((s=br.readLine())!=null)
        	{
        		long count[]=new long[N];
        		for(int i=0;i<N;i++)
        		{
        			count[i]=1;
        			
        		}
        		for(int i=1;i<N;i++)
        		{
        			if(s.charAt(i)>=s.charAt(i-1))
        			{
        				count[i]+=count[i-1];
        				
        			}
        		}
        		long ans=0;
        		for(int i=0;i<N;i++)
        		{
        			ans+=count[i];
        		}
        		System.out.println(ans);
        	}
        }

	}

}
