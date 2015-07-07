package hackerEarthChallenges.june_Easy_Challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         A binary string of length N is a string of N characters, where each
 *         character is either 0 or 1.
 * 
 *         Wet Shark makes a list binStrings, consisting of all 2^N N-digit
 *         binary strings. For each string X in binStrings, Wet Shark runs a
 *         function ZeroShark(X), defined as follows (psuedocode):
 * 
 *         bool ZeroShark(x): //note the zero indexing n = length(x) counter = 0
 *         FOR i = 1 to n-1 IF x[i] == '0' and x[i - 1] == '0' INCREMENT counter
 *         END IF ENDFOR return (counter == 1)
 * 
 *         Wet Shark stores an element X in a new list, binTrues if ZeroShark(X)
 *         returns True for that X . In otherwords, binTrues consists of all the
 *         elements X in binStrings such that ZeroShark(X) returns True.
 * 
 *         Given T testcases, where each testcase consists of integer N,
 *         calculate the length of binTrues for each N. Because the lists can
 *         get large, output your answer modulo 10^9+7=1000000007
 * 
 *         INPUT
 * 
 *         The first line of the input contains a single integer T, the number
 *         of such N.
 * 
 *         The next T lines of the input contain a single integer N, as
 *         described in the problem.
 * 
 *         OUTPUT
 * 
 *         Output T separate lines, each containing the number of elements in
 *         the resulting list binTrues for each N in the input. The lists may be
 *         large, so output the answer modulo 10^9+7=1000000007
 * 
 */
public class ZeroShark {
private final static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		long count[][][]=new long[100001][2][2];
		count[1][0][0]=1;
		count[1][0][1]=0;		
		count[1][1][0]=1;
		count[1][1][1]=0;
		for(int i=2;i<=100000;i++)
		{
			count[i][0][0]=count[i-1][1][0];
			count[i][0][1]=(count[i-1][0][0]+count[i-1][1][1])%con;			
			count[i][1][0]=(count[i-1][0][0]+count[i-1][1][0])%con;
			count[i][1][1]=(count[i-1][0][1]+count[i-1][1][1])%con;
			
		}
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			out.println((count[N][0][1]+count[N][1][1])%con);
			
		}
		out.close();

	}

}
