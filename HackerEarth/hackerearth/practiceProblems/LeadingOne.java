package practiceProblems;
import java.util.Scanner;


public class LeadingOne {
static long num=0l;
private static long con=1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			sc.nextLine();
			int a=sc.nextInt();
			int b=sc.nextInt();
			String s="";
			for(int i=0;i<a;i++)
			{
			s+="0";	
			}
			for(int i=0;i<b;i++)
			{
			s+="1";	
			}
			StringBuffer w=new StringBuffer(s);
			num=0l;
			getAnagrams(w, 0,a+b-1);
			System.out.println(num);
			
			
		}
		sc.close();

	}
	private static void getAnagrams(StringBuffer w, int i, int l) {
		// TODO Auto-generated method stub
		if(i>=l)
		{
			
			if(w.charAt(0)=='1')
			{
				//System.out.println(w);
				num=(num%con+1)%con;
			}
		
		}
		else{
			boolean check[]=new boolean[2];
		for(int j=i;j<=l;j++)
		{
			if(!check[w.charAt(j)-48]){
			char temp;
			temp=w.charAt(i);
			w.setCharAt(i, w.charAt(j));
			w.setCharAt(j, temp);
			getAnagrams(w, i+1, l);		
			temp=w.charAt(i);
			w.setCharAt(i, w.charAt(j));
			w.setCharAt(j, temp);
			check[w.charAt(j)-48]=true;
			}
			
		}
		}
	
	
	}
}
