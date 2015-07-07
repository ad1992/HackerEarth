package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *  Today little Oz is in a great mood of solving some
 * programming task but unfortunately he don't have one to solve. So he called
 * his friend finely to get some programming task as finely is an experienced
 * guy in the field of PROGRAMMING. Finley took a paper and wrote a classical
 * problem and handed it to Oz. Problem was like this :
 * 
 * "Given a string S consisting of letters 'O' and 'Z'. Calculate the minimum number of changes required such that all O's are adjacent to each other and all Z's are adjacent to each other. One change is equivalent to swapping two neighbouring letters."
 * 
 */
public class OZTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int Zleft=0,Zright=0;int Oleft=0,Oright=0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='0')
					{
						Oleft++;
					}
					else
						Zleft++;
					
				}
				for(int i=s.length()-1;i>=0;i--)
				{
					if(s.charAt(i)=='0')
					{
						Oright++;
					}
					else
						Zright++;
				}
				System.out.println(Math.min(Zleft, Zright));
				T--;
			}
		}
	}

}
