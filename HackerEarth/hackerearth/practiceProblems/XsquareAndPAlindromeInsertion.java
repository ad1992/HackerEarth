package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class XsquareAndPAlindromeInsertion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());long ans=0;
		String s;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int arr[]=new int[26];
				for(int i=0;i<s.length();i++)
				{
					int ch=s.charAt(i)-97;
					arr[ch]++;
				}
				int c=0;
				for(int i=0;i<26;i++)
				{
					if(arr[i]>0&&(arr[i]&1)==1)
					{
						c++;
					}
				}
				c=(c==0)?0:c-1;
				System.out.println(c);
				T--;
			}
		}

	}

}
