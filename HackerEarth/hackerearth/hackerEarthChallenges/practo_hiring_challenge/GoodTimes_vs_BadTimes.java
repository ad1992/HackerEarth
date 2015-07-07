package hackerEarthChallenges.practo_hiring_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Chandan, our problem moderator, recently got a digital clock as a
 *         birthday present. A digital clock shows time in the format HH:MM:SS,
 *         where HH, MM, SS reprsents hours , minutes, and seconds respectively.
 *         It is a 24 hour clock and so the day starts at 00:00:00 hours while
 *         it ends at 23:59:59.
 * 
 *         We all know how punctual and particular Chandan is about each and
 *         every second of his life. One sunny day, at his leisure, when he was
 *         fiddling with his clock, he discovered that a second was good for him
 *         if none of the HH, MM and SS at that second was divisible by the same
 *         prime number, i.e. it is bad if all of them give 0 as a remainder
 *         when divided by the same prime number.
 * 
 *         Given a time of a day, Chandan now wants to count the number of good
 *         times and bad times from that instance till the end of the day
 *         (23:59:59).
 */
public class GoodTimes_vs_BadTimes {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		int prime[] = new int[60];
		for (int i = 1; i < prime.length; i++)
			prime[i] = i;
		for (int i = 2; i < 60; i++) {
			if (prime[i] == i) {
				for (int j = i * i; j < 60; j += i) {
					prime[j] = i;
				}
			}
		}
		int hh = 23, mm = 0, ss = 0;
		int track[] = new int[24 * 60 * 60 + 1];

		while (hh >= 0) {
			mm = 59;
			while (mm >= 0) {
				ss = 59;
				while (ss >= 0) {
					boolean bad = false;
					// System.out.println(hh+":"+mm+":"+ss);
					int index = hh * 3600 + mm * 60 + ss;
					int zero = ((hh == 0) ? 1 : 0) + ((mm == 0) ? 1 : 0)
							+ ((ss == 0) ? 1 : 0);
					if (zero == 3)
						bad = true;
					else if (zero == 2) {
						if (hh == 1 || mm == 1 || ss == 1)
							bad = false;
						else
							bad = true;
					} else if (hh == 0) {
						bad = (gcd(mm, ss) == 1 ? false : true);
					} else if (mm == 0) {
						bad = (gcd(hh, ss) == 1 ? false : true);
					} else if (ss == 0) {
						bad = (gcd(mm, hh) == 1 ? false : true);
					} else {
						bad = (gcd(hh, gcd(mm, ss)) == 1 ? false : true);
					}
					track[index] = track[index + 1];
					if (bad)
						track[index]++;

					ss--;
				}

				mm--;
			}

			hh--;
		}
		while (T-- > 0) {
			if ((s = br.readLine()) != null) {
				st = new StringTokenizer(s);

				int hr = Integer.parseInt(st.nextToken());
				int min = Integer.parseInt(st.nextToken());
				int sec = Integer.parseInt(st.nextToken());
				int ind = hr * 3600 + min * 60 + sec;
				int left = 24 * 60 * 60;
				int bad = track[ind];
				int good = left - ind - bad;
				int gcd;
				if (bad == 0 || good == 0)
					gcd = 1;
				else
					gcd = gcd(bad, good);
				System.out.print("\n" + bad / gcd + ":" + good / gcd);
				// System.out.println(bad+":"+good);

			}

		}

	}

	private static int gcd(int mm, int ss) {
		// TODO Auto-generated method stub
		if (ss == 0) {
			return mm;
		}

		return gcd(ss, mm % ss);
	}

}
