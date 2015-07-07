package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class LongestPalindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());		
		String s;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				//System.out.println(s.length());
				int len=getLongestPal(s);
				System.out.println(len);
				T--;
			}
		}

	}

	private static int getLongestPal(String s) {
		// TODO Auto-generated method stub
		boolean len[][]=new boolean[s.length()][s.length()];
		int l=s.length();int maxlen=0;
		for(int i=0;i<l;i++)
		{
			len[i][i]=true;
			maxlen=1;
		}
		for(int i=0;i<l-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			len[i][i+1]=true;
			maxlen=2;
		}
		for(int i=3;i<=l;i++)
		{
			for(int j=0,k=j+i-1;k<l;j++,k++)
			{
				if((len[j+1][k-1])&&(s.charAt(j)==s.charAt(k)))
				{
					if(maxlen<i){
						maxlen=i;
						//System.out.println(maxlen);
					}
					len[j][k]=true;
					
				}
				
			}
		}
		return maxlen;
	}

}
