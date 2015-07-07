package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**		  
 * 		   @author Aakansha Doshi
 *         Chandu and chandni are playing a game ! Game is very similar to the
 *         game of chess, But there is only one piece on the board i.e Queen.
 *         Also, Queen is allowed to move only towards top left corner.. For
 *         clarification, If Queen is placed at i,j then in a turn queen can
 *         move: 1) Any number of cells leftwards. 2) Any number of cells
 *         upwards. 3) Any number of cells Diagonally(only N-W direction).
 * 
 *         Please note that board is quarter infinite i.e there is a top left
 *         corner but it extends to infinity in south and east direction..
 * 
 *         Rules: 1) Chandni will always play the first turn. 2) They both will
 *         get alternative turns. 3) They must move the queen in their turn (No
 *         skip option) and that too according to the rule specified above. 4)
 *         Whosoever is unable to make a move loses.
 * 
 *         Given The position of queen on the board(0 index based). Print who
 *         will win the game.
 * 
 */

public class ChanduAndChandni {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int coldpositions[]=new int[2000001];
		double phi=(1+Math.sqrt(5))/2.0;
		
		for(int i=1;i<=1000000;i++)
		{
			coldpositions[i]=-1;
		}
		for(int i=1;i<=1000000;i++)
		{
			int xcord=(int) (phi*(double)i);
			//System.out.println(xcord);
			int ycord=(int) (phi*phi*i);
			
			coldpositions[xcord]=ycord;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				//System.out.println(coldpositions[i]);
				if(coldpositions[i]==j)
					System.out.println("Chandu");
				else
					System.out.println("Chandni");
				T--;
			}
		}

	}

}
