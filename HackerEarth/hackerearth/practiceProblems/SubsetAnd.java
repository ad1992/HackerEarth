package practiceProblems;
import java.util.Scanner;

/**
 * @author Aakansha Doshi
 *
 */
public class SubsetAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
	
		while(T-->0)
		{
			sc.nextLine();
			int N=sc.nextInt();
			int M=sc.nextInt();
			//System.out.println(N+" "+M);
			sc.nextLine();
			long And=N;;
			while(M-->0)
			{
				int num=sc.nextInt();
				And&=num;
				//System.out.println("ans"+And);
			}
			if(And==0)
				System.out.println("Yes");
			else
					System.out.println("No");
			
		}
		sc.close();
	}

}
