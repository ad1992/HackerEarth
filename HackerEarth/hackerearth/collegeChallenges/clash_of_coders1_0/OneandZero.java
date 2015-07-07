package collegeChallenges.clash_of_coders1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class OneandZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			String prevzero,curzero;
			String prevone,curone;
			curzero=curone=prevzero=prevone="1";
			for(int i=2;i<=N;i++)
			{
				
				curzero=prevone;
				curone=add(prevzero,prevone);
				prevzero=curzero;
				prevone=curone;
			
				
			}
			System.out.print(add(curzero,curone)+"\n");
			
		}

	}

	private static String add(String s1, String s2) {
		// TODO Auto-generated method stub
	int carry=0;	
		char fir[]=s1.toCharArray();
		char sec[]=s2.toCharArray();
		int start1=fir.length-1;
		int start2=sec.length-1;
		String sum="";	
		while(start1>=0||start2>=0)
		{
			int add=0;
			if(start1>=0&&start2>=0)
			{
			add=fir[start1]+sec[start2]+carry-96;	
			start1--;
			start2--;
			}
			else if(start1>=0)
			{
				 add=fir[start1]-48;
				 start1--;
			}
			else if(start2>=0)
			{
				 add=sec[start2]-48;
				 start2--;
			}
			sum=add%10+sum;
			if(add>=10){			
			carry=add/10;
			}
			else
			{
				carry=0;
			}
			
		}
		if(carry!=0)
			sum=carry+sum;
		return sum;
	}

	

}

