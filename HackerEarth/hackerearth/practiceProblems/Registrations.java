package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Registrations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int T=Integer.parseInt(br.readLine().trim());
        String arr[]=new String[T];
        int i=0;
        while(i<T)
        {	
        	if((s=br.readLine().trim())!=null){
        		arr[i]=s;
        		i++;
        	}
        }
        String ans="";
        if(arr.length>=2)
        {
        	ans=add(arr[0],arr[1]);
        	//System.out.println(ans);
        	for(i=2;i<arr.length;i++)
        	{
        		ans=add(ans,arr[i]);
        	}
        }
        else
        {
        	ans=arr[0];
        }
        
        while(ans.length()>1)
        {
        	String finans=ans;
        	long adder=0l;
        	for(i=0;i<finans.length();i++)
        	{
        		int num=finans.charAt(i)-48;
        		adder+=num;
        	}
        	ans=String.valueOf(adder);
        }
        System.out.println(ans);
	}

	private static String add(String s1, String s2) {
		// TODO Auto-generated method stub
		int max=Math.max(s1.length(),s2.length());
		int start1=s1.length()-1;
		int start2=s2.length()-1;
		String ans="";
		int carry=0;
		
		while(max-->0)
		{
			if(start1>=0&&start2>=0)
			{
				int a=s1.charAt(start1)-48;
				int b=s2.charAt(start2)-48;
				int adder=a+b+carry;
				ans=(adder%10)+ans;
				carry=adder/10;
				start1--;
				start2--;
			}
			else if(start1>=0)
			{
				int a=s1.charAt(start1)-48;
				int adder=a+carry;
				ans=(adder%10)+ans;
				carry=adder/10;
				start1--;
			}
			else if(start2>=0)
			{
				int a=s2.charAt(start2)-48;
				int adder=a+carry;
				ans=(adder%10)+ans;
				carry=adder/10;
				start2--;
			}
			
		}
		if(carry>0)
			ans=carry+ans;
		
		return ans;
	}

}
