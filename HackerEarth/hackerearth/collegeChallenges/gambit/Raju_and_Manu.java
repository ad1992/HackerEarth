package collegeChallenges.gambit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class Raju_and_Manu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		int maxbin[]=new int[100001];int sum=0;int largest=0;
		for(int i=1;i<maxbin.length;i++)
		{
			
			String s=Integer.toBinaryString(i);int add=0;
			for(int j=0;j<s.length();j++)
			{
				add+=s.charAt(j)-48;
			}
			if(add>=sum)
			{
				largest=i;
				sum=add;
			}
			maxbin[i]=largest;
		}
			/*for(int i=1;i<=100;i++)
				System.out.println(i+" "+maxbin[i]);*/
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			
			
			System.out.println(maxbin[N]);
			
		}
	}

}
