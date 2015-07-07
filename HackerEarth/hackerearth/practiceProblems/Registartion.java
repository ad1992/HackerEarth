package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class Registartion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s;
		while(N-->0)
		{
			if((s=br.readLine())!=null)
			{
				int sum=0;
				for(int i=0;i<s.length();i++)
				{
					sum=sum+(s.charAt(i)-48);
				}
				while(sum>9)
				{
					int n=sum;int su=0;int r;
					while(n!=0)
					{
						r=n%10;
						su=su+r;
						n/=10;
						
					}
					sum=su;
				}
				System.out.println(sum);
			}
		}

	}

}
