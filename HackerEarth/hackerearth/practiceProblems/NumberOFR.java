package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**@author Aakansha Doshi
 * 
 * As we all know RK loves his name very much especially the character 'R' so
 * this time task for you is based on his awesome name. RK gives you a string S
 * consisting of characters 'R' and 'K' only. Now you are allowed to do exactly
 * one move that is you have to choose two indices i and j (1<=i<=j<=|S| where
 * |S| is string length ) and flip all the characters at position X where
 * i<=X<=j. Flipping the character means :
 * 
 * if S[X]='R' : //If character at position X is 'R' then change it to 'K'
 * S[X]='K' else : //else if character at position X is 'K' then change it to
 * 'R' S[X]='R'
 * 
 * Now your goal is that after exactly one move you have to obtain the maximum
 * number of R's as RK loves this character very much. So help RK with maximum
 * R's.
 * 
 */
public class NumberOFR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int arr[]=new int[s.length()];int R=0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='R')
					{
						arr[i]=-1;
						R++;
					}
					else
					{
						arr[i]=1;
					}
				}
			
				int maxnow=0;int maxtillnow=0;
				for(int i=0;i<s.length();i++)
				{
					maxnow+=arr[i];
					if(maxnow<0)
						maxnow=0;
					if(maxtillnow<maxnow)
						maxtillnow=maxnow;
				}
				if(maxtillnow==0)
					R-=1;
				//System.out.println(maxtillnow+" "+R);
				System.out.println(maxtillnow+R);
			}
		}

	}

}
