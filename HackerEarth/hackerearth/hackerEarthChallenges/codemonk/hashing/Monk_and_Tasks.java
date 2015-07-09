package hackerEarthChallenges.codemonk.hashing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
/**
 * @author Aakansha Doshi
 * 
 *         Monk A loves to complete all his tasks just before the deadlines for
 *         introducing unwanted thrill in his life. But, there is another Monk D
 *         who hates this habit of Monk A and thinks it's risky.
 * 
 *         To test Monk A, Monk D provided him tasks for N days in the form of
 *         an array Array, where the elements of the array represent the number
 *         of tasks.
 * 
 *         The number of tasks performed by Monk A on the ith day is the number
 *         of ones in the binary representation of Arrayi.
 * 
 *         Monk A is fed up of Monk D, so to irritate him even more, he decides
 *         to print the tasks provided in non-decreasing order of the tasks
 *         performed by him on each day. Help him out!
 * 
 *         Input: The first line of input contains an integer T, where T is the
 *         number of test cases. The first line of each test case contains N,
 *         where N is the number of days. The second line of each test case
 *         contains Array array having N elements, where Arrayi represents the
 *         number of tasks provided by Monk D to Monk A on ith day.
 * 
 *         Output: Print all the tasks provided to Monk A in the non-decreasing
 *         order of number of tasks performed by him.
 */
public class Monk_and_Tasks {
	private static LinkedList<Long> hash[];
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine().trim());
        	hash=new LinkedList[65];
        	StringBuilder ans=new StringBuilder();
        	s=br.readLine().trim();
    		st=new StringTokenizer(s);
    		for(int i=0;i<N;i++)
    		{
    			long bin=Long.parseLong(st.nextToken());
    			add(bin);
    		}
    		for(int i=0;i<=64;i++)
    		{
    			if(hash[i]!=null){
    			Iterator<Long>itr=hash[i].iterator();
    			while(itr.hasNext())
    				ans.append(itr.next()+" ");
    			}
    		}
    		System.out.println(ans);
    			
    			
    		
        }
        
 
	}
	private static void add(long bin) {
		// TODO Auto-generated method stub
		int c=0;
		long num=bin;
		while(num>0)
		{
			if((num&1)==1)
			{
				c++;
			}
			num>>=1;
		}		
		if(hash[c]==null)
		{
			hash[c]=new LinkedList<>();
		}
		hash[c].add(bin);
		
		
	}
 
}
 


