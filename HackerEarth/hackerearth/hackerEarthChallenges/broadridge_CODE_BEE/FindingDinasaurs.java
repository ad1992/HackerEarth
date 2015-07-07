package hackerEarthChallenges.broadridge_CODE_BEE
;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;


public class FindingDinasaurs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		Hashtable<String, String> hash=new Hashtable<>();	
		while(N>0)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				
				st=new StringTokenizer(s);
				String name=st.nextToken();String key="";
				while(st.hasMoreTokens())
				{
					key+=st.nextToken()+" ";
				}
				key=key.trim();
				hash.put(key, name);
				//System.out.println(key);
				N--;
			}
		}
		while(Q>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				//System.out.println(hash.containsKey(s));
				if(hash.containsKey(s))
				{
					System.out.println(hash.get(s));
				}
				else
				{
					System.out.println("You cant fool me :P");
				}
				Q--;
			}
		}
	}

}
