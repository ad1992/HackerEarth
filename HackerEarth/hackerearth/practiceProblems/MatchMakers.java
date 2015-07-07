package practiceProblems;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class MatchMakers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();	String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());int count=0;
			int girls[]=new int[N];
			int boys[]=new int[N];
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					girls[i]=Integer.parseInt(st.nextToken());
				}
			}
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					boys[i]=Integer.parseInt(st.nextToken());
				}
			}
			
			mergesort(girls,  0, N-1);
			mergesort(boys,0,N-1);
			
			for(int i=0,j=N-1;i<N;i++,j--)
			{
				if(girls[i]%boys[j]==0 || boys[j]%girls[i]==0)
					count++;
			}
			obr.write(String.valueOf(count));
			obr.newLine();
			
		}
		obr.close();
		
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
		int temp1[]=new int[arr.length];
		int l=i;
		int  r=j;
		int m=mid+1;
		int k=l;
		//long inv=0;		
		while(l<=mid && m<=r)
		{
			if(arr[l]<=arr[m])
			{
				temp[k]=arr[l];
				
				k++;l++;
				
			}
			else
			{
				temp[k]=arr[m];
			
				k++;m++;
				//inv+=mid-l+1;
				
			}
			
		}
		while(l<=mid){
			temp[k]=arr[l];
		
			k++;l++;
		}
		while(m<=r){
			//System.out.println("m="+m);
		
			temp[k]=arr[m];		
			k++;m++;
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
			
		}
		
		
		//return inv;
	}

}
