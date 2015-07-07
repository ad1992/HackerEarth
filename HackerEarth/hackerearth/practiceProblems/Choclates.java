package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Choclates {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
				int n=Integer.parseInt(st.nextToken());
				int m=Integer.parseInt(st.nextToken());
				int arr[][]=new int[n][m];
				for(int i=0;i<n;i++)
				{
					if((s=br.readLine())!=null)
					{
						st=new StringTokenizer(s);
						for(int j=0;j<m;j++)
						{
							arr[i][j]=Integer.parseInt(st.nextToken());
						}
					}
				}
				for(int i=0;i<n;i++)
				{
					
				}
			}
		}
	}

}
