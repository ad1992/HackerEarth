package hackerEarthChallenges.kuliza_hiring_challenege;

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
 *         Today Oz is playing a new game. He has an array arr[] of N distinct
 *         integers . In each turn he is will follow two actions - 1) He select
 *         a random number from arr[]. Say value of this element is X. 2) He
 *         will remove X from arr[]. if X-1 is present in arr[] then he will
 *         remove it. if X+1 is present in arr[] then he will remove it. Oz will
 *         make turns until arr[] becomes empty. Oz loves this game so he wants
 *         to make maximum number of possible turns. Help Oz to make maximum
 *         number of possible turns.
 * 
 *         Input : The first line contains the number of test cases - T . Each
 *         test case consist of two lines. First line will contain a integer N -
 *         number of elements in arr[]. Second line will contain N space
 *         separated integers.
 * 
 *         Output : For each test case output maximum number of possible turns
 *         that Oz can make.
 * 
 */
public class New_game_of_Oz {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine());
			boolean track[]=new boolean[1001];
			int arr[]=new int[N];
			
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					int num=Integer.parseInt(st.nextToken());
					arr[i]=num;
					track[num]=true;
					
				}				
				Arrays.sort(arr);
				int moves=0;
				for(int i=0;i<N;i++)
				{
					track[arr[i]]=false;
					moves++;
					if(track[arr[i]+1])
					{
						i++;
					}
				}
				out.println(moves);
				T--;
			}
		}
		out.close();

	}

}