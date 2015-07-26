package hackerEarthChallenges.xseed_hiring_challenge.the_competitive_class;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class The_Competitive_Class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N=Integer.parseInt(br.readLine().trim());
		if(N>0){		
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		int arr[]=new int[N+1];int i=1;
		int rank[]=new int[1002];
		while(st.hasMoreTokens())
		{
			arr[i]=Integer.parseInt(st.nextToken());
			rank[arr[i]]++;
			i++;
			
			
		}
		int size=i;
		for(i=999;i>=1;i--)		
			rank[i]+=rank[i+1];		
		for(i=1;i<size;i++){
			
			System.out.print(rank[arr[i]+1]+1+" ");
			
		}
		
	}

}
}