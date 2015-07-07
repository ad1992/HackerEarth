package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MergeSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		int arr[]=new int[T];
		String s;int i=0;
		while(T-->0)
		{
			arr[i++]=Integer.parseInt(br.readLine().trim());
			
		}
		mergesort(arr,0,arr.length-1);
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);

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


