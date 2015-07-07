package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @username Aakansha Doshi
 * 
 *           Xsquare loves to eat chocolates like we all do. Xsquare's father
 *           has given him a chocolate bar B of length N where each chocolate
 *           piece is either of strawberry flavour S or of caramel flavour C.
 *           Xsquare's mom does not want him to eat all the chocolates as she
 *           thinks that consumption of too many chocolates will make him
 *           chocoholic. Therefore, she decided to take some chocolates back
 *           from him. She has some empty boxes to keep chocolates. Each box can
 *           contain exactly three chocolates. No box can contain all the
 *           chocolates of same flavour. She has ordered Xsquare to return her
 *           back, the longest contiguous sub-bar of the original chocolate bar
 *           such that she can place every three consecutive chocolates from
 *           that contiguous chocolate bar in an empty box. Each empty box can
 *           accomodate exactly three chocolates, neither less, nor more. A
 *           sub-bar is defined as contiguous peices of chocolates in some
 *           particular range.
 * 
 *           Xsquare agrees to whatever his mom has ordered. Now, he is
 *           wondering how many chocolates he is able to eat at the end after he
 *           returns the longest contiguous sub-bar.
 * 
 *           Help him in accomplishing this task.
 * 
 */
public class XSquareAndChocolateBars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int dp[]=new int[s.length()];
				for(int i=2;i<s.length();i++)
				{
					if(!((s.charAt(i)==s.charAt(i-1))&&(s.charAt(i-1)==s.charAt(i-2))))
					{
						dp[i]=3;
						if(i>3)
						dp[i]+=dp[i-3];
					//	System.out.println("i="+i);
					}
				
					
				}
				int max=Integer.MIN_VALUE;
				
				for(int i=0;i<dp.length;i++)
				{
			//System.out.print(dp[i]+" ");
					if(dp[i]>max)
						max=dp[i];
				}
			//System.out.println();
				System.out.println(s.length()-max);
			}
		}

	}

}
