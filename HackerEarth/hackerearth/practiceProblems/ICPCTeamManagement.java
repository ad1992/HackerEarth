package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *		  
 * 		   Little Chandan is an exceptional manager - apart from his
 *         role in HackerEarth - as the person who has to bug everyone, in
 *         general... and if possible, try to get some work done. * 
 *         He's also offered a job as the coach of the best Russian teams
 *         participating for ACM-ICPC World Finals. Now, Chandan is an extremely
 *         good coach, too. But he's a weird person who thrives on patterns in
 *         life, in general. So, he has decided that if there are n number of
 *         students in total, and he is supposed to divide them in camps of k
 *         students - he want them to be arranged in such a way that the length
 *         of names of all the students in a camp is equal. * 
 *         I know, totally weird, right?
 * 
 */
/**
 * @author Aakansha Doshi
 *
 */
public class ICPCTeamManagement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);	int sum=0;
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				int arr[]=new int[101];boolean flag=false;
				while(N>0){
				if((s=br.readLine().trim())!=null)
				{
					arr[s.length()]++;
					N--;
				}
				}
				for(int i=0;i<=100;i++)
				{
				if(arr[i]%K!=0)
				{
					flag=true;
					break;
				}
				}
			
				
				//System.out.println(sum+" "+K);
				if(!flag)
					System.out.println("Possible");
				else
					System.out.println("Not possible");
				T--;
			}
		}
	}

}
