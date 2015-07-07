package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class SortedString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			String s=br.readLine();
			int arr[]=new int[26];
			String ans="";
			for(int i=0;i<s.length();i++)
			{
				int ch=s.charAt(i)-97;
				arr[ch]++;
			}
			
			while(true){
				if(arr[0]==0)
					arr[0]=Integer.MAX_VALUE;
				int min=arr[0];
				int pos=0;
				for(int j=1;j<=25;j++)
				{
					if(arr[j]<min&&arr[j]>0)
					{
						min=arr[j];
						pos=j;
					}
				}
				//System.out.println((char)(pos+97));
				if(min==Integer.MAX_VALUE)
					break;
				while(arr[pos]>0)
				{
					ans+=(char)(pos+97);
					arr[pos]--;
				}
				
			
		
			}
			System.out.println(ans);
		}
			
		}

	}


