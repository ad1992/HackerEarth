package collegeChallenges.codeX5_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Results are out and admission process has begun in most of the
 *         colleges. This is the story of two such young engineering aspirants,
 *         Ramesh and Suresh, who intend to make it big in life.
 * 
 *         They met each other during the admission phase of some college and
 *         have become friends. But that does not mean they aren't competitors.
 *         They both have scored the exact same marks in JEE Mains and also in
 *         their boards and so, right now, it's a tie on who is more
 *         intelligent. No one likes ties, so in order to determine who is the
 *         smarter of them both they decided to ask a Mathematics Professor, at
 *         the college they currently are applying to, to give both of them a
 *         problem to solve and the one who solves it first is smarter. By now
 *         it should be evident that the strong point of both of them is
 *         Mathematics.
 * 
 *         The mathematics professor had been in that college since its
 *         inception and had seen plenty such Ramesh and Suresh pairs competing
 *         each other. It was no big deal for him as this happened quite a lot
 *         and he found such competition healthy. He gave them both a very
 *         simple task which was to find the Ramanujan Number but not just any
 *         Ramanujan Number.
 * 
 *         He would simply give them a number, N, and they would have to find
 *         the Nth Ramanujan Number. Also, finding the number just once would
 *         not be a wise option and so he would repeat the same thing several
 *         times.
 * 
 *         You are here, not just to see who wins between Ramesh and Suresh.
 *         Your task is to help the professor. You don't expect him to remember
 *         all the Ramanujan Numbers by heart, do you? But in order to determine
 *         the winner, the professor must himself know the answer. Provide him
 *         with the answer key so that he shall determine the winner!
 * 
 *         Input: First line of input will contain a number, t. It is the number
 *         of numbers the professor gives them both. Each of the next t lines
 *         would contain a number, N.
 * 
 *         Output: t lines, each of which contain the Nth Ramanujan Number.
 * 
 */
public class The_Admission_Problem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		//generating the ramanujan numbers and storing in array
		/*int arr[]=new int [100];
		int c=0;int n=1730;
		arr[0]=1729;
		while(c<99)
		{
			int cbroot=(int) Math.cbrt(n);
			int check=0,prevfir=0;
			for(int i=1;i<=cbroot;i++)
			{
				int fir=i*i*i;
				int left=(int)Math.cbrt(n-fir);
				int sec=left*left*left;
				if(sec==n-fir)
				{
					if(fir+sec==n&&sec!=prevfir)
					{
						check++;
						//System.out.println(fir+" "+sec+" "+n);
						prevfir=fir;
						if(check==2)
						{
							arr[++c]=n;
							System.out.print(arr[c]+",");
							break;
						}
					}
				}			
				
			}
			n++;
		}*/
		int arr1[]={1729,4104,13832,20683,32832,39312,40033,46683,64232,65728,110656,110808,134379,149389,165464,171288,
				195841,216027,216125,262656,314496,320264,327763,373464,402597,439101,443889,513000,513856,515375,
				525824,558441,593047,684019,704977,805688,842751,885248,886464,920673,955016,984067,994688,1009736,
				1016496,1061424,1073375,1075032,1080891,1092728,1195112,1260441,1323712,1331064,1370304,1407672,
				1533357,1566728,1609272,1728216,1729000,1734264,1774656,1845649,2048391,2101248,2301299,2418271,
				2515968,2562112,2585375,2622104,2691451,2864288,2987712,2991816,3220776,3242197,3375001,3375008,
				3511872,3512808,3551112,3587409,3628233,3798613,3813992,4033503,4104000,4110848,4123000,4174281,
				4206592,4342914,4467528,4505949,4511808,4607064,4624776,4673088};
		//System.out.print("\nfinish");
		int T=Integer.parseInt(br.readLine().trim());	
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			out.println(arr1[N-1]);
			
		}
		out.close();

	}

}
