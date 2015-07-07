package collegeChallenges.codestellar2_0;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class String_Puzzle {
	static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
	static String pre="",post="";
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			try{
			
			
			String s=sc.nextLine().trim();
			
			int T=sc.nextInt();
			
			while(T-->0)
			{
				//System.out.println(T);
					sc.nextLine();
					int start=sc.nextInt();
					int end=sc.nextInt();
					int str=Math.min(start, end);
					int endr=Math.max(start,end);
					char[] word=new char[s.length()+1];
					for(int i=0;i<s.length();i++)
					 word[i]=s.charAt(i);
					
					//System.out.println(start+" "+end);
							
					getAnagrams(word,str,endr);			
					System.out.print("\n");				
				
				
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally{
			out.close();
			sc.close();
			}
		}

		private static void getAnagrams(char w[], int i, int l) {
			// TODO Auto-generated method stub
			if(i==l)
			{
				String s=String.valueOf(w);
				System.out.println(s+"\n");
			
			}
			else{
				
			for(int j=i;j<=l;j++)
			{
				
				char temp;
				temp=w[i];
				w[i]=w[j];
				w[j]=temp;
				getAnagrams(w, i+1, l);		
				temp=w[i];
				w[i]=w[j];
				w[j]=temp;
				
				
			}
			}
		
		}

		
	}
