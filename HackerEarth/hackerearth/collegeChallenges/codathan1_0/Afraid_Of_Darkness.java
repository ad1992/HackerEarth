package collegeChallenges.codathan1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 * 
 *         Little Anay is afraid of darkness. He has N candles where height of
 *         each candle is known. First day he needs to light 1 candle, Second
 *         day he needs to light 2, and so on, till it is possible. If a candle
 *         is lit, its height gets reduced by 1 each day. He can also extinguish
 *         the candle but only at the end of the day. He wants to know the
 *         maximum days he can spend with N candles . But, unable to do so, He
 *         seeks for your help. You being the elder cousin of Anay, write a
 *         program for him to find the maximum days that he can cover using N
 *         candles.
 * 
 */
public class Afraid_Of_Darkness {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		String s;
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int arr[]=new int[N];
			int i=0;
				while(i<N)
				{
					if(st.hasMoreTokens()){
					arr[i]=Integer.parseInt(st.nextToken());
					
					i++;}
					else break;
					
				}
				
			
				N=i;
				int day=0;
				
				while(day<N)
				{
					mergesort(arr, 0, N-1);
					if(arr[day]<=0)
						break;
					day++;
					for(i=0;i<day;i++)
					{
						arr[i]--;
					}
					
				}
				
		
				
				out.print(day+"\n");
				T--;
			}
			
		}
		out.close();

	}
	private static void mergesort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int mid=0;
		if(i<j)
		{
			 mid=(i+j)/2;
			// System.out.println("mid="+mid);
			 mergesort(arr,i,mid);
			 mergesort(arr,mid+1,j);
			 merge(arr,i,mid,j);	
			
		}
		
	}

	private static void merge(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int temp[]=new int[arr.length];
		int l=i;
		int r=j;
		int m=mid+1;
		int k=l;
		
		while(l<=mid && m<=r)
		{
			if(arr[l]>=arr[m])
			{
				temp[k++]=arr[l++];
			}
			else
			{
				temp[k++]=arr[m++];
				
				
			}
			
		}
		while(l<=mid)
			temp[k++]=arr[l++];
		while(m<=r){
			//System.out.println("m="+m);
			temp[k++]=arr[m++];			
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
		}
		
		
		
	}


}
