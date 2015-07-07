package hackerEarthChallenges.codemonk.searching;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
     
    /**
     * @author Aakansha Doshi
     * 
     *         You are given an array A of size N, and Q queries to deal with. For
     *         each query, you are given an integer X, and you're supposed to find
     *         out if X is present in the array A or not.
     * 
     *         Input: The first line contains two integers, N and Q, denoting the
     *         size of array A and number of queries. The second line contains N
     *         space separated integers, denoting the array of elements Ai. The next
     *         Q lines contain a single integer X per line.
     * 
     *         Output: For each query, print YES if the X is in the array, otherwise
     *         print NO.
     * 
     */
    public class Discover_the_Monk {
     
    	public static void main(String[] args) throws NumberFormatException, IOException {
    		// TODO Auto-generated method stub
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    		String s;
    		s=br.readLine().trim();
    		StringTokenizer st=new StringTokenizer(s);
    		int N=Integer.parseInt(st.nextToken());
    		int Q=Integer.parseInt(st.nextToken());
    		s=br.readLine().trim();
    		st=new StringTokenizer(s);
    		long arr[]=new long[N];
    		for(int i=0;i<N;i++)
    		{
    			long num=Long.parseLong(st.nextToken());
    			//System.out.println(num);
    			arr[i]=num;
    		}
    		Arrays.sort(arr);
    		/*for(int i=0;i<arr.length;i++)
    			System.out.println(arr[i]);*/
   
    		while(Q-->0)
    		{
    			long num=Long.parseLong(br.readLine());
    			//System.out.println(num);
    			if(Arrays.binarySearch(arr,num)>=0)
    			{
    				out.print("YES\n");
    			}
    			else
    			{
    				out.print("NO\n");
    			}
    		}
    		out.close();
    	}
    
    }


