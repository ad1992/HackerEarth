package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class NameString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int T=Integer.parseInt(br.readLine());
		 String s;
		 StringTokenizer st;
		 
		 while(T-->0)
		 {
			 if((s=br.readLine())!=null)
			 {
				 st=new StringTokenizer(s);
				 int r=Integer.parseInt(st.nextToken());
				 int k=Integer.parseInt(st.nextToken());
				 int v=Integer.parseInt(st.nextToken());
				int fir=Math.max(r, Math.max(k,v));
				int sec=0;
				if(fir==r)
				{
					sec=Math.max(k, v);
				}
				else if(fir==k)
				{
					sec=Math.max(r, v);
				}
				else
				{
					sec=Math.max(r, k);
				}
				int c=0;int len=0;
				while(sec!=0)
				{
					if(c==0)
					{
						fir--;
					}
					else
						sec--;
					c=c^1;
					len++;
				}
				System.out.print(len);
			 }
		 }
	}

}
