package collegeChallenges.clash_of_coders1_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Gajodharmemory {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int T=Integer.parseInt(br.readLine());
        while(T-->0)
        {
        	int N=Integer.parseInt(br.readLine());
        	int arr[]=new int [26];
        	while(N-->0)
        	{
        		if((s=br.readLine())!=null)
        		{
        			int ch=s.charAt(0)-65;
        			arr[ch]++;
        			
        			
        		}
        	}
        	int c=0;
        	for(int i=0;i<26;i++)
        	{
        		if(arr[i]==1)
        		{
        			c++;
        		}
        	}
        	System.out.print(c+"\n");
        }

	}

}
