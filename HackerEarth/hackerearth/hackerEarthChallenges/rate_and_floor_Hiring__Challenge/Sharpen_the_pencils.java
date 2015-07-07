package hackerEarthChallenges.rate_and_floor_Hiring__Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 * 
 *         Madhav and Riya were getting bored. So they decided to play a game.
 *         They placed N pencils in a line. Madhav starts to sharpen pencil from
 *         left to right, and Riya from right to left. For each pencil, its
 *         length is known. Madhav sharpens with speed twice that of Riya. If a
 *         player starts to sharpen the pencil, other player can't touch it. If
 *         both players reach the same pencil simultaneously, Madhav gets to
 *         sharpen pencil as he snatches it away from Riya.
 * 
 *         How many pencils each of the players will sharpen?
 * 
 *         Input
 * 
 *         The first line contains one integer T, the number of test cases. The
 *         first line of each test case contains one integer N,the number of
 *         pencils. The second line contains a sequence , A1, A2, A3 . . . An
 *         where Ai denotes length of ith pencil.
 * 
 *         Output Print two numbers X and Y separated by space, where X is the
 *         number of pencils sharpened by Madhav, and Y is the number of pencils
 *         sharpened by Riya.
 * 
 */
public class Sharpen_the_pencils {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long arr[]=new long[N];
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					arr[i]=Long.parseLong(st.nextToken());
				}
			
			long madhav=0l,riya=0l,madhavtime=0l,riyatime=0l;
			int i=0;int j=N-1;
			while(i<j)
			{
				if(madhavtime==riyatime)
				{
					madhavtime+=arr[i];
					madhav++;
					riyatime+=arr[j]*2;
					riya++;
					i++;
					j--;
				}
				else if(madhavtime>riyatime)
				{
					riyatime+=arr[j]*2;
					riya++;
					j--;
				}
				else
				{
					madhavtime+=arr[i];
					madhav++;
					i++;
				}
			}
			if(i==j&&madhavtime>riyatime)
			{				
				riya++;
			}
			if(i==j&&riyatime>=madhavtime)
			{
				madhav++;
			}
			out.println(madhav+" "+riya);
			T--;
			}
			
			
		}
		out.close();
				
	}

}



