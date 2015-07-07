package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class ShillBirthday {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int i=0;
		int arr[]=new int[N];
		int check[]=new int[1000001];
		int max=Integer.MIN_VALUE;
		while(i<N)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>max)
			{
				max=arr[i];
			}
			check[arr[i]]++;
			i++;
		}
		//mergesort(arr,0,N-1);
		
		i=max-1;int c=0;int sum=0;
		//System.out.println(check[4]);
		while(i>=0)
		{
			//System.out.println(check[i]);
			if(check[i]>0)
			{
				c++;
				sum+=c;
			}
			i--;
			
		}
		System.out.println(sum);
	}

	private static void mergesort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int mid=0;
		if(i<j)
		{
			 mid=(i+j)/2;
			
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
				//inv+=mid-l+1;
				
			}
			
		}
		while(l<=mid)
			temp[k++]=arr[l++];
		while(m<=r){
		
			temp[k++]=arr[m++];			
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
		}
		
		
		
		

		
	}

}
