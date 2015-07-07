package hackerEarthChallenges.cleartrip_Hiring_Challenge;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Cleartrip decided that they wanted to verify the username and
 *         password of its users while they were authenticating for a process.
 *         One of the code service forms a GET URL which contains the username
 *         and password as its parameters. While parsing the URL, the code needs
 *         to extract the key-value pairs of ALL the parameters passed in the
 *         request URL which may contains '&' or/and '='.
 * 
 *         The string can contain any type of alphabetical, numeric and special
 *         characters in the URL.
 * 
 *         Input format: A valid Cleartrip link.
 * 
 *        	Output format: Print the following:
 *          username: From the URL.
 *          pwd: From the URL.
 *          profile: From the URL.
 *          role: From the URL.
 *          key: From the URL.
 * 
 */
public class The_art_of_verification {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().trim();
		int index=s.indexOf('?');
		s=s.substring(index+1);
		String arr[]=s.split("&{1}[a-z]+={1}");
		arr[0]=arr[0].replace("=",": ");
		System.out.println(arr[0]);
		System.out.println("pwd: "+arr[1]);
		System.out.println("profile: "+arr[2]);
		System.out.println("role: "+arr[3]);
		System.out.println("key: "+arr[4]);
		
	}
	

}
