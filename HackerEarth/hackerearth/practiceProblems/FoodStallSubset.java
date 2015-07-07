package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class FoodStallSubset {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine().trim());
        int C=1;
        while(T-->0)
        {
        	if((s=br.readLine().trim())!=null)
        	{
        		st=new StringTokenizer(s);
        		int gp=Integer.parseInt(st.nextToken());
        		int gv=Integer.parseInt(st.nextToken());
        		int gc=Integer.parseInt(st.nextToken());
        		int N=Integer.parseInt(br.readLine().trim());
        		int pro[]=new int[N];
        		int vit[]=new int[N];
        		int cho[]=new int[N];
        		int i=0;
        		while(i<N)
        		{
        			if((s=br.readLine().trim())!=null)
        			{
        				st=new StringTokenizer(s);
        				pro[i]=Integer.parseInt(st.nextToken());
        				vit[i]=Integer.parseInt(st.nextToken());
        				cho[i]=Integer.parseInt(st.nextToken());
        				i++;
        				
        			}
        		}
        		
        		       		
        		//System.out.println(procheck[gp][N]+" "+vcheck[gv][N]+" "+chocheck[gc][N]);
        		if(checksubset(gp,gv,gc,pro,vit,cho,N,0))
        		{
        			System.out.println("Case #"+C+": "+"yes");
        		}
        		else
        		{
        			System.out.println("Case #"+C+": "+"no");
        		}
        		C++;
        	}
        }

	}

	private static boolean checksubset(int gp, int gv, int gc, int[] pro,
			int[] vit, int[] cho, int n, int i) {
		// TODO Auto-generated method stub
		if(gp==0&&gv==0&&gc==0)
			return true;
		if(i==n||gp<0||gv<0||gc<0)
			return false;
		return checksubset(gp-pro[i], gv-vit[i], gc-cho[i], pro, vit, cho, n, i++)||checksubset(gp, gv, gc, pro, vit, cho, n, i++);
		
	}

}
