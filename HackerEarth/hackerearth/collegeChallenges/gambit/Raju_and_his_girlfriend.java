package collegeChallenges.gambit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Raju_and_his_girlfriend {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		
		int keys[]={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		int shift[]={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
		int numbershift[]={2,5,4,4,4,4,4,5,4,5};
		
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int time=0;
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int z=Integer.parseInt(st.nextToken());
				if((s=br.readLine().trim())!=null)
				{
					int currkey=1;int i=0;
					while(i<s.length()&&time<z)
					{
						int ch=s.charAt(i);
						if((ch>='a' && ch<='z'))
						{
							
							time+=(shift[ch-97])*y;
							
							if(keys[ch-97]!=currkey)
							{
								time+=x;
							}
							currkey=keys[ch-97];
							
						}
						else if(ch>='0'&&ch<='9')
						{
							
							time+=(numbershift[ch-48])*y;
							int num=ch-48;
							
							if(num!=currkey)
							{
								time+=x;
							}
							currkey=num;
							
						}
						else
						{
							if(ch==' ')
							{
								
									time+=y;
								if(currkey!=0)
									time+=x;
								currkey=0;
							}
							else
							{
								if(ch=='.')
								{
									time+=y;
								}
								else if(ch==',')
								{
									time+=y*2;
								}
								else if(ch=='?')
									time+=y*3;
								else if(ch=='!')
									time+=y*4;
								if(currkey!=1)
									time+=x;
								currkey=1;
								
							}
							
							
						}
						if(time>z)
							break;
						System.out.println(s.charAt(i)+" "+currkey+" "+time);
						i++;
						
					}
					System.out.println(s.substring(0,i));
				}
				
			}
		}

	}

}
