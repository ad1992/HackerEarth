package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class FindWayswithNsteps {
static long c=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			/*int xcord[]=new int[N+1];
			int ycord[]=new int[N+1];
			double pro[]=new double[N+1];
			long sum=0l;*/
			for(int x=0;x<=N/2;x++)
			{
					
				//long k=getways(x,N-x,0,0);
				/*sum+=k;
				xcord[x]=x;
				ycord[x]=N-x;
				pro[x]=k;*/
				System.out.println(x+" "+(N-x));
				if(x*2!=N)
				System.out.println((N-x)+" "+x);
				
			}
			/*for(int i=0;i<=N;i++){
				pro[i]=pro[i]/sum;
				//System.out.println(pro[i]);
			}
			mergesort(pro,xcord,ycord,0,N);
			for(int i=0;i<=N;i++)
			{
				
					System.out.println(xcord[i]+" "+ycord[i]);
				
			}*/
					
		}
		

	}

	/*private static int getways(int x,int y,int x1,int y1) {
		// TODO Auto-generated method stub
		if(x1==x&&y1==y)
		{
			return 1;
		}
		if(x1>x||y1>y)
			return 0;
		return getways(x,y,x1+1,y1)+getways(x,y,x1,y1+1);
	}
	private static void mergesort(double[] arr, int xcord[],int ycord[],int i, int j) {
		// TODO Auto-generated method stub
		int mid=0;
		if(i<j)
		{
			 mid=(i+j)/2;
			// System.out.println("mid="+mid);
			 mergesort(arr,xcord,ycord,i,mid);
			 mergesort(arr,xcord,ycord,mid+1,j);
			 merge(arr,xcord,ycord,i,mid,j);	
			
		}
		
	}

	private static void merge(double[] arr,int xcord[],int ycord[], int i, int mid, int j) {
		// TODO Auto-generated method stub
		double temp[]=new double[arr.length];
		int temp1[]=new int[arr.length];
		int temp2[]=new int[arr.length];
		int l=i;
		int  r=j;
		int m=mid+1;
		int k=l;
		
		while(l<=mid && m<=r)
		{
			if(arr[l]<=arr[m])
			{
				
					temp[k]=arr[l];
					temp1[k]=xcord[l];
					temp2[k]=ycord[l];
					k++;
					l++;
				
				
				
			}
			
			else
			{
				temp[k]=arr[m];
				temp1[k]=xcord[m];
				temp2[k]=ycord[m];
				k++;
				m++;
				
				
			}
			
		}
		while(l<=mid){
			temp[k]=arr[l];
			temp1[k]=xcord[l];
			temp2[k]=ycord[l];
			k++;
			l++;
		}
		while(m<=r){
			//System.out.println("m="+m);
			temp[k]=arr[m];
			temp1[k]=xcord[m];
			temp2[k]=ycord[m];
			k++;
			m++;
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
			xcord[i1]=temp1[i1];
			ycord[i1]=temp2[i1];
		}
		
		
		
	}*/

}
