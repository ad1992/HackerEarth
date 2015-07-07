package hackerEarthChallenges.wegilant_Java_Hiring_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Brian built his own car and was confused about what name he should
 *         keep for it. He asked Roman for help. Roman being his good friend,
 *         suggested a lot of names. Brian only liked names that: - Consisted of
 *         exactly three distinct characters, say C1, C2 and C3 - Satisfied the
 *         criteria that the string was of the form - C1n C2n C3n : This means,
 *         first C1 occurs n times, then C2 occurs n times and then C3 occurs n
 *         times. For example, xyz, ccaarr, mmmiiiaaa satisfy the criteria, but
 *         xyzw, aabbbcccc don't. Given N names suggested by Roman, print "OK"
 *         if Brian likes the name and "Not OK" if he doesn't.
 * 
 *         Input: First line contains a single positive integer N - the number
 *         of names. N lines follow - each line contains a name.
 * 
 *         Output: For each name, Print "OK" if the name satisfies the criteria,
 *         else print "Not OK", on a new line.
 * 
 * 
 * 
 */
public class Car_Names {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int count=1;
				int diff[]=new int[3];				
				int c=0;
				int len=s.length();
				if(s.charAt(0)!=s.charAt(len-1))
				{
					for(int i=1;i<s.length();i++)
					{
						
						
						if(s.charAt(i)==s.charAt(i-1))
						{
							count++;
						}
						else
						{
							diff[c]=count;						
							count=1;
							c++;
							
						}
						if(c==3)
							break;
											
					}
				
					if(c==2)
					{
						diff[c]=count;
					}
					//System.out.println(c+" "+diff[0]+" "+diff[1]+" "+diff[2]);
				}
				if(c==2&&diff[0]==diff[1]&&diff[1]==diff[2])
				{
					out.println("OK");
				}
				else
				{
					out.println("Not OK");
				}
				
				T--;
			}
		}
		out.close();

	}

	
}
