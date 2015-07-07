package collegeChallenges.imsec_January_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndianArmy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				int visited[]=new int[91];
				for(int i=0;i<91;i++)
					visited[i]=-1;
			
				int curr=1;int maxlen=1;visited[s.charAt(0)]=0;
				for(int i=1;i<s.length();i++)
				{
					char ch=s.charAt(i);
					int previous=visited[ch];
					if(previous==-1||i-curr>previous)
					{
					
					curr++;
					}
					else
					{
						if(maxlen<curr)
							maxlen=curr;
						curr=i-previous;
					}
					visited[ch]=i;
					
					
				}
				if(curr>maxlen)
					maxlen=curr;
					
				System.out.println(maxlen);
				
			}
		}
	}

}
