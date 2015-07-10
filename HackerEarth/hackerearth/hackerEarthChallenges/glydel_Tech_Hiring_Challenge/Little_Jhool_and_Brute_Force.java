package hackerEarthChallenges.glydel_Tech_Hiring_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Little Syed loves brute force. He thinks that brute force can be the
 *         solution to any problem in the world. You give him any question, and
 *         he'll have a brute force answer ready for you, almost all the time.
 *         His good friend Little Jhool (Like, always!) decides to teach him a
 *         lesson, by giving him problems which cannot be solved by brute force,
 *         because he wants Syed to learn algorithms.
 * 
 *         Given a number, n, Syed needs to find the number closest to n, though
 *         less than n which satisfies Jhool's swinging theorem.
 * 
 *         Jhool's swinging Theorem: A number n, such that it can be expressed
 *         as a sum of two positive algebraic cubes; AND, if that number can be
 *         expressed in such a manner in more than one way - it satisfies the
 *         theorem.
 * 
 *         Now, everyone here on HackerEarth knows how much we hate Little Jhool
 *         (No, not really!) - so we want you to help Syed in figuring out
 *         Jhool's queries - once and for all!
 * 
 *         Input Format: The first line contains an integer, t - denoting the
 *         number of test cases.
 * 
 *         The next t lines will contain, an integer - n - denoting the number
 *         which Jhool gives.
 * 
 *         Output Format: You have to print the previous number satisfying the
 *         given constraints. If no such previous number exists, print -1.
 * 
 */
public class Little_Jhool_and_Brute_Force {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		//To generate the valid numbers
		/*for(int i=1729;i<=704977;i++)
		{
			int c=0;
			l1:{
			for(int j=1;j<=Math.cbrt(i);j++)
			{
				for(int k=j;k<=Math.cbrt(i);k++)
				{
					if(j*j*j+k*k*k==i)
						c++;
					if(c==2)
						break l1;
				}
			}
			}
			if(c==2)
				System.out.print(i+",");
		}*/
		
		int cube[]={1729,4104,13832,20683,32832,39312,40033,46683,64232,65728,110656,110808,134379,
			149389,165464,171288,195841,216027,216125,262656,314496,320264,327763,373464,402597,439101,
			443889,513000,513856,515375,525824,558441,593047,684019,704977};
		int arr[]=new int[704978];
		arr[0]=-1;
		int k=0;
		for(int i=1;i<=704977;i++)
		{
			if(cube[k]<=i)
			{
				arr[i]=cube[k];
				k++;
			}
			else
			{
				arr[i]=arr[i-1];
			}
		}
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			System.out.println(arr[num]);
		}
	}

}
