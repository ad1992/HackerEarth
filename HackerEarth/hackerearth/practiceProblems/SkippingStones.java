package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



/**
 * 			 @username Aakansha Doshi
 * 			 My flatmate, Sayan, went to the game show called Takeshi's
 *           castle.It is a game show in which you need to pass different game
 *           challenges to enter the final. 
 *           Now the most famous round of all of them is the "skipping stones".In the game you need to go from one end of a
 *           small puddle to the other end of it stepping on stones.Some of the
 *           stones are fixed while others sink as soon as you step on them. * 
 *           Now Sayan managd to bribe the gaurd and gather the information
 *           regarding each of the stones in the puddle. So he now knows the
 *           probability p of each stone staying stationary, i.e, the
 *           probability of stepping on a stone and not sinking is p.* 
 *           Now , as common sense suggests, Sayan can cross the puddle only if
 *           he steps on stationary stones only. 
 *           But Sayan, being a human being, has a fixed span of distance(L)
 *           which he can jump at once.You need to find out and inform Sayan the
 *           best probability of him crossing the puddle without sinking.* 
 *           NOTE: He can jump from one stone to another only if it is within L
 *           metres of distance.
 * 
 */
public class SkippingStones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		int D=Integer.parseInt(st.nextToken());
		float p[]=new float[n+2];
		int d[]=new int[n+2];
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		for(int i=1;i<=n;i++)
			p[i]=Float.parseFloat(st.nextToken());
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		for(int i=1;i<=n;i++)
			d[i]=Integer.parseInt(st.nextToken());
		p[0]=1.0f;
		d[0]=0;
		p[n+1]=1.0f;
		d[n+1]=D;
		for(int i=1;i<=n+1;i++)
		{
			int j=i-1;
			float max=-0.1f;
			while(j>=0&&d[i]-d[j]<=L)
			{
				max=Math.max(max, p[j]);
				j--;
			}
			if(max==-0.1f)
			{
				break;
			}
			//System.out.println(i+" "+max);
			p[i]*=max;
		}
		System.out.printf("%6f",p[n+1]);
		

	}

}
