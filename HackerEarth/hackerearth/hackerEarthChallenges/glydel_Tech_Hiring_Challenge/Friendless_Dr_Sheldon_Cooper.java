package hackerEarthChallenges.glydel_Tech_Hiring_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Leonard has decided to quit living with Dr. Sheldon Cooper and has
 *         started to live with Penny. Yes, you read it right. (And you read it
 *         here for the first time!) He is fed up of Sheldon, after all. Since,
 *         Sheldon no more has Leonard to drive him all around the city for
 *         various things, he's feeling a lot uneasy so he decides to set up a
 *         network of drivers all around the city to drive him to various
 *         places.
 * 
 *         But, not every driver wants to go every place in the city for various
 *         personal reasons, so Sheldon needs to trust many different cab
 *         drivers. (Which is a very serious issue for him, by the way!) The
 *         problem occurs mainly when Sheldon needs to go to - for example, the
 *         Comic book store - and there's no cab driver who goes directly to
 *         that place. So, he has to take a cab till another place, and then
 *         take a cab from there - making him more scared!
 * 
 *         Sheldon wants to limit his trust issues. Really. Once. And. For. All.
 * 
 *         Let's say that you're given the schedule of all the cabs from the
 *         major points where he travels to and from - can you help Sheldon
 *         figure out the least number of cab drivers he needs to trust, in
 *         order to go to all the places he wants to?
 * 
 *         Input Format: The first line contains a number with the number of
 *         test cases. Every test case has the following input:
 * 
 *         Two integers a, b. | a - number of places he needs to go. b - number
 *         of cab drivers. b lines with two more integers. | m, n - cab driver
 *         moving between points m and n.
 * 
 *         Output Format: Print the minimum number of cab drivers he needs to
 *         have faith in to travel between places in the city.
 * 
 */
public class Friendless_Dr_Sheldon_Cooper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;		
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				System.out.println(a-1);
				while(b>0)
				{
					if((s=br.readLine().trim())!=null)
					{
					
						b--;
					}
				}
				
				T--;
				
					
			}
		}

	}

}
