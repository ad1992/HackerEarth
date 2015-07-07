package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class RoundIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int n=sc.nextInt();
			int b=sc.nextInt();			
			double d=(double)n/b;
			int upper=(int) Math.ceil(d);
			int lower=(int) Math.floor(d);
			long ans1=upper*b;
			long ans2=lower*b;
			//System.out.println(ans1);
			//System.out.println(ans2);
			long diff1=Math.abs(ans1-n);
			long diff2=Math.abs(ans2-n);
			if(diff1<=diff2)
			System.out.println(ans1);
			else
				System.out.println(ans2);
		}
		
	}

}
