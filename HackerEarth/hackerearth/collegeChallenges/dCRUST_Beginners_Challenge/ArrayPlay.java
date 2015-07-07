package collegeChallenges.dCRUST_Beginners_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class ArrayPlay {
static long storage[]=new long[100001];
static long prime[]=new long[141422];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int arr1[]=new int[N];		
		int arr2[]=new int[N];
		String s1=br.readLine();
		String s2=br.readLine();
		StringTokenizer st1,st2;
		st1=new StringTokenizer(s1);
		st2=new StringTokenizer(s2);
		for(int i=0;i<141422;i++)
		{
			prime[i]=i;
		}
		for(int i=2;i<141422;i++)
		{
			if(prime[i]==i)
			{
				for(int j=i*i;j<141422;j+=2)
				{
					prime[j]=i;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			arr1[i]=Integer.parseInt(st1.nextToken());
			arr2[i]=Integer.parseInt(st2.nextToken());
		}
		long inverse=0;
		for(int i=N-1;i>=0;i--)
		{
			inverse+=check(arr1[i]-1);
			long temp=check(arr1[i]-1);
			//System.out.println(arr1[i]+" " +temp);
			update(arr2[i]);
		}
		System.out.println(inverse);
		}
		
		
	

	private static void update(int i) {
		// TODO Auto-generated method stub
		while(i<=100000)
		{
			storage[i]+=1;
			//System.out.println("i= "+i+" storage= "+storage[i]);
			i=i+(i&-i);
		}
	}

	private static long check(int i) {
		// TODO Auto-generated method stub
		long in=0;
		while(i>0)
		{
			in+=storage[i];
			//System.out.println("i= "+i+" in= "+in);
			i=i-(i&-i);
		}
		return in;
	}

}
