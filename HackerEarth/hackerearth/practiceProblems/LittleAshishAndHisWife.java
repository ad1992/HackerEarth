package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @username aa1992
 * 		   Little Ashish had no interest in studying ever in his life.
 *         So, he always wanted to marry as soon as possible, and kept forcing
 *         his parents to get him married. He thought his married life was going
 *         to be fun. But, well, surprise, surprise... it's not - not for him,
 *         at least.
 * 
 *         Fulfilling the demands of his wife is a huge problem for him. She
 *         wants costumes, a lot of them - and it's getting impossible for
 *         Ashish to buy her all the clothes she asks for. Fortunately, for
 *         Ashish, he knows that out of n dresses, his wife only needs x
 *         different type of dresses. Now Ashish doesn't want to spend and waste
 *         a lot of time on this whole thing - so the only strategy he's decided
 *         to follow is to not follow any strategy - that is to say, he gets all
 *         the n dresses, and gifts them to his wife for her to figure out how
 *         many different dresses has he managed to bring.
 * 
 *         Given the number of dresses, n, number of dresses he has to select, x
 *         - find out what his wife feels for him.
 * 
 */
public class LittleAshishAndHisWife {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int X=Integer.parseInt(st.nextToken());
				Set<Long> set=new HashSet<Long>();
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					
					while(st.hasMoreTokens())
					{
						long num=Long.parseLong(st.nextToken());
						if(!set.contains(num))
						{
							set.add(num);
						}
					}
				}
				if(set.size()==X)
				{
					System.out.println( "Perfect husband");
				}
				else if(set.size()<X)
				{
					System.out.println("Bad husband");
					
				}
				else
				{
					System.out.println("Lame husband");
				}
			}
		}

	}

}
