package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author aakansha
 * 
 *         Xsquare loves to play with strings a lot. Today, he has two strings
 *         S1 and S2 both consisting of lower case alphabets. Xsquare listed all
 *         subsequences of string S1 on a paper and all subsequences of string
 *         S2 on a separate paper. Xsquare wants to know whether there exists a
 *         string which is listed on both the papers.
 * 
 *         Xsquare thinks that this task is pretty boring and handed it to you.
 *         Please accomplish this task on his behalf.
 * 
 */
public class XSquareAndTwoStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s1,s2;
		while(T>0)
		{
			if((s1=br.readLine().trim())!=null)
			{
				if((s2=br.readLine().trim())!=null)
				{
					boolean c1[]=new boolean[26];
					
					for(int i=0;i<s1.length();i++)
					{
						int ch=s1.charAt(i)-97;
						if(!c1[ch])
							c1[ch]=true;
						
					}
					boolean flag=false;
					for(int i=0;i<s2.length();i++)
					{
						int ch=s2.charAt(i)-97;
						if(c1[ch])
						{
							flag=true;
							break;
						}
						
					}
					if(!flag)
					{
						System.out.println("No");
					}
					else
						System.out.println("Yes");
					T--;
				}
			}
		}
	}

}
