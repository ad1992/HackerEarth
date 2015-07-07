package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class SaduAndBabu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int m1=sc.nextInt();
			int n1=sc.nextInt();
			int m2=sc.nextInt();
			int n2=sc.nextInt();
			int n=sc.nextInt();
			long ans1=1;
			for(int i=1;i<=n1;i++)
			{
				ans1=(ans1%n*m1%n);
			}
			long ans2=1;
			for(int i=1;i<=n2;i++)
			{
				ans2=(ans2%n*m2%n);
			}
			long ans3=1;
			for(long i=1;i<=ans2;i++)
			{
				ans3=(ans3%n*ans1%n);
			}
			System.out.println(ans3);
		}

	}

}
