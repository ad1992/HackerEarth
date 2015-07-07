package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *		  @author Aakansha Doshi
 * 
 *         Chandu and chandni Talk on phone for a long time daily. Being afraid
 *         that someone will hear their private conversation chandu suggested
 *         chandni an idea. He suggested that he will talk only with encrypted
 *         strings with her and only she would know, how to decrypt the string.
 *         So that even if someone hears, He/She would not be able to anticipate
 *         their conversation.
 * 
 *         Rules of encryption are as follows: 1. String on length N is assumed
 *         to be cyclic consisting of lower case English alphabets. 2. In each
 *         iteration, we pick the last character and put it in starting of the
 *         string. For example: april performing iterations and collecting each
 *         string formed in a set until we get the original string. Ex:
 *         {april,lapri, ilapr, rilap, prila} 3. sort the set of string in
 *         lexicographically reverse order. Ex: {rilap, prila,lapri, ilapr,
 *         april } 4. Taking the last character of each string in the set is the
 *         encrypted string. Ex: pairl
 * 
 *         Chandu also sends the position(K) of first letter in encrypted string
 *         from original string i.e 2 (p is on position 2 in original string and
 *         is the first character of encrypted string)
 * 
 *         Now, Chandni is ofcourse not that brilliant to decrypt the strings in
 *         real time and understand what chandu is saying. So, chandu decided to
 *         write a program for the same.
 * 
 *         Help chandu write this program.
 * 
 */
public class ChanduAndChandniSecret {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				String s1=st.nextToken();
				char original[]=s1.toCharArray();
				char arr[]=s1.toCharArray();
				int p=Integer.parseInt(st.nextToken())-1;
				int index[]=new int[s1.length()];
				for(int i=0;i<s1.length();i++)
					index[i]=i;
				int len=s1.length();
				for(int i=0;i<len;i++)
				{
					char large=arr[i];
					int pos=i;
					for(int j=i+1;j<len;j++)
					{
						if(arr[j]>large)
						{
							large=arr[j];
							pos=j;
						}
					}
					char temp=arr[i];
					arr[i]=arr[pos];
					arr[pos]=temp;
					int t=index[i];
					index[i]=index[pos];
					index[pos]=t;
				}
				
				String ans="";
				for(int i=0;i<len;i++)
				{
					
					ans+=original[p];
					System.out.print(index[i]+" ");
					p=index[p];
				}
			//	System.out.println(ans);
				T--;
				
			}
		}

	}

}
