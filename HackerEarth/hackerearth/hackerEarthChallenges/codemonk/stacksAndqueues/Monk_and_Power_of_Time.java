package hackerEarthChallenges.codemonk.stacksAndqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         The Monk is trying to explain to its users that even a single unit of
 *         time can be extremely important and to demonstrate this particular
 *         fact he gives them a challenging task.
 * 
 *         There are N processes to be completed by you, the chosen one, since
 *         you're Monk's favorite student. All the processes have a unique
 *         number assigned to them from 1 to N.
 * 
 *         Now, you are given two things:
 * 
 *         The calling order in which all the processes are called. The ideal
 *         order in which all the processes should have been executed.
 * 
 *         Now, let us demonstrate this by an example. Let's say that there are
 *         3 processes, the calling order of the processes is: 3 - 2 - 1. The
 *         ideal order is: 1 - 3 - 2, i.e., process number 3 will only be
 *         executed after process number 1 has been completed; process number 2
 *         will only be executed after process number 3 has been executed.
 * 
 *         Iteration #1: Since the ideal order has process #1 to be executed
 *         firstly, the calling ordered is changed, i.e., the first element has
 *         to be pushed to the last place. Changing the position of the element
 *         takes 1 unit of time. The new calling order is: 2 - 1 - 3. Time taken
 *         in step #1: 1.
 * 
 *         Iteration #2: Since the ideal order has process #1 to be executed
 *         firstly, the calling ordered has to be changed again, i.e., the first
 *         element has to be pushed to the last place. The new calling order is:
 *         1 - 3 - 2. Time taken in step #2: 1.
 * 
 *         Iteration #3: Since the first element of the calling order is same as
 *         the ideal order, that process will be executed. And it will be thus
 *         popped out. Time taken in step #3: 1.
 * 
 *         Iteration #4: Since the new first element of the calling order is
 *         same as the ideal order, that process will be executed. Time taken in
 *         step #4: 1.
 * 
 *         Iteration #5: Since the last element of the calling order is same as
 *         the ideal order, that process will be executed. Time taken in step
 *         #5: 1.
 * 
 *         Total time taken: 5 units.
 * 
 *         PS: Executing a process takes 1 unit of time. Changing the position
 *         takes 1 unit of time.
 * 
 *         Input format: The first line a number N, denoting the number of
 *         processes. The second line contains the calling order of the
 *         processes. The third line contains the ideal order of the processes.
 * 
 *         Output format: Print the total time taken for the entire queue of
 *         processes to be executed.
 * 
 */
public class Monk_and_Power_of_Time {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int order[] = new int[N];
		LinkedList<Integer> execute = new LinkedList<Integer>();

		s = br.readLine().trim();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			execute.add(num);
		}

		s = br.readLine().trim();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			order[i] = Integer.parseInt(st.nextToken());
		}
		int i = 0;
		int time = 0;
		while (!execute.isEmpty()) {
			int num = execute.pop();
			time++;
			if (num != order[i]) {
				execute.add(num);
			} else {
				i++;
			}

		}
		System.out.println(time);

	}

}
