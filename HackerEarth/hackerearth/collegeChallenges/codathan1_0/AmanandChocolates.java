package collegeChallenges.codathan1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Aman and his friend Ankit are in a bet. Ankit asks Aman to give the
 *         no of zeros in the factorial of a number and if Aman answers
 *         correctly, he would get chocolates equal to the number of zeros in
 *         the of the factorial of the number which Ankit stated. Ankit tries to
 *         fool Aman every time , so Aman asks you as his programmer friend to
 *         write a code that would help him not to be fooled by Ankit.
 * 
 */
public class AmanandChocolates {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		long fact[] = new long[20001];
		long arr[] = new long[2000000];
		int size = 1;
		arr[0] = 1;
		for (int i = 2; i <= 20000; i++) {
			size = fact(i, arr, size);
			for (int j = size - 1; j >= 0; j--) {

				// System.out.print(arr[i]);
				if (arr[j] == 0)
					fact[i]++;
				//
			}
		}
		// long sum=0;
		int k = 0;
		

		// System.out.println(fact[40000]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		while (T-- > 0) {

			int N = Integer.parseInt(br.readLine().trim());
			if (N <= 20000)
				System.out.println(fact[N]);
			else {
				System.out.println(0);
			}
				
			}

		}

	

	private static int fact(int n, long[] arr, int size) {
		// TODO Auto-generated method stub
		long carry = 0;
		int i;
		for (i = 0; i < size; i++) {
			long ans = n * arr[i] + carry;
			arr[i] = ans % 10;
			carry = ans / 10;

		}
		while (carry > 0) {
			arr[i] = carry % 10;
			carry /= 10;
			i++;
		}
		return i;
	}

}
