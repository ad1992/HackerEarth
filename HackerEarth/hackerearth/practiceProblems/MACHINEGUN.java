package practiceProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         To celebrate his new year Ikshu went to play "beyond to beyond"
 *         (abbreviated as BOB) with his friends. BOB can be described as
 *         follows :
 * 
 *         It consists of Infinite boxes arranged one over another, Lowest box
 *         being 1. Given a list 'L' of indices, Ikshu needs to knockoff L[i]th
 *         box for 0<=i<|L| where |L| denoted the size of L. A box gun is used
 *         which can knock off a box at a given index. For example : you can
 *         give command to box gun to knock off box at position 2. Command given
 *         to machine should be in increasing order.
 * 
 *         NOTE : After knocking off a particular box, all the boxes above it
 *         comes down by one unit and you can knockoff boxes in any order.
 * 
 *         You need to find the commands that Ikshu should give to his machine
 *         guns in order to knockoff all the boxes at given indices.
 * 
 *         Example: Initially boxes are 1,2,3,4,... L = [2,3] a) 2 - we give
 *         command to machine gun to knockoff second box b) 2 - we give command
 *         to machine gun to knockoff third box Note that, new position of third
 *         box is 2 after knocking off second box
 * 
 */
public class MACHINEGUN {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr = new BufferedWriter(new OutputStreamWriter(
				System.out));
		obr.flush();
		String s;
		StringTokenizer st;
		int length = Integer.parseInt(br.readLine());
		long arr[] = new long[length];
		s = br.readLine();
		st = new StringTokenizer(s, " ");
		for (int i = 0; i < length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		mergesort(arr, 0, length - 1);
		String output = "";
		output = output + arr[0] + " ";
		int c = 1;
		for (int i = 1; i < length; i++) {
			long pos = arr[i] - c;
			output = output + pos + " ";
			c++;

		}
		System.out.println(output);
	}

	private static void mergesort(long[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int mid = 0;
		if (i < j) {
			mid = (i + j) / 2;
			// System.out.println("mid="+mid);
			mergesort(arr, i, mid);
			mergesort(arr, mid + 1, j);
			merge(arr, i, mid, j);

		}

	}

	private static void merge(long[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub

		long temp[] = new long[arr.length];
		int l = i;
		int r = j;
		int m = mid + 1;
		int k = l;
		// long inv=0;
		while (l <= mid && m <= r) {
			if (arr[l] <= arr[m]) {
				temp[k] = arr[l];

				k++;
				l++;

			} else {
				temp[k] = arr[m];

				k++;
				m++;
				// inv+=mid-l+1;

			}

		}
		while (l <= mid) {
			temp[k] = arr[l];

			k++;
			l++;
		}
		while (m <= r) {
			// System.out.println("m="+m);

			temp[k] = arr[m];
			k++;
			m++;
		}

		for (int i1 = i; i1 <= j; i1++) {
			arr[i1] = temp[i1];

		}

		// return inv;
	}

}
