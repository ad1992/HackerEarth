package hackerEarthChallenges.codemonk.number_theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         There is a magical shop owned by The Monk, which consists of magical
 *         potions. On the first day there are A number of potions. Let,
 *         potions[I] denote the number of potions present in the shop on the
 *         Ith day.
 * 
 *         potions[I] = potions[I-1] * potions[I-1]
 * 
 *         You, Monk's favorite student love to play around with various types
 *         of potions. So, you visit the shop regularly and buy all the potions
 *         and just keep them with yourself. However, the Monk allows you to go
 *         to the shop only on specific days.
 * 
 *         You have to find the number of potions that you will have at the very
 *         end. Since, the answer can be very large, output it modulo B.
 * 
 *         Input Format: The first line will contain A and B, the number of
 *         potions on the first day and the value with which modulo is to be
 *         taken. The second line consists of a string consisting of "0" and
 *         "1". If the Ith character from left is 1 then you can go to shop on
 *         Ith day to buy potions.
 * 
 *         Output Format: Output on a single line, the number of potions that
 *         you will have at the end. Since, the answer can be very large, output
 *         it modulo B.
 */
public class The_Magical_Shop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
	
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		long A=Long.parseLong(st.nextToken());
		long B=Long.parseLong(st.nextToken());
		s=br.readLine().trim();
		long ans=0l;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				ans=(ans+A)%B;
			}
			A=(A*A)%B;
		}
		out.println(ans);
		out.close();
		
	}

}
