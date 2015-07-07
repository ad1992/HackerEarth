package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FindTheWay {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine().trim());
        int arr[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
        	if((s=br.readLine().trim())!=null)
        	{
        		st=new StringTokenizer(s,",");
        		for(int j=0;j<N;j++)
        		{
        			arr[i][j]=Integer.parseInt(st.nextToken());
        		}
        	}
        }
        long sol[]=new long[N];
        for(int i=0;i<N;i++)
        {
        	sol[i]=arr[i][N-1];
        }
        for(int i=N-2;i>=0;i--)
        {
        	sol[0]+=arr[0][i];
        	for(int j=1;j<N;j++)
        	{
        		sol[j]=Math.min(sol[j-1]+arr[j][i], sol[j]+arr[j][i]);
        	}
        	for(int j=N-2;j>=0;j--)
        	{
        		sol[j]=Math.min(sol[j],sol[j+1]+arr[j][i]);
        	}
        }
       long min=Long.MAX_VALUE;
       for(int i=0;i<N;i++)
       {
    	  if(sol[i]<min)
    		  min=sol[i];
       }
       System.out.println(min);
	}

}
