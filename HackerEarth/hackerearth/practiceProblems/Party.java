package practiceProblems;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
class Party {
    public static void main(String args[] ) throws Exception {
       
    	StringTokenizer st;
    	String s;
    	long ans,f,third;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine());
        	int arr[]=new int[N];
        	if((s=br.readLine())!=null)
        	{
        		st=new StringTokenizer(s);
        		System.out.println(s);
        		long sum1=0,sum2=0;
        		for(int i=0;i<N;i++)
        		{
        			arr[i]=Integer.parseInt(st.nextToken());
        			if(i%2==0)
        				sum1+=arr[i];
        			else
        				sum2+=arr[i];
        			
        		}
        		if(N%2==0)
        		{
        			 ans=Math.max(sum1,sum2);
        		}
        		else
        		{
        			 f=arr[0];
        			
        			long sum=sum1-arr[N-1];
        			sum1=sum1-arr[0];
        			long a=Math.max(sum,sum1);
        			ans=Math.max(sum2,a);
        		}
        		System.out.println(ans);
        	}
        	
        }
      
    }
}