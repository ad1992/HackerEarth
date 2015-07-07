package hackerEarthChallenges.codemonk.graph_theory_I;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Our Code Monk recently learnt about Graphs and is very excited!
 * 
 *         He went over to the Graph-making factory to watch some freshly
 *         prepared graphs. Incidentally, one of the workers at the factory was
 *         ill today, so Monk decided to step in and do her job.
 * 
 *         The Monk's Job is to Identify whether the incoming graph is a tree or
 *         not. He is given N, the number of vertices in the graph and the
 *         degree of each vertex.
 * 
 *         Find if the graph is a tree or not.
 * 
 *         Input: First line contains an integer N, the number of vertices.
 *         Second line contains N space-separated integers, the degrees of the N
 *         vertices.
 * 
 *         Output: Print "Yes" (without the quotes) if the graph is a tree or
 *         "No" (without the quotes) otherwise.
 * 
 */
public class Monk_at_the_Graph_Factory {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	    String s;
	    StringTokenizer st;
	    int N=Integer.parseInt(br.readLine());	   
	    int sum=0;   
	    	
	    s=br.readLine().trim();
	  	st=new StringTokenizer(s);
	  	for(int i=0;i<N;i++)
	  	{
	    	sum+=Integer.parseInt(st.nextToken());
	  	}
	    		
	    
	    int edge=sum/2;
	    if(edge==N-1)
	    {
	    	out.println("Yes");
	    }
	    else
	    {
	    	out.println("No");
	    }
	    out.close();
	}
}
