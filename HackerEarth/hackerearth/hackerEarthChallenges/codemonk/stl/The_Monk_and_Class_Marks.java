package hackerEarthChallenges.codemonk.stl;


import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 * 
 *         Monk is a multi-talented person, and prepares results for his college
 *         in his free time. (Yes, he is still in love with his old college!) He
 *         gets a list of students with their marks. The maximum marks which can
 *         be obtained in the exam is 100.
 * 
 *         The Monk is supposed to arrange the list in such a manner that the
 *         list is sorted in decreasing order of marks. And if two students have
 *         the same marks, they should be arranged in lexicographical manner.
 * 
 *         Help Monk prepare the same!
 * 
 *         Input format: On the first line of the standard input, there is an
 *         integer N, denoting the number of students. N lines follow, which
 *         contain a string and an integer, denoting the name of the student and
 *         his marks.
 * 
 *         Output format: You must print the required list.
 * 
 */
public class The_Monk_and_Class_Marks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		List<NameValuePair> list=new ArrayList<NameValuePair>();;
		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				
				st = new StringTokenizer(s);
				String name=st.nextToken();
				int marks=Integer.parseInt(st.nextToken());
				list.add(new NameValuePair(name, marks));
				T--;
			}
		}
		Comparator<NameValuePair> comp1=new Comparator<NameValuePair>(){

			@Override
			public int compare(NameValuePair a, NameValuePair b) {
				// TODO Auto-generated method stub
				if(a.marks>b.marks)
				{
					return -1;
				}
				if(a.marks<b.marks)
					return 1;
				return 0;
			}
			
		};		
		Comparator<NameValuePair> comp2=new Comparator<NameValuePair>(){

			@Override
			public int compare(NameValuePair a, NameValuePair b) {
				// TODO Auto-generated method stub
				return a.Name.compareTo(b.Name);
			}
			
		};
		Collections.sort(list,comp2);//sort alphabetically
		Collections.sort(list,comp1);//sort descending order
		for(NameValuePair ob:list)
		{
			System.out.println(ob.Name+" "+ob.marks);
		}

	}
	private static class NameValuePair{
		String Name;
		int marks;
		public NameValuePair(String N,int m) {
		Name=N;
		marks=m;
		}
	}
		

}
