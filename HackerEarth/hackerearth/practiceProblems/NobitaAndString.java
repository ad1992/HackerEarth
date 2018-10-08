/*Name:Himanshu Tomar
Institute:Jaypee Institute Of information Technology*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int i;
		in.nextLine();
		while(t-->0)
		{
			String st=in.nextLine();
			String arr[]=st.split(" ");
			for(i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}