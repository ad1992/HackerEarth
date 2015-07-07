package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class EquivalentStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s1,s2,s;
	        StringTokenizer st;
	        int T=Integer.parseInt(br.readLine());
	        while(T-->0)
	        {
	        	if((s1=br.readLine())!=null)
	        	{
	        		
	        		if((s2=br.readLine())!=null)
	        		{
	        			
	        			
	        			int Q=Integer.parseInt(br.readLine());
	        			while(Q-->0)
	        			{
	        				if((s=br.readLine())!=null)
	        				{
	        					
	        					st=new StringTokenizer(s);
	        					int i=Integer.parseInt(st.nextToken())-1;
	        					int j=Integer.parseInt(st.nextToken())-1;
	        					int k=Integer.parseInt(st.nextToken());
	        					String fir[]=new String[26];
	        					String sec[]=new String[26];
	        					String s11=s1.substring(i,i+k);
	        					String s22=s2.substring(j,j+k);
	        					for(int i1=0;i1<s11.length();i1++)
	        					{
	        						int ascii=s11.charAt(i1)-97;
	        						if(fir[ascii]==null)
	        						fir[ascii]=""+i1;
	        						else
	        						fir[ascii]+=" "+i1;
	        					}
	        					for(int i1=0;i1<s22.length();i1++)
	        					{
	        						int ascii=s22.charAt(i1)-97;
	        						if(sec[ascii]==null)
	        						sec[ascii]=""+i1;
	        						else
	        						sec[ascii]+=" "+i1;
	        					}
	        					boolean no=false;
	        					for(int i1=0;i1<26;i1++)
	        					{
	        						String got;
	        						if(fir[i1]!=null)
	        						{
	        							got=fir[i1];
	        							boolean flag1=false;
	        						for(int j1=0;j1<26;j1++)
		        					{
	        							if(sec[i1]!=null&&sec[i1].equals(got))
		        						{
		        							flag1=true;
		        							break;
		        						}
		        					}
	        						if(!flag1)
	        						{
	        							no=true;
	        							
	        							break;
	        						}
	        						}
	        					}
	        					if(no)
	        					{
	        						System.out.print("no\n");
	        					}
	        					else
	        					{
	        						System.out.print("yes\n");	
	        					}
	        				}
	        			}
	        		}
	        	}
	        }
	}
	}

