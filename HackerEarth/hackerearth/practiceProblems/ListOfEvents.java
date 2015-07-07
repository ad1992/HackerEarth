package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ListOfEvents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T>0)
		{
			String s=br.readLine().trim();
			String prev="";int ind=0;
			if(s!=null&&!s.isEmpty())
			{
				
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					if(ch>='0' &&ch<='9')
					{
						int num=ch-48;
						String text=prev;
						prev="";
						for(int j=1;j<=num;j++)
						{
							prev+=text;
								
							
						}
						System.out.println(prev);
						
					}
					else{
					prev+=ch;
					}
				}
				System.out.println(prev);
				T--;
			}
		}

	}

}
