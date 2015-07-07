package practiceProblems;
import java.util.Scanner;
/**
 * @author Aakansha Doshi
 *
 */
public class ACentrifugue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int M=sc.nextInt();
			int N=sc.nextInt();
			int time=0;
			if(N==0)
				time=0;
			else if(N<=M)
			{
				time=10;
			}
			else
			{
				
				double q=N*2.0/M*1.0;
				//System.out.println(q);
				if(q>(int)q)
				time=((int)q+1)*5;
				else
					time=((int)q)*5;
			}
			System.out.println(time);
			
			
			
			//System.out.println(time);
		}
		sc.close();
		

	}

}
