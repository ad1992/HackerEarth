package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class AkashaAssignment {
static char arr[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine();		
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		String str=br.readLine();
		str=" "+str;
		try{
		int arr[][]=new int [N+1][26];
		
		for(int i=1;i<=N;i++)
		{
			int ascii=str.charAt(i)-97;
		
			for(int j=0;j<26;j++)
			{
									
				if(ascii==j)
				{
							
					arr[i][j]=arr[i-1][j]+1;
					
				}
				else
				{
					arr[i][j]=arr[i-1][j];
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		while(Q-->0)
		{
			
			if((s=br.readLine())!=null)
			{
			
				st=new StringTokenizer(s);
				int L=Integer.parseInt(st.nextToken());
				int R=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());		
				int track=0;int c;int i=0;
				for(i=0;i<26;i++)
				{
					c=arr[R][i]-arr[L-1][i];				
					track+=c;		
					if(track>=K)
					{
						break;
					}
												
				
					
				}
				if(i==26)
				{
						sb.append( "Out of range\n" );	
				}
				else
				{
					sb.append((char)(i+97)+"\n");
				}
					
				
			}
				
					
				
				
			}
		
		System.out.print(sb.toString());
		
		}
		
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
}
	
