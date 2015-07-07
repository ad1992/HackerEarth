package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @username Aakansha Doshi
 * 
 *           Xsquare got bored playing with the arrays all the time. Therefore,
 *           he has decided to play with the strings. Xsquare called a string P
 *           a "double string" if string P is not empty and can be broken into
 *           two strings A and B such that A + B = P and A = B. for eg : strings
 *           like "baba" , "blabla" , "lolo" are all double strings whereas
 *           strings like "hacker" , "abc" , "earth" are not double strings at
 *           all.
 * 
 *           Today, Xsquare has a special string S consisting of lower case
 *           English letters. He can remove as many characters ( possibly zero )
 *           as he wants from his special string S. Xsquare wants to know , if
 *           its possible to convert his string S to a double string or not.
 * 
 *           Help him in accomplishing this task.
 * 
 */
public class XaquareAndDoubleStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T-->0)
		{
		if((s=br.readLine().trim())!=null)
		{
			boolean arr[]=new boolean[26];boolean flag=false;
			for(int i=0;i<s.length();i++)
			{
				int ch=s.charAt(i)-97;
				if(!arr[ch])
					arr[ch]=true;
				else
				{
					flag=true;
					break;
					
				}
			}
			if(!flag)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		}

	}

}
