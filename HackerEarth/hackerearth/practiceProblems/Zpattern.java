package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class Zpattern {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int n=Integer.parseInt(br.readLine());
		int c=n;
		for(int i=1;i<=n;i++)
		{
			
			if((i==1)||(i==n))
			{
				for(int j=1;j<=n;j++)
					System.out.print("*");
			}
			else
			{
				for(int k=1;k<=n;k++)
				{
					if(k==c)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
			c--;
		}
		
	}
}
