package collegeChallenges.clash_of_coders1_0;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class PositiveIntegers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String s1,s2,s;
	        StringTokenizer st;
	        int T=sc.nextInt();
	        sc.nextLine();
	        while(T-->0)
	        {
	        	int c=0;
	        	int N=sc.nextInt();
	        	sc.nextLine();
	        	for(int i=0;i<N;i++)
	        		{
	        			int num=sc.nextInt();
	        			//System.out.print(num+" ");
	        			if(num>0)
	        			{
	        				c++;
	        				
	        			}
	        		}
	        		//System.out.println();
	        		System.out.println(c);
	        		sc.nextLine();
				}
	        }
	}


