package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LIttleDipuSol {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		StringTokenizer st;
		int T;			
		
		T=Integer.parseInt(br.readLine());
		while(T-->0)
		{	
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long a=Long.parseLong(st.nextToken());
				long b=Long.parseLong(st.nextToken());	
				//System.out.println(" a= "+a+" b= "+b);
				long ans1= find(b);
				System.out.println("ans1="+ans1);
				long ans2=find(a);
				System.out.println("ans2="+ans2);
				if(ans2*ans2!=a)
					ans2++;
				System.out.println(ans1-ans2+1);
				
			}

		}
	}

	private static long find(long n) {
		// TODO Auto-generated method stub
		long low,high,mid;
		low = 1;
		high = 1000000000;	
		long ans=0;
		while (low <= high) {
		//System.out.println("low= "+low);
		//System.out.println("high= "+high);
		mid = (low + high) / 2;
		//System.out.println("mid= "+mid);
		if(mid*mid<=n)
		{
			ans=mid;
			//System.out.println("mid= "+mid);
			low=mid+1;
			
		}
		else
		{
			high=mid-1;
		}
	}
		return ans;
}
}