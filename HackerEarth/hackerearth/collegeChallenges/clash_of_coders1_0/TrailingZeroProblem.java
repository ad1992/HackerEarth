package collegeChallenges.clash_of_coders1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TrailingZeroProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0){
			int N=Integer.parseInt(br.readLine().trim());
		
		double len=0;
		for(int i=1;i<=N;i++)
		{
			len+=Math.log10(i);
		}
		long ans=(long) Math.ceil(len);
		int total=0;
		for(int i=5;i<=N;i*=5)
		{
			int f=N/i;
			total+=f;
			if(f==0)
			break;
		}
		long two=N/2;
		long ans1=Math.min(total, two);
		ans=ans-ans1;
		System.out.println(ans);
		}
	}
}
