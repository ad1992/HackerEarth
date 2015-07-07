package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;


/**
 * @author Aakansha Doshi
 *
 */
public class Nthfibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BigInteger arr[]=new BigInteger[100000];
		arr[0]=BigInteger.ZERO;
		arr[1]=BigInteger.ONE;
		arr[2]=BigInteger.ONE;
		for(int i=3;i<100000;i++)
		{
			arr[i]=arr[i-1].add(arr[i-2]);
			
			
		}
		System.out.println(arr[arr.length-1].toString().length());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			out.print(arr[N]+"\n");
		}
		out.close();
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