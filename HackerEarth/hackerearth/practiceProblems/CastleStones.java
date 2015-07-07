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
public class CastleStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			int maxcap=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=Integer.parseInt(st.nextToken());
				}
				Arrays.sort(arr);int start=0;int end=n-1;
				int count=0;
				while(start<=end)					
				{
					int add=arr[start]+arr[end];
					if(add<=maxcap)
					{
						count++;
						start++;
						end--;
					}
					else if(arr[end]<=maxcap)
					{
						count++;
						end--;
					}
					else if(arr[start]<=maxcap)
					{
						
						end--;
					}
					
				}
				System.out.println(count);
				
			}
		}

	}

}
