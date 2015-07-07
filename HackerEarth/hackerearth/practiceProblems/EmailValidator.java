package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class EmailValidator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s;
		while(N-->0)
		{
			if((s=br.readLine())!=null)
			{
				int index1=s.indexOf('@');
				if(index1==-1)
				{
					System.out.println("NO");
				}
				else
				{
					String username=s.substring(0,index1);
				//	System.out.println("username"+username);
					int domainindx=s.indexOf('.');
					if(domainindx==-1||username.length()>16||username.length()==0)
					{
						System.out.println("NO");
					}
					else{
					
						String mailtype=s.substring(index1+1,domainindx);
					//	System.out.println("mailtype"+mailtype);
						String domain=s.substring(domainindx+1);
					//	System.out.println("domain"+domain);
						int count=0;
						for(int i=0;i<username.length();i++)
						{
							char ch=username.charAt(i);
							if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')||ch=='_')
							{
								count++;
							}
							
								
						}
						if(count==username.length())
						{
							boolean gotalpha=false;count=0;
							for(int i=0;i<mailtype.length();i++)
							{
								char ch=mailtype.charAt(i);
								if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')||ch=='-')
								{
									if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
									{
										gotalpha=true;
										
									}
									count++;
								}
								else{
									
									break;
								}
							}
							if(gotalpha&&count==mailtype.length()&&count<16)
							{
								int domaincount=0;
								for(int i=0;i<domain.length();i++)
								{
									char ch=domain.charAt(i);
									if(ch>='a'&&ch<='z')
									{
										domaincount++;
										count++;
									}
									else
										break;
								}
								if(domaincount==domain.length() && domain.length()>=1 && domain.length()<=10&& count<=16)
								{
									System.out.println("YES");
								}
								else
									System.out.println("NO");
							}
							else
							{
								//System.out.println(count);
								System.out.println("NO");
							}
								
						}
						else
							System.out.println("NO");
					}
				}
			}
		}
			
		
	}

}
