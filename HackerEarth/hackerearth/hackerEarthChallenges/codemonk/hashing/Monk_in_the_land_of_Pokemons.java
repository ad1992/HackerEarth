package hackerEarthChallenges.codemonk.hashing;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
/**
 * @author Aakansha Doshi
 * 
 *         Monk has to visit a land where strange creatures, known as Pokemons,
 *         roam around in the wild. Each Pokemon in the land will attack any
 *         visitor. They can only be pacified by feeding them their favorite
 *         food.
 * 
 *         The Pokemon of type X eats one food item of type X.
 * 
 *         Monk knows that he will encounter N ponds on the way. At each pond,
 *         he will find a food item and then encounter a Pokemon. The i'th pond
 *         has the food item of type Ai and the Pokemon of type Bi.
 * 
 *         The monk can feed the item at the i'th pond to the Pokemon at the
 *         pond if the type matches. Monk may have to carry some food items with
 *         him before leaving so as to feed all the Pokemons. Help him find the
 *         number of items he must carry, to be to able to pass through the land
 *         safely.
 * 
 *         Input: The first line contains T, denoting the number of test cases.
 *         Then, T test cases follow. The first line of each test case contains
 *         an integer N. Then, N lines follow. Each line consists of 2
 *         space-separated integers Ai and Bi.
 * 
 *         Output: For each test case, print the answer in a new line.
 * 
 */
public class Monk_in_the_land_of_Pokemons {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine().trim());
        while(T>0)
        {
        	int N=Integer.parseInt(br.readLine().trim());
        	int arr[]=new int[1000001];
        	int food=0;
        	while(N>0)
        	{
        		if((s=br.readLine().trim())!=null)
        		{
        			st=new StringTokenizer(s);
        			int a=Integer.parseInt(st.nextToken());
        			int b=Integer.parseInt(st.nextToken()); 
        			arr[a]++;        			
        			if(arr[b]>0)   			
        			{
        				arr[b]--;
        			}
        			else
        			{
        				food++;
        			}
        			N--;
        		}
        	}
        	out.println(food);
        	T--;
        }
        out.close();
 
	}
 
}


