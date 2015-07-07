package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class Socks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int T=Integer.parseInt(br.readLine());
		 while(T-->0)
		 {
			 int n=Integer.parseInt(br.readLine());
			 
				String s=br.readLine();
				int missing=0;String st="";
				String arr[]=s.split(" ");							
				
				int check[]=new int[100001];				 
				 for(int i=0;i<n;i++)
				 {
					String ch=arr[i];
					int num=Integer.parseInt(ch);
					check[num]++;
					
					//System.out.println(ch+" "+t);
					
					
				 }
				 for(int i=0;i<=100000;i++){
					 if(check[i]==1)
					 {
						 missing=i;
					 }
				 }
				 System.out.println(missing);
			 }
		 }
		 
	

}
