package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Rain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StringTokenizer st;
    	String s;long ans=0;
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int T = Integer.parseInt(br.readLine());
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine());
        	int arr[]=new int[N];
        	if((s=br.readLine())!=null)
        	{
        		st=new StringTokenizer(s);
        		for(int i=0;i<N;i++)
        		{
        			arr[i]=Integer.parseInt(st.nextToken());
        		}
        		ans=0;
        		for(int i=1;i<N-1;i++)
        		{
        			if(arr[i]<arr[i-1]&& arr[i]<arr[i+1])
        				ans+=(Math.abs(arr[i-1]-arr[i+1]))%10000007;
        		}
        		System.out.println(ans);
        	}
        }
	}
      
}
