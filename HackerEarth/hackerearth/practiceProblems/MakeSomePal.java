package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MakeSomePal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s;
	        int T=Integer.parseInt(br.readLine());
	        while(T-->0)
	        {	
			if((s=br.readLine())!=null){
				int max=0;
			for(int i=s.length()-2;i>=0;i--)
			{
				String sub=s.substring(i,s.length());
				String rev="";
				for(int j=sub.length()-1;j>=0;j--)
				{
					rev+=sub.charAt(j);
				}
				if(sub.equals(rev)&&sub.length()>max)
				{
					max=sub.length();
				}
			}
			int ans;
			if(max>0)
			 ans=s.length()-max;
			else
				ans=s.length()-1;
			System.out.println(s.length()+ans);
					
			}
		}
		

	}

}
