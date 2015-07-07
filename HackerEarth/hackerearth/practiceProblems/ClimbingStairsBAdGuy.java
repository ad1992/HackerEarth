package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class ClimbingStairsBAdGuy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());		
		String s;
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long max=getways(N,0);
			System.out.println(max);
		}

	}

	private static long getways(int n,int a) {
		// TODO Auto-generated method stub
		if(a==n){
			//System.out.println("sasas");
			return 1;
		}
		if(a>n)
			return 0;
		
		return getways(n,a+1)+getways(n, a+2);
	}

}
