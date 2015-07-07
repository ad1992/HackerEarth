package collegeChallenges.flavouredJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         There are N people in a group. The personality of each person is
 *         denoted by A[i] from the set A, where A[i] denotes the personality of
 *         the ith person.
 * 
 *         Your task is to find the total persons of different personalities.
 * 
 *         INPUT:
 * 
 *         First line contains the total number of test cases T, for each test
 *         cases, first line denotes the total number of persons N and second
 *         line contains list of N space separated integers denoting the
 *         personality of the person.
 * 
 *         OUTPUT:
 * 
 *         For each test case, print the result in a single line.
 * 
 */
public class Different_Personalities {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			Set<Long> set=new HashSet<Long>();
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					long num=Long.parseLong(st.nextToken());
					set.add(num);
				}
				System.out.println(set.size());
				T--;
			}
		}

	}

}
