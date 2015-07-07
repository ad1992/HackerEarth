package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class NumberOFOnesAndZero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		int one[]={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
		int zero[]={4,3,3,2,3,2,2,1,3,2,2,1,2,1,1,0};
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				long ones=0l,zeros=0l;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
				//System.out.println(ch);
					int in;				
					switch(ch)
					{
						case 'A':
						in=10;
						break;
						case 'B':
						in=11;
						break;
						case 'C':
						in=12;
						break;
						case 'D':
						in=13;
						break;
						case 'E':
						in=14;
						break;
						case 'F':
						in=15;
						break;
						default:
						in=ch-48;
													
					}
					
					ones+=one[in];
					zeros+=zero[in];
				}
				System.out.print(ones+" "+zeros+"\n");
			}
		}

	}

}
