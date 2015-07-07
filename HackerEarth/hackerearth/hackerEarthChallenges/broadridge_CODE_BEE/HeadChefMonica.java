package hackerEarthChallenges.broadridge_CODE_BEE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HeadChefMonica {
private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine().trim());
		String s=br.readLine().trim();
		long arr[]=new long[26];
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i)-65;
			arr[ch]++;
		}
		int order=Integer.parseInt(br.readLine().trim());
		while(order>0)
		{
			long ans=0l;
			if((s=br.readLine().trim())!=null)
			{
				int n1=s.charAt(0)-65;
				int n2=s.charAt(1)-65;
				int n3=s.charAt(2)-65;
				if(arr[n1]>0&&arr[n2]>0&&arr[n3]>0)
				{
					ans=(arr[n1]*arr[n2]*arr[n3])%con;
					arr[n1]--;
					arr[n2]--;
					arr[n3]--;
				}
				System.out.println(ans);
				order--;
				
					
				
			}
		}
	}

}
