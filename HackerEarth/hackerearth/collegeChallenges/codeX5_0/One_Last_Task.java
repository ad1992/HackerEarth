package collegeChallenges.codeX5_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Ramesh and Suresh are now given One Last Task, to distribute tickets
 *         to all the students as their admissions are finalized. Sounds simple,
 *         but there's one twist, they are supposed to give 1 ticket to the
 *         first student, 2 tickets to the second student, 3 tickets to the
 *         third student and so on. Now, the professor knows the total no. of
 *         admitted students. So, he would tell them the number of students n
 *         and ask the total no. of tickets required. The One who tells all the
 *         answers correctly gets admitted to the College.
 * 
 *         Input: The first line of the input contains T, the number of test
 *         cases. T lines follow. Each test case contains a single integer N
 *         denoting the no. of students.
 * 
 *         Output: Print the total no. of stickers required for each test case
 *         in a new line.
 * 
 */
public class One_Last_Task {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());	
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long ans=(N*(N+1))/2;
			out.println(ans);
		}
		out.close();

	}

}
