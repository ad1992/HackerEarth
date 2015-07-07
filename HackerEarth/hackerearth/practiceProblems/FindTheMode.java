package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 			
 * 			 Write a program to find the mode of a given list of
 *           integers. Mode of a number is defined as the number which is most
 *           frequently occured. For example: L = {1,2,2,3} // Here mode is
 *           2(most frequently occured)
 * 
 *           It is possible that multiple answers are possible for a list. In
 *           that case print all possible answers in non-increasing order.
 * 
 */
/**
 * @author Aakansha Doshi
 *
 */
public class FindTheMode {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=new int[1000001];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);int max=0;
				while(st.hasMoreTokens())
				{
					int num=Integer.parseInt(st.nextToken());
					arr[num]++;
					if(arr[num]>max)
						max=arr[num];
				}
				String ans="";
				for(int i=arr.length-1;i>=0;i--)
				{
					if(arr[i]==max)
					{
						s+=arr[i]+" ";
					}
				}
				System.out.println(ans=ans.trim());
				T--;
			}
		}

	}

}
