package collegeChallenges.code_IN_GBU;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
* @author Aakansha Doshi
* 
*         Ricky has N different balls and John has R different bags. Their
*         teacher Ms.Samara wants them to distribute these N balls into R bags
*         such that each bag gets at least one ball. Can you find the number of
*         ways of doing so ?
* 
*         Input:
* 
*         The one and only line of input contains two numbers separated by a
*         single space, which are N and R respectively.
* 
*         Output:
* 
*         The corresponding answer modulo 10000007 in a single line and if no
*         answer exist then print "-1".
*/
public class Can_You_Distribute {
	private static int con=10000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      StringTokenizer st=new StringTokenizer(line);
      long n=Long.parseLong(st.nextToken());
      long r=Long.parseLong(st.nextToken());
      long ans=1l;
      if(n<r)
    	  ans=-1;
      else
      {
	      n=n-1;r=r-1;
    	  if(n-r>r)
	      {
	    	  r=n-r;
	      }
	      long num=1l,deno=1l;
	      for(int i=1;i<=n-r;i++)
	      {
	    	  num=num*(r+i);
	    	  deno=deno*i;
	      }
	      ans=(num/deno)%con;
      }
      System.out.println(ans);
      
      
          
   
  
      

	}
	
}
