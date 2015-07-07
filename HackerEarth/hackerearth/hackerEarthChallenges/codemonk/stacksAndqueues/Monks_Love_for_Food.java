package hackerEarthChallenges.codemonk.stacksAndqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Our monk loves food. Hence,he took up position of a manager at
 *         Sagar,a restaurant that serves people with delicious food packages.
 *         It is a very famous place and people are always queuing up to have
 *         one of those packages. Each package has a cost associated with it.
 *         The packages are kept as a pile. The job of a manager is very
 *         difficult. He needs to handle two types of queries:
 * 
 *         1) Customer Query: When a customer demands a package, the food
 *         package on the top of the pile is given and the customer is charged
 *         according to the cost of the package. This reduces the height of the
 *         pile by 1. In case the pile is empty, the customer goes away
 *         empty-handed.
 * 
 *         2) Chef Query: The chef prepares a food package and adds it on top of
 *         the pile. And reports the cost of the package to the Manager. Help
 *         him manage the process.
 * 
 *         Input: First line contains an integer Q, the number of queries. Q
 *         lines follow. A Type-1 ( Customer) Query, is indicated by a single
 *         integer 1 in the line. A Type-2 ( Chef) Query, is indicated by two
 *         space separated integers 2 and C (cost of the package prepared) .
 * 
 *         Output: For each Type-1 Query, output the price that customer has to
 *         pay i.e. cost of the package given to the customer in a new line. If
 *         the pile is empty, print "No Food" (without the quotes).
 * 
 */
public class Monks_Love_for_Food {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        int Q=Integer.parseInt(br.readLine());
        Stack<Long> piles=new Stack<>();
        while(Q>0)
        {
           
        
            if((s=br.readLine())!=null)
            {
                st=new StringTokenizer(s);
                int ch=Integer.parseInt(st.nextToken());
                if(ch==1)
                {
                	if(piles.isEmpty())
                	{
                		out.println("No Food");
                	}
                	else
                	{	
                		out.println(piles.pop());
                	}
                }
                else
                {
                	long cost=Long.parseLong(st.nextToken());
                	piles.add(cost);
                	
                }
                Q--;
            }
        }
        out.close();
			
	}

}
