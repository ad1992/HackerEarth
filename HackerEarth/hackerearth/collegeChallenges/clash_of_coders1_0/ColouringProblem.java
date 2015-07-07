package collegeChallenges.clash_of_coders1_0;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class ColouringProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 
        int T=sc.nextInt();
        while(T-->0)
        {
        	sc.nextLine();
        	int N=sc.nextInt();
        	sc.nextLine();
        	int e=sc.nextInt();
        	boolean arr[][]=new boolean[e][e];
        	for(int i=0;i<e;i++)
        	{
        		sc.nextLine();
        		int a=sc.nextInt();
        		int b=sc.nextInt();
        		arr[a][b]=true;
        		arr[b][a]=true;
        	}
        	if(N==1||(N==2&&e==1)||(N%2==0&&e==N))
        	{	
        		System.out.print( "BICOLORABLE.");        	
        	}
        
        	else{
        		int col[]=new int[N];
        		for(int i=0;i<N;i++)
        			col[i]=0;
        	if(colorpossible(arr,2,col,0,N))
        	{
        		System.out.print( "BICOLORABLE.\n"); 
        	}
        	else
        	{
        		System.out.print( "NOT BICOLORABLE.\n");
        	}
        	}
        
        }
        sc.close();

	}

	

	private static boolean colorpossible(boolean[][] arr, int m, int[] col,
			int v,int V) {
		// TODO Auto-generated method stub
		if(v==V)
		{
			return true;
		}
		for(int i=1;i<=m;i++)
		{
			if(isSafe(v,arr,col,i,V))
			{
				col[v]=i;
				if(colorpossible(arr, m, col, v+1, V))
				{
					return true;
				}
				col[v]=0;
			}
		}
		return false;
	}

	private static boolean isSafe(int v, boolean[][] arr, int[] col, int c,int V) {
		// TODO Auto-generated method stub
		for(int i=0;i<V;i++)
		{
			if(arr[v][i]&&c==col[i])
			{
				return false;
			}
		}
		return true;
	}

}
