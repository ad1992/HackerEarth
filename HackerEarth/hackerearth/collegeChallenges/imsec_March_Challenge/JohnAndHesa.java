package collegeChallenges.imsec_March_Challenge;
import java.util.Scanner;


public class JohnAndHesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int X=sc.nextInt();
			int amount=X;
			int P=sc.nextInt();
			int c=0;
			if(X==1&&P==1)
				c=1;
			else{
			while(X%P==0)
			{
				c++;
				X=X/P;
			}
			}
			int left=amount-c*P;
			System.out.println(c+" "+left);
		}
	}

}
