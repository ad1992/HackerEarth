package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**		  
 * 		   @author Aakansha Doshi 
 * 		   The Hexagon University of India will be hosting its Prom
 *         Night tonight.There would be M boys and N girls at the prom tonight.
 *         Each boy wants a girl who is strictly shorter than him. A girl can
 *         dance with only one boy and vice-versa. Given the heights of all the
 *         boys and girls tell whether it is possible for all boys to get a
 *         girl.
 * 
 */
public class PromNight {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int M=Integer.parseInt(st.nextToken());
				int N=Integer.parseInt(st.nextToken());
				int boys[]=new int[M];
				int girls[]=new int[N];
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					for(int i=0;i<M;i++)
					{
						boys[i]=Integer.parseInt(st.nextToken()); 
								
					}
					if((s=br.readLine().trim())!=null)
					{
						st=new StringTokenizer(s);
						for(int i=0;i<M;i++)
						{
							girls[i]=Integer.parseInt(st.nextToken()); 
									
						}
						mergesort(boys, 0, M-1);
						mergesort(girls, 0, N-1);
						int c=0;int i=0,j=0;
						while(c<M&&j<N)
						{
							if(boys[i]>girls[j])
							{
								c++;
								i++;
							}
							j++;
						}
						if(c==M)
						{
							System.out.println("YES");
						}
						else
						{
							System.out.println("NO");
						}
						
					}
					
				}
				
			}
		}
		

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
		int  r=j;
		int m=mid+1;
		int k=l;
		long inv=0;		
		while(l<=mid && m<=r)
		{
			if(arr[l]<=arr[m])
			{
				temp[k++]=arr[l++];
			}
			else
			{
				temp[k++]=arr[m++];
				inv+=mid-l+1;
				
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
