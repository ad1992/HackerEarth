package collegeChallenges.imsec_March_Challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class SonuAndMonu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int L=Integer.parseInt(st.nextToken());
				int P=Integer.parseInt(st.nextToken());
				long sqr=(long) Math.pow(L,2);
			//	System.out.println(sqr);
			//	System.out.println(L+ " "+P);
				if((s=br.readLine())!=null)
				{
					String bin=s;
				/*	for(int i=0;i<L;i++)
					{
						bin+="1";
						//System.out.println(bin);
					}*/
					//System.out.println(bin);
					long one[]=new long[L];
					if(bin.charAt(0)=='1')
						one[0]=1;
					for(int i=1;i<bin.length();i++)
					{
						one[i]=bin.charAt(i)=='1'?one[i-1]+1:one[i-1];
					}
					long ans=0l;
					for(int i=0;i<one.length-1;i++)
					{
						int ch=bin.charAt(i)-48;
						if(ch==1)
						{
							long ones;
							int len=i+P;
							if(len<(L-1))
							{
								ones=one[len]-one[i];
								ans+=ones*2;
							}
							else
							{
								ones=one[L-1]-one[i];
								ans+=ones*2;
							}
							//System.out.println(i+" "+ones);
						}
					}
					ans+=one[L-1];
					long hcf=gcd(ans,sqr);
					/*for(int i=0;i<one.length;i++)
					{
						System.out.print(one[i]+ " ");
					}*/
					ans=ans/hcf;
					sqr=sqr/hcf;
					System.out.print(ans+"/"+sqr+"\n");
				}
			}
		}
	}

	private static long gcd(long mm,long ss) {
		// TODO Auto-generated method stub
		if(ss==0)
		{
			return mm;
		}
		
		return gcd(ss,mm%ss);
	}

}
