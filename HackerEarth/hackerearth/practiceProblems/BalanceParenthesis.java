package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class BalanceParenthesis {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			String s=br.readLine().trim();
			if(s!=null&&!s.isEmpty()){
			String arr[]=s.split(" ");
			int open,close;
			open=close=0;
			int i=0;
			int len=arr.length-1;
			if((len&1)==0)
			{
				while(!arr[i].equals("."))
				{
					if(arr[i].equals("{"))
					{
						open++;
					}
					else if(arr[i].equals("}")&&open==0)
					{
						close++;
						open++;
					}
					else if(arr[i].equals("}"))
					{
						open--;
					}
					i++;
					
				}
				System.out.println(close+(open/2));
			}
			
			else
			{
				System.out.println(-1);
			}
			T--;
		}
			
		}	

	}

}
