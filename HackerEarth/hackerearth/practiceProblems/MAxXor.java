package practiceProblems;
import java.util.Scanner;


public class MAxXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int a=sc.nextInt();
			int b=sc.nextInt();
			long max=0;
			for(int i=a;i<b;i++)
			{
				for(int j=i+1;i<=b;i++)
				{
					if(max<(i^j))
					{
						max=i^j;
					}
				}
			}
			System.out.println(max);
		}
	}

}
