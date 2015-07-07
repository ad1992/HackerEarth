package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class ZoomWaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			if(sc.hasNextLine()){
			long A=sc.nextLong();
			Long B=sc.nextLong();
			long x,y,z;
			x=y=z=0;
			for(long i=A;i<=B;i++)
			{
				if(i%5==0&&i%3==0)
				{
					z++;
					
				}
				else  if(i%5==0)
				{
					y++;
				}
				else if(i%3==0)
				{
					x++;
				}
					
			}
			System.out.print(x+" "+y+" "+z+"\n");
			}
			else
				break;
			
		}
		sc.close();
	}

}
