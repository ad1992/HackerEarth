package hackerEarthChallenges.codemonk.graph_theory_I;

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
 *         The Monk wants to buy some cities. To buy two cities, he needs to buy
 *         the road connecting those two cities. Now, you are given a list of
 *         roads, bought by the Monk. You need to tell how many cities did the
 *         Monk buy.
 * 
 *         Input: First line contains an integer T, denoting the number of test
 *         cases. The first line of each test case contains an integer E,
 *         denoting the number of roads. The next E lines contain two space
 *         separated integers X and Y, denoting that there is an road between
 *         city X and city Y.
 * 
 *         Output: For each test case, you need to print the number of cities
 *         the Monk bought.
 * 
 */
public class Monk_in_the_real_estate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
      
        while(T-->0)
        {
        	  Set<Integer> set=new HashSet<Integer>();
	          int N=Integer.parseInt(br.readLine());
	          while(N>0)
	          {
		          if((s=br.readLine())!=null)
		          {
		        	  st=new StringTokenizer(s);
		              int V=Integer.parseInt(st.nextToken());
		              int E=Integer.parseInt(st.nextToken());
		              set.add(V);
		              set.add(E);
		              
		          }
		         
		          N--;
	          }
	          out.println(set.size());
        }
        
        out.close();
        
	}

}
