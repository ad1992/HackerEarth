package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class SumitAndIndianCurrency {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine().trim());
		String s="";StringTokenizer st;
		while(N>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int l=s.length();int i=0;
				StringBuilder s1=new StringBuilder(s);
				if(l>3)
				{
				
					 s1.insert(l-3,',');	
					// System.out.print(l-6);
					for(i=l-5;i>0;i-=3)
					{
						
						s1.insert(i, ',');
						
					}
				
				}
					
				out.print(s1+"\n");
				N--;
				
			}
		}
		out.close();

	}

}
