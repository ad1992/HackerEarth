package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MysteriousABD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        while(T-->0)
        {	
        	if((s=br.readLine())!=null){
        		
        		st=new StringTokenizer(s);
        		int N=Integer.parseInt(st.nextToken()); 
        		int M=Integer.parseInt(st.nextToken()); 
        		if((s=br.readLine())!=null){
        			int arr[]=new int[N];
        			st=new StringTokenizer(s);
        			for(int i=0;i<N;i++)
        			{
        				arr[i]=Integer.parseInt(st.nextToken()); 
        						
        			}
        			boolean check[][]=new boolean[M+1][N+1];
        			for(int i=0;i<=N;i++)
        			{
        			if(i<N&&arr[i]<=N&&arr[i]<=M)
        			{
        				check[arr[i]][arr[i]]=true;
        			}
        			
        				
        				check[0][i]=true;
        			}
        			for(int i=1;i<=M;i++)
        			{
        				check[i][0]=false;
        			}
        			for(int i=1;i<=M;i++)
        			{
        				for(int j=1;j<=N;j++)
        				{
        					check[i][j]=check[i][j-1];
        					if(arr[j-1]<=i)
        					{
        						check[i][j]=check[i][j]||check[i-arr[j-1]][j-1];
        					}
        					
        				}
        			}
        			if(check[M][N])
        			{
        				System.out.println("Yes");
        			}
        					
        			else
        			{
        				System.out.println("No");
        			}
        		}
        	}
        }

	}

}
