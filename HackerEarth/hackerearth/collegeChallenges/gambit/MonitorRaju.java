package collegeChallenges.gambit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MonitorRaju {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());long ans=0;
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int age[]=new int[N];
			String name[]=new String[N];
			int i=0;
			while(i<N)
			{
				if((s=br.readLine().trim())!=null)
				{
					st=new  StringTokenizer(s);
					age[i]=Integer.parseInt(st.nextToken());
					name[i]=st.nextToken();
					i++;
				}
			}
			for(i=0;i<N;i++)
			{
				int small=age[i];
				int pos=i;
				for(int j=i+1;j<N;j++)
				{
					if(age[j]<small)
					{
						small=age[j];
						pos=j;
					}
				}
				int temp=age[i];
				age[i]=age[pos];
				age[pos]=temp;
				String t=name[i];
				name[i]=name[pos];
				name[pos]=t;
			}
			int roll=Integer.parseInt(br.readLine());
			System.out.println(name[roll-1]);
		}
	}

}
