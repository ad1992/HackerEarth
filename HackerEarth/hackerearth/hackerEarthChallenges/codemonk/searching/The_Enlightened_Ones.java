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
 *         There are N temples in a straight line and K monks who want to spread
 *         their enlightening power to the entire road of temples. All the monks
 *         have an enlightenment value, which denotes the range of enlightenment
 *         which they can spread in both the directions. Since, they do not want
 *         to waste their efficiency on trivial things of the world, they want
 *         to keep their range minimum.
 * 
 *         Also, when we say that the N temples are in a straight line, we mean
 *         that that all the temples lie on something like an X-axis in a graph.
 * 
 *         Find the minimum enlightenment value such that all the temples can
 *         receive it.
 * 
 *         Input Format: The first line contains two integers, N and K -
 *         denoting the number of temples and number of monks. The next line
 *         contains N integers denoting the position of the temples in the
 *         straight line.
 * 
 *         Output format: Print the answer in a new line.
 * 
 * 
 * 
 */
public class The_Enlightened_Ones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
	
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			//System.out.println(num);
			arr[i]=num;
		}
		Arrays.sort(arr);
		int l=0,u=10000000,mid=0;
		while(l<=u)
		{
			mid=(l+u)/2;
			//System.out.println(mid);
			if(check(arr,mid,K)&&!check(arr,mid-1,K))
					break;
			if(check(arr,mid,K))
			{
				
				u=mid-1;
			}
			else
			{
				l=mid+1;
			}
			//System.out.println(mid+" "+check(arr,mid,K));
		}
		out.println(mid);
		out.close();
	}

	private static boolean check(int[] arr, int mid, int k) {
		// TODO Auto-generated method stub
		int next=arr[0]+mid;
		k--;
		for(int i=1;i<arr.length;i++)
		{
			if(next+mid<arr[i]){
			if(k==0)
				return false;		
				k--;
				next=arr[i]+mid;
			
			}
		}
		//System.out.println(mid+" "+k);
		return true;
	}

}
