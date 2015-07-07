package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class LittleDipu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		StringTokenizer st;
		int T;			
		
		T=Integer.parseInt(br.readLine());
		while(T-->0)
		{	
			long c=0;
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long a=Long.parseLong(st.nextToken());
				long b=Long.parseLong(st.nextToken());
				long sqr1=(long)(Math.floor(Math.sqrt(b)));
				long sqr2=(long)(Math.floor(Math.sqrt(a)));
				if(sqr2*sqr2!=a)
					sqr2++;
				
			//	System.out.println("sqr1= "+sqr1+" sqr2= "+sqr2);
				System.out.println(sqr1-sqr2+1);
				//System.out.println(c);
			}
		}
	}

}
