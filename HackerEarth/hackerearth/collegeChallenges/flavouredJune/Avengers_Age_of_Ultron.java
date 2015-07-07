package collegeChallenges.flavouredJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         A meeting between SHIELD and Avengers took place to stop Ultron. All
 *         the Avengers are present in the meeting. Everyone is shaking hands
 *         with others but exactly once.
 * 
 *         Tony Stark asked from Captain America that total how many handshakes
 *         took place in the meeting. Help Captain to calculate total
 *         handshakes.
 * 
 *         INPUT:
 * 
 *         The first line contains the number of test cases T, The next T lines
 *         follows.
 * 
 *         Each line then contains an integer N, the total number of members
 *         attend the meeting.
 * 
 *         OUTPUT:
 * 
 *         Print the number of handshakes for each test-case.
 * 
 */
public class Avengers_Age_of_Ultron {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine());
			N--;
			long ans=(N*(N+1))/2;
			System.out.println(ans);
					
			
		}
		
	}

}
