package collegeChallenges.codathan1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 	@author Aakansha Doshi		
 * 		   IIT-Delhi has been invaded by aliens. An alien race from a
 *         galaxy far away is shooting a beam on the Academic Block of
 *         IIIT-Delhi. Everyone is frightened by this attack. On each day a beam
 *         is shot on roof of Academic Block and there is great shaking in the
 *         block. IIIT-Delhi AlienAttack team has decided to make a layer to be
 *         put up on roof of the Academic block which can absorb this beam and
 *         thus protect the block from the beam. The AlienAttack team knows how
 *         to make this layer but for this they need to know the strength of
 *         beam falling on this layer. Babulal, guard of IIIT-Delhi has analysed
 *         the strength of beam and has found that the strength of beam on any
 *         day is the strength of beam on the previous day plus the twice the
 *         strength of beam on the day before previous day. Babulal then shared
 *         this analysis with the team. Now considering Babulal’s analysis
 *         AlienAttack team has to find the strength of the beam on Day N. So,
 *         consider yourself a part of the team and give the minimum strength
 *         that the layer should have to protect the block against the beam.
 *         Given the strength of beam on day one is 2 megapower and on day two
 *         is 7 megapower, you have to find the strength on day N. As the value
 *         of strength on Day N can be very large print the result modulo 10^9 +7.
 * 
 */

public class AlienAttack {
private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long ans=cal(2l,N-1);
			if((N&1)==1)
				ans=((ans*3)%con-1)%con;
			else
				ans=((ans*3)%con+1)%con;
			System.out.print(ans+"\n");
			
		}
		

	}
	private static long cal(long x, int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		if(n==1)
			return x;
		return((n&1)==1)?x%con*cal((x*x)%con,n/2)%con:cal((x*x)%con,n/2);
		
		
	}

}
