package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 *
 * 		   Samarpit is the main hero of the Dhoom 4.He is trying to
 *         steal from the Code Bank Of Hackers.Samarpit has a key with an
 *         integer value printed on it. He also has N other keys with each key
 *         having its own specific value.Samarpit is trying to break the Lock
 *         for which he is supposed to get to the lock's key value. He can
 *         perform one type of operation.Take his own key and one of the other N
 *         keys and merge them.During merging Samarpit's Key value changes to
 *         product of both the keys modulus 100000.
 * 
 *         For example if his key value was X and he took a key with value Y the
 *         his new key will be (X*Y)%100000.The other key that was used during
 *         the merging process remains along with other N-1 keys.
 * 
 *         This entire process of merging takes 1 second.Now since he is in a
 *         hurry he asks to you to find the minimum time in which he could reach
 *         to the lock's key value.
 * 
 */
/**
 * @author Aakansha Doshi
 *
 */
public class Dhoom4 {
private static int con=100000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine().trim();
		StringTokenizer st;
		if(s!=null)
		{
			st=new StringTokenizer(s);
			int keyval=Integer.parseInt(st.nextToken());
			int lockval=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(br.readLine().trim());
			long arr[]=new long[N];
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					arr[i]=Long.parseLong(st.nextToken());
				}			
				int minturn[]=new int[100001];
				Queue<Integer> q=new LinkedList<>();
				q.add(keyval);
				minturn[keyval]=1;
				while(!q.isEmpty())
				{
					int num=q.poll();
					if(num==lockval)
						break;
					for(int i=0;i<N;i++)
					{
						long val=arr[i];
						int v=(int) (num%con*val%con);
						
						//System.out.println(v);
						if(minturn[v]==0)
						{
							minturn[v]=minturn[num]+1;
							q.add(v);
						}
					}
				}
				System.out.println(minturn[lockval]-1);
			}
		}
	}

}
