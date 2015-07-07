package hackerEarthChallenges.codemonk.stl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.TreeSet;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Monk's birthday is coming this weekend! He wants to plan a Birthday
 *         party and is preparing an invite list with his friend Puchi. He asks
 *         Puchi to tell him names to add to the list. Puchi is a random guy and
 *         keeps coming up with names of people randomly to add to the invite
 *         list, even if the name is already on the list! Monk hates redundancy
 *         and hence, enlists the names only once. Find the final invite-list,
 *         that contain names without any repetition.
 * 
 *         Input: First line contains an integer T. T test cases follow. First
 *         line of each test contains an integer N, the number of names that
 *         Puchi pops up with.
 * 
 *         Output: For each testcase,Output the final invite-list with each name
 *         in a new line. The names in the final invite-list are sorted
 *         lexicographically.
 */
public class Monks_Birthday_Party {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		
		int T = Integer.parseInt(br.readLine());
		
		while (T > 0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			TreeSet<String> list=new TreeSet<String>();
				
				for (int i = 0; i < N; i++)
				{
					
					if ((s = br.readLine().trim()) != null)
					{
						
							list.add(s);
					}
				}
				//out.println("start");
				for(String s1:list)
				{
					out.println(s1);
				}
				T--;
			
		}
		out.close();
	}

}
