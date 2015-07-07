package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class SherlockWat {
static	boolean arr[]=new boolean[24];	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;	
			
		/*if (false) if (true) System.out.println("a"); else System.out.println("b"); 
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());	
				int start=(int) (Math.pow(2, a)-1);
				int end=(int) (Math.pow(2, b)-1);int count=0;
				for(int i=2;i<=Math.min(start,end);i++)
				{
					if(a%i==0&& b%i==0)
						count++;
				}
				
				System.out.println(count);
			
			}
		}*/
}

}
