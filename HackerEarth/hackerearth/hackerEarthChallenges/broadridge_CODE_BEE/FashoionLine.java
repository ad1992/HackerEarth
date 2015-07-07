package hackerEarthChallenges.broadridge_CODE_BEE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FashoionLine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				int L=Integer.parseInt(st.nextToken());
				int R=Integer.parseInt(st.nextToken());
				if((s=br.readLine().trim())!=null)
				{
					String Ndress=s;
					//System.out.println(Ndress);
					if((s=br.readLine().trim())!=null)
					{
						String Kdress=s;
						//System.out.println(N);
						int pos[]=new int[N];
						int left[]=new int[N];
						int right[]=new int[N];
						int size=0;
						for(int i=0;i<N;i++)
						{
							char ch=Ndress.charAt(i);
							//System.out.println(ch+" "+i);
							for(int j=0;j<K;j++)
							{
								char ch1=Kdress.charAt(j);
								if(ch==ch1)
								{
									pos[size]=i;
									size++;
									break;
								}
							}
						}
						left[0]=pos[0];
						right[size-1]=N-pos[size-1]-1;
						for(int i=0;i<size;i++)
						{
							if(i>0)
								left[i]=right[i-1];
							if(i<size-1)
								right[i]=pos[i+1]-pos[i]-1;
						}
						/*for(int i=0;i<size;i++)
						{
							System.out.print(left[i]+" ");
						}
						System.out.println();
						for(int i=0;i<size;i++)
						{
							System.out.print(right[i]+" ");
						}
						System.out.println();*/
						long ans=0l;
						for(int i=L;i<=R;i++)
						{
							for(int j=0,k=j+i-1;k<size;j++,k++)
							{
								long word=left[j]+right[k]+(left[j]*right[k])+1;
								ans+=word;
							}
							
						}
						System.out.println(ans);
						T--;
					}
				}
				
			}
		}

	}

}
