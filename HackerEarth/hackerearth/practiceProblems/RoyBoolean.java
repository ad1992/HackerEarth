package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class RoyBoolean {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int prime[]=new int[100001];
		 for(int i=1;i<=1000;i++)
			 prime[i]=i;
		 prime[1]=0;
		 for(int i=2;i<=1000;i++)
		 {
			 if(prime[i]==i)
			 {
				 for(int j=i*i;j<=100000;j+=i)
					 prime[j]=i;
			 }
		 }
		 int T=Integer.parseInt(br.readLine().trim());
		 while(T-->0)
		 {
			 int N=Integer.parseInt(br.readLine().trim());
			 String ans="";
			 if(prime[N]==N)
			 {
				 if(prime[N-1]==N-1)
				 {
					 ans="TRUE";
				 }
				 else
				 {
					 ans="FALSE";
				 }
				 
			 }
			 else
			 {
				int c=0;
				 for(int i=1;i<N;i++)
				 {
					 if(gcd(i,N)==1)
					 {
						 c++;
					 }
				 }
				 if(prime[c]==c)
				 {
					 ans="TRUE";
				 }
				 else
				 {
					 ans="FALSE";
				 }
			 }
			 System.out.println(ans);
			 
		 }

	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		
		return gcd(b,a%b);
	}

}
