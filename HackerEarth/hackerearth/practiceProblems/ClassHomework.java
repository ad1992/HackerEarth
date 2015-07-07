package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class ClassHomework {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				
				
				
				long max=1000000000000l;
				
				long first=0l,sec=0l,third=0l,fourth=0l;
				int i=0,j=0,k=0,l=0;int count=0;
				
				
				if(s.length()<4||s.length()>48)
				{
					l=0;
				}
				else{
				for(i=0;i<s.length();i++)
				{
					long ch=s.charAt(i)-48;
					int len=s.substring(i).length();
					if((i>0&&s.charAt(i)>s.charAt(i-1)&&len>count)||len==3)
					{	if(len<=36){
						
					
						break;
					}
					}
					
						if(ch==0&&i==0){
							i++;
							break;
							
						}
						if(first*10+ch<=max&&s.substring(i+1).length()>=3){
						first=first*10+ch;
						count++;
						}
						else
						{
							break;
						}
					
				}
				//System.out.print(first+" ");
			
				for(j=i;j<s.length();j++)
				{
					long ch=s.charAt(j)-48;
					int len=s.substring(j).length();
					if((j>i&&s.charAt(j)>s.charAt(j-1)&&len>count)||len==2)
					{	if(len<=24)
						break;
					}
					
						if(ch==0&&j==i){
							j++;
							break;
							
						}
						if(sec*10+ch<=max&&s.substring(j+1).length()>=2){
						sec=sec*10+ch;
						count++;
						}
						else
						{
							break;
						}
					
				}
				//System.out.print(sec+" ");
				
				for(k=j;k<s.length();k++)
				{
					long ch=s.charAt(k)-48;
					int len=s.substring(k).length();
					if((k>j&&s.charAt(k)>s.charAt(k-1)&&len>count)||len==1)
					{
						if(len<=12&&Long.parseLong(s.substring(k))<=max)
						break;
					}
					
						if(ch==0&&k==j){
							k++;
							break;
						}
						if(third*10+ch<=max&&s.substring(k+1).length()>=1){
						third=third*10+ch;
						count++;
						}
						else
						{
							break;
						}
					
				}
				//System.out.print(third+" ");
			
				for(l=k;l<s.length();l++)
				{
					long ch=s.charAt(l)-48;
					
						if(ch==0&&l==k){
							l++;
							break;
							
						}
						if(fourth*10+ch<=max){
						fourth=fourth*10+ch;
						count++;
						}
						else
						{
							break;
						}
					
				}
				System.out.print(first+" "+sec+" "+third+" "+fourth+"\n");
				}
				if(l==s.length())
				{
					long ans=first+sec+third+fourth;
					System.out.println(ans);
					
				}
				else
				{
					System.out.println("unlucky");
				}
			}
		}

	}

}
