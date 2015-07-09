package hackerEarthChallenges.codemonk.hashing;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
 
/**
 * @author Aakansha Doshi
 * 
 *         As the Monk is also taking part in the CodeMonk Series, this week he
 *         learned about hashing. Now he wants to practice some problems. So he
 *         came up with a simple problem. Firstly, he made a hash function F
 *         such that:
 * 
 *         F(x) = x % 10
 * 
 *         Now using this function he wants to hash N integers and count the
 *         number of collisions that will occur while hashing the integers.
 * 
 *         Input: The first line contains an integer T, denoting the number of
 *         test cases. The first line of each test case contains an integer N,
 *         denoting the number of integers to hash. The next line contains N
 *         space separated integers, denoting the integer X to hash.
 * 
 *         Output: For each test case, print the number of collisions that will
 *         occur while hashing the integers.
 * 
 */
public class Monk_and_the_Collision {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine().trim());
        while(T>0)
        {
        	int N=Integer.parseInt(br.readLine().trim());
        	Set<Integer> set=new HashSet<>();
        	int collision=0;
        	if((s=br.readLine().trim())!=null)
        	{
        		st=new StringTokenizer(s);
        		for(int i=0;i<N;i++)
        		{
        			int num=Integer.parseInt(st.nextToken())%10;
        			if(set.contains(num))
        			{
        				collision++;
        			}
        			else
        			{
        				set.add(num);
        			}
        		}
        		out.println(collision);
        		T--;
        	}
        	
        }
        out.close();
	}
 
}


