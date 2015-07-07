package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



/**
 * @author Aakansha Doshi
 *
 */
public class CakeWalk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine())-1;
		String fir=br.readLine();
		String s="";StringTokenizer st;
		while(N>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int num=Integer.parseInt(st.nextToken());
				s=st.nextToken();
				s=fir.substring(0,num)+s;
				fir=s;
				N--;
			}
			
		}
		System.out.println(s);
	}

}
