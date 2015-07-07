package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *			 @username Aakansha Doshi
 *			 A Professor of Physics gave projects to the students of his
 *           class. The students have to form a team of two for doing the
 *           project. The professor left the students to decide the teams. The
 *           number of students in a class will be even.
 * 
 *           Each student has a knowledge level. It tells how much knowledge
 *           each student has. The knowledge level of a team is the sum of the
 *           knowledge levels of both the students.
 * 
 *           The students decide to form groups such that the difference between
 *           the team with highest knowledge and the one with lowest knowledge
 *           is minimum.
 * 
 */
public class ProjectTeam {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int arr[]=new int[N];int i=0;
				while(st.hasMoreTokens())
				{
					arr[i]=Integer.parseInt(st.nextToken());
					i++;
				}
				Arrays.sort(arr);
				int strong=Integer.MIN_VALUE;
				int weak=Integer.MAX_VALUE;
				int start=0,end=N-1;
				while(start<end)
				{
					int level=arr[start]+arr[end];
					if(level<weak)
						weak=level;
					if(level>strong)
						strong=level;
					start++;
					end--;
				}
				//System.out.println("Strong "+arr[0]+" "+arr[N-1]);
				//System.out.println("Weak "+arr[N/2-1]+" "+arr[N/2]);
				System.out.println(strong-weak);
				T--;
			}
		}

	}

}
