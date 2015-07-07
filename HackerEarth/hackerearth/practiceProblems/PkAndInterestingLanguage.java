package practiceProblems;
import java.util.Scanner;

/**
 * 			 @username Aakansha Doshi
 * 			 PK is an astronaut who went to a planet and was very
 *           fascinated by the language of its creatures. The language contains
 *           only lowercase English letters and is based on a simple logic that
 *           only certain characters can follow a particular character. * 
 *           Now he is interested in calculating the number of words of length L
 *           and ending at a particular character C. Help PK to calculate this
 *           value.
 * 
 */
public class PkAndInterestingLanguage {
private static long con=1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long arr[][]=new long[26][26];
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<26;j++)
			{
				arr[i][j]=sc.nextLong();
			}
			sc.nextLine();
		}
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			char c=sc.next().charAt(0);
			int l=sc.nextInt();
			long a[][]=arr;
			a=power(a,l-2);
			long sum=0l;
			//System.out.println(c-97);
			for(int i=0;i<26;i++)
			{
				
				sum=(sum+a[i][c-97])%con;
			}
			System.out.println(sum);
		}
		sc.close();

	}

	private static long[][] power(long[][] arr, int i) {
		// TODO Auto-generated method stub
		long a[][]=arr;
		while(i>0)
		{
			if((i&1)==1)
			{
				 a=mult(a,arr);
			}
		
			arr=mult(arr,arr);
			
			i>>=1;
		}
		return a;
		
	}

	private static long[][] mult(long[][] a, long[][] b) {
		// TODO Auto-generated method stub
		long c[][]=new long[26][26];
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<26;j++)
			{
				
				for(int k=0;k<26;k++ )
				{
					c[i][j]=(c[i][j]+(a[i][k]*b[k][j]))%con;
				}
			}
		}
		return c;
		
	}

}
