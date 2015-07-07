package hackerEarthChallenges.codemonk.stl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Our Monk loves candy! While taking a stroll in the park, he stumbled
 *         upon N Bags with candies. The i'th of these bags contains Ai candies.
 *         He picks up a bag, eats all the candies in it and drops it on the
 *         ground. But as soon as he drops the bag, the number of candies in the
 *         bag increases magically! Say the bag that used to contain X candies
 *         (before eating), now contains [X/2] candies! ,where [x] is the
 *         greatest integer less than x (Greatest Integer Function). Amazed by
 *         the magical spell, Monk can now have a lot more candies! But he has
 *         to return home in K minutes. In a single minute,Monk can consume all
 *         the candies in a single bag, regardless of the number of candies in
 *         it. Find the maximum number of candies that Monk can consume.
 * 
 *         Input: First line contains an integer T. T test cases follow. First
 *         line of each test case contains two space-separated integers N and K.
 *         Second line of each test case contains N space-separated integers,the
 *         number of candies in the bags.
 * 
 *         Output: Print the answer to each test case in a new line.
 * 
 */
public class Monk_and_the_Magical_Candy_Bags {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				
				PriorityQueue<Long> arr=new PriorityQueue<Long>(N,Collections.reverseOrder());
				
				if ((s = br.readLine().trim()) != null) {
					st = new StringTokenizer(s);
					for (int i = 0; i < N; i++) {
						long num=Long.parseLong(st.nextToken());
						arr.add(num);
					}
					long ans=0l;
					//System.out.println(arr);
					for(int i=1;i<=K;i++)
					{
						long num=arr.remove();
						arr.add(num/2);
						ans+=num;
					}
					out.println(ans);
					T--;
				}
			}
		}
		out.close();

	}

}
