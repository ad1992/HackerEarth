package hackerEarthChallenges.codemonk.graph_theory_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


     
     
    /**
     * @author Aakansha Doshi
     * 
     *         This is the story in Zimbo, the kingdom officially made for monkeys.
     *         Our Code Monk visited Zimbo and declared open a challenge in the
     *         kingdom, thus spoke to all the monkeys :
     * 
     *         You all have to make teams and go on a hunt for Bananas. The team
     *         that returns with the highest number of Bananas will be rewarded with
     *         as many gold coins as the number of Bananas with them. May the force
     *         be with you!
     * 
     *         Given there are N monkeys in the kingdom. Each monkey who wants to
     *         team up with another monkey has to perform a ritual. Given total M
     *         rituals are performed. Each ritual teams up two monkeys. If Monkeys A
     *         and B teamed up and Monkeys B and C teamed up, then Monkeys A and C
     *         are also in the same team.
     * 
     *         You are given an array A where Ai is the number of bananas i'th
     *         monkey gathers.
     * 
     *         Find out the number of gold coins that our Monk should set aside for
     *         the prize.
     * 
     *         Input: First line contains an integer T. T test cases follow. First
     *         line of each test case contains two space-separated N and M. M lines
     *         follow. Each of the M lines contains two integers Xi and Yi, the
     *         indexes of monkeys that perform the i'th ritual. Last line of the
     *         testcase contains N space-separated integer constituting the array A.
     * 
     *         Output: Print the answer to each test case in a new line.
     * 
     */
    public class Kingdom_Of_Monkeys {
    	enum State{
    		unvisited,visiting,processed;
    	}
    	static long sum=0l;
    	static State state[];
    	@SuppressWarnings("unchecked")
		public static void main(String[] args) throws NumberFormatException, IOException {
    		// TODO Auto-generated method stub
    		
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            String s;
            StringTokenizer st;
            int T=Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
            		  s=br.readLine().trim();    	        
    	        	  st=new StringTokenizer(s," ");
    	              int N=Integer.parseInt(st.nextToken());
    	              int M=Integer.parseInt(st.nextToken());
    	              LinkedList<Integer> adj[]=new LinkedList[N+1];
    	              state=new State[N+1];
    	              while(M-->0)
    	              {
    	            	  	  s=br.readLine().trim();    	    	         
    	            		  st=new StringTokenizer(s);
    			              int v1=Integer.parseInt(st.nextToken());
    			              int v2=Integer.parseInt(st.nextToken());
    			              	if(adj[v1]==null)
    	                		{
    	                			adj[v1]=new LinkedList<Integer>();
    	                		}
    	                		adj[v1].add(v2);
    	                		if(adj[v2]==null)
    	                		{
    	                			adj[v2]=new LinkedList<Integer>();
    	                		}
    	                		adj[v2].add(v1);
    			              
    	    	          
    	              }
    	              long arr[]=new long[N+1];
    	              s=br.readLine().trim();
    	              st=new StringTokenizer(s," ");
    	              for(int i=1;i<=N;i++)
    	              {
    	            	  arr[i]=Long.parseLong(st.nextToken());
    	            	 // System.out.println(s);
    	            	  state[i]=State.unvisited;
    	              }
    	              long max=Long.MIN_VALUE;
    	              for(int i=1;i<=N;i++)
    	              {
    	            	  sum=arr[i];
    	            	  if(adj[i]!=null&&state[i]==State.unvisited)
    	            	  {
    	            		  Bfs(i,adj,arr);
    	            		 // System.out.println(i+" "+sum);
    	            		 
    	            	  }
    	            	  max=Math.max(max,sum);
    	              }
    	              out.println(max);
    	           
    	              
    	          }
            out.close();
            	
            	 
            }
           
    	
    	static void Bfs(int start,LinkedList<Integer>adj[],long[] arr)
    	{
    		
    		sum=arr[start];
    		Queue<Integer> list=new LinkedList<>();
    		state[start]=State.visiting;
    		list.add(start);
    		while(!list.isEmpty())
    		{
    			start=(int) list.poll();			
    			Iterator<Integer> itr=adj[start].iterator();
    			while(itr.hasNext())
    			{
    				
    				int ele=itr.next();
    				if(state[ele]==State.unvisited)
    				{
    					state[ele]=State.visiting;
    					list.add(ele);
    					sum+=arr[ele];
    					
    				}
    			}
    			
    			state[start]=State.processed;
    			
    	
    		}
    	}

}