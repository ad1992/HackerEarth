package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Triangle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s;
		while(N-->0)
		{
			if((s=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(s);
				double x1=Double.parseDouble(st.nextToken());
				double y1=Double.parseDouble(st.nextToken());
				double x2=Double.parseDouble(st.nextToken());
				double y2=Double.parseDouble(st.nextToken());
				double x3=Double.parseDouble(st.nextToken());
				double y3=Double.parseDouble(st.nextToken());
				if(check(x1+1,y1,x2,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1-1,y1,x2,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else if(check(x1,y1+1,x2,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1-1,x2,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2+1,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2-1,y2,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2,y2+1,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2,y2-1,x3,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2,y2,x3+1,y3))
				{
					System.out.println("YES");
				}
				else		if(check(x1+1,y1,x2,y2,x3-1,y3))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2,y2,x3,y3+1))
				{
					System.out.println("YES");
				}
				else	if(check(x1+1,y1,x2,y2,x3,y3-1))
				{
					System.out.println("YES");
				}
				else
					System.out.println("NO");
					
				
			}
		}
	}

	private static boolean check(double x1, double y1, double x2, double y2,
			double x3, double y3) {
		// TODO Auto-generated method stub
		double dist1=(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		double dist2=(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
		double dist3=(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
		double l=Math.min(dist1,dist2);
		double r=Math.min(dist3,Math.max(dist1,dist2));
		double hyp=Math.max(dist3,Math.max(dist1,dist2));
		double add=(l*l)+(r*r);
		if(add==(hyp*hyp))
			return true;
		
		return false;
	}

}
