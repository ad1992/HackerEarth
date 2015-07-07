package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Silvestar {

	 public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(br.readLine());
			int arr[]=new int[N];
			String s=br.readLine();
			StringTokenizer st=new StringTokenizer(s," ");
			int i=0;
			while(i<N)
			{
				arr[i]=Integer.parseInt(st.nextToken());
				i++;
			}
			//long num=1<<(N-1);
			long sum=0;
			double t=0.5;
			for(i=0;i<N;i++)
			{
				
				sum+=arr[i];
				//System.out.println(sum);
				
			}
			//System.out.println(sum);
		
			//System.out.println(sum/pow);		
				System.out.printf("%.2f",(double)t*sum);
			
		}	

}
