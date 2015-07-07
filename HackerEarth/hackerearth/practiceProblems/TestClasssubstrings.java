package practiceProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class TestClasssubstrings {
    public static void main(String args[] ) throws Exception {
       
	String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
           int len=Integer.parseInt(br.readLine());
           if((s=br.readLine())!=null)
           {
           		long sub[]=new long[s.length()];
           		for(int i1=0;i1<len;i1++)
           		{
           		sub[i1]=1;
           		}
           		for(int i1=1;i1<len;i1++)
           		{
           			if(s.charAt(i1)>=s.charAt(i1-1))
           			{
           				sub[i1]+=sub[i1-1];
           			}
           		
           		}
           		long c=0;
           	for(int i1=0;i1<len;i1++)
           		{
           	//	System.out.println(i1+" "+sub[i1]);
           		c+=sub[i1];
           		}
           		System.out.println(c);
           }
           
        }
       

       
    }
}
