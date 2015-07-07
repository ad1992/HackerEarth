package collegeChallenges.dCRUST_Beginners_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class PacketProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		long cur0=0l,cur1=0l;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			cur0=1;
			if(N==1)
			{
				cur0=0;
				cur1=1;
			}
			else if(N==2)
			{
				cur0=1;
				cur1=1;
			}
			else{
				cur0=cur1=1;
				N=N-2;
			while(N-->0)
			{
				long zero=0l, one=0l;
				zero-=cur0;
				one+=cur0;
				zero+=cur1;
				cur0+=zero;
				cur1+=one;
				
				
			}
			
			}
			System.out.println(cur0+ " "+cur1);
			
		}

	}

}
