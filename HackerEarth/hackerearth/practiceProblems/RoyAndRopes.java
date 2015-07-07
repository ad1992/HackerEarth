package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Roy has a rope of length L meters. This rope has several other ropes
 *         attached to it at the end of every meter (except for the end of the
 *         rope). At each meter there are two ropes attached to this main rope,
 *         let's call them upper and lower ropes. See the following example. Roy
 *         lit the rope on fire from the left end. This fire burns down the rope
 *         by 1 meter/minute. Your task is to find how much time (in minutes)
 *         will the fire take to burn down the entire rope.
 * 
 */
public class RoyAndRopes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			int l=Integer.parseInt(br.readLine().trim());
			int upper[]=new int[l+1];
			int lower[]=new int[l+1];
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=1;i<l;i++)
				{
					upper[i]=Integer.parseInt(st.nextToken());
					
				}
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					for(int i=1;i<l;i++)
					{
						lower[i]=Integer.parseInt(st.nextToken());
					}
					long time=0l;
					int i=1;
					while(i<l)
					{
						
						time=Math.max(time,Math.max(i+upper[i],i+lower[i]));											
						i++;
						
					}
					if(upper[l-1]==0&&lower[l-1]==0)
					time++;
					System.out.println(time);
					
					T--;
				}
				
			}
		
		

		}

	}
}
