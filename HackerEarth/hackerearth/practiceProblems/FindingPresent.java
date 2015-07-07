package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FindingPresent {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int p=Integer.parseInt(br.readLine());
		int arr1[]=new int[p];
		String s1=br.readLine().trim();
		st=new StringTokenizer(s1);
		int min=Integer.MAX_VALUE;int max=Integer.MIN_VALUE;
		for(int i=0;i<p;i++)
		{
			arr1[i]=Integer.parseInt(st.nextToken());
			if(arr1[i]<min)
				min=arr1[i];
			if(arr1[i]>max)
				max=arr1[i];
		}
		int q=Integer.parseInt(br.readLine());
		int arr2[]=new int[q];
		String s2=br.readLine().trim();
		st=new StringTokenizer(s2);
		for(int i=0;i<q;i++)
		{
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		int diff=max-min;
		int track1[]=new int[diff+1];
		int track2[]=new int[diff+1];
		for(int i=0;i<arr1.length;i++)
		{
			track1[arr1[i]-min]++;
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			track2[arr2[i]-min]++;
			
		}		
		for(int i=0;i<track1.length;i++)
		{
			if(track1[i]!=track2[i])
			{
				System.out.print(i+min+" ");
			}
			
		}	
	}

}
