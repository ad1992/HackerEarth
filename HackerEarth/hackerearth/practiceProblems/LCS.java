package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LCS {
	public static void main(String[] args) throws NumberFormatException, IOException {		
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine();
	StringTokenizer st=new StringTokenizer(s);
	String s1=st.nextToken();
	String s2=st.nextToken();
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int lcs[][]=new int[s1.length()+1][s2.length()+1];
	for(int i=0;i<=s1.length();i++)
	{
		for(int j=0;j<=s2.length();j++)
		{
		
			if(i==0|j==0)
				lcs[i][j]=0;
			else if((c1[i-1]==c2[j-1])&&(c1[i-1]!='a'&&c1[i-1]!='e'&&c1[i-1]!='i'&&c1[i-1]!='o'&&c1[i-1]!='u'))
			{
				lcs[i][j]=lcs[i-1][j-1]+1;
			}
			
			else
				lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
			}
		
	}
	System.out.println(lcs[s1.length()][s2.length()]);
	}
	
}
