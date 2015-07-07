package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class Survival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			long c=1;

			while(c<=N){
				c<<=1;
				//printf("%lld\n",c);
			}
			c>>=1;
			long ans=(N-c)*2+1;
			System.out.println(ans);
			
			
		}
		sc.close();
	}

}
