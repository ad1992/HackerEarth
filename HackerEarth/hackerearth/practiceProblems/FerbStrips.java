package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FerbStrips {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			int n=Integer.parseInt(br.readLine());
			int arr[]=new int[1001];
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<n;i++)
				{
					int n1=Integer.parseInt(st.nextToken());
					arr[n1]=arr[n1]+1;
					
				}
				
				boolean colour[]=new boolean[n];int start=0;int i=0;
				while(i<n)
				{
					while(start<=1000&&arr[start]==0)
					{
						start++;
					
					}
					int cur=start;int curi=i;
					//System.out.println("cur "+cur);
					while(cur<1001&&arr[cur]!=0)
					{
						
						colour[curi]=true;
						arr[cur]=arr[cur]-1;
						curi=curi+2;
						if(curi>n-1)
							break;
						
					}
					//System.out.println("start "+start);
					if(start>=1001)
					{
						break;
					}
					i++;start++;
				}
				i=0;
				//System.out.println(i);
				boolean flag=false;
				while(i<=1000)
				{
					if(arr[i]!=0)
					{
						flag=true;
						break;
					}
					i++;
				}
				if(!flag)
				{
					System.out.println("can do");
				}
				else
					System.out.println("bad luck");
			}	
		}
	}

}
