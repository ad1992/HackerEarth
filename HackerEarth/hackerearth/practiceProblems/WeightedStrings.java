package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class WeightedStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int k=Integer.parseInt(br.readLine());
			int count=0;
			if((s=br.readLine())!=null)
			{
				int start=0;
				int end=0;
				int wt=0;
				while(true)
				{
					if(start==s.length())
					{
						break;
					}
					else if(wt>=k)
					{
						//System.out.println(s.substring(start,end));
						if(wt==k)
							count++;
						int ch=s.charAt(start)-96;
						wt=wt-ch;
						start++;
					}
					else
					{
						//System.out.println(s.substring(start,end)+" end "+end);
						if(end<s.length()){
						wt+=s.charAt(end)-96;
						end++;
						}
						else
						{
							start=s.length();
						}
						
					}
				}
				
					
			}
			System.out.print("\n"+count);
			
		}

	}

}
