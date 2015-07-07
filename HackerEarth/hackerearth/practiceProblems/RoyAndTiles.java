package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class RoyAndTiles {
private static final long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine().trim());       
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine());
        	long arr[][]=new long[N][N];
        	int i=0;
        	while(i<N)
        	{        		
        		if((s=br.readLine().trim())!=null)
        		{
        			st=new StringTokenizer(s);
        			for(int j=0;j<N;j++)
        			{
        				arr[i][j]=Long.parseLong(st.nextToken());
        			}
        			Arrays.sort(arr[i]);
        			i++;
        			
        		}
        	}
        	
        	int Q=Integer.parseInt(br.readLine());
        	while(Q>0)
        	{
        		if((s=br.readLine().trim())!=null)
        		{
        			st=new StringTokenizer(s);
        			long S=Long.parseLong(st.nextToken())+1;
        			long D=Long.parseLong(st.nextToken());long ans=1l;
        			for(i=0;i<N&&S<=D;i++)
        			{
        				int L=0,U=N-1,mid=0;int c=0;
        				while(L<=U)
        				{
        					mid=(U+L)/2;
        					if(arr[i][mid]==S)
        					{
        						int mid1=mid-1;
        						while(mid<N&&arr[i][mid]==S)
        						{
        							c++;
        							mid++;
        						}
        						while(mid1>=0&&arr[i][mid1]==S)
        						{
        							c++;
        							mid1--;
        						}
        						break;
        					}
        					else if(arr[i][mid]>S)
        					{
        						U=mid-1;
        					}
        					else if(arr[i][mid]<S)
        					{
        						L=mid+1;
        					}
        					else
        					{
        						break;
        					}
        					//System.out.println("kjkjk");
        				}
        				//System.out.println(S+ " "+c );
        				ans=ans%con*c%con;
        				S++;
        				
        			}
        			System.out.println(ans);
        			Q--;
        		}
        	}
        	
        	
        	
        }

	}

}
