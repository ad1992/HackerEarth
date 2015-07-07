package collegeChallenges.flavouredJune;

import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Hannibal is on a mission. He has to shoot a criminal. Hannibal was on
 *         the point (0, 0) and the criminal is on the point (Xc, Yc). But there
 *         is a wall between the point (X1, Y1) and (X2, Y2).
 * 
 *         You have to tell whether Hannibal can shoot criminal or not.
 * 
 *         INPUT:
 * 
 *         First line contains the total number of test cases T. For each test
 *         case, a single line contains space separated integers denoting X1,
 *         Y1, X2, Y2, Xc, Yc.
 * 
 *         OUTPUT:
 * 
 *         For each test case display YES, if Hannibal can shoot the criminal.
 *         Otherwise, display NO.
 * 
 */
public class A_Team {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T>0)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int x1,x2,x3,y1,y2,y3;
				x1=Integer.parseInt(st.nextToken());
				y1=Integer.parseInt(st.nextToken());
				x2=Integer.parseInt(st.nextToken());
				y2=Integer.parseInt(st.nextToken());
				x3=Integer.parseInt(st.nextToken());
				y3=Integer.parseInt(st.nextToken());
				Line2D line1=new Line2D.Double(x1,y1,x2,y2);
				Line2D line2=new Line2D.Double(0,0,x3,y3);
				if(line1.intersectsLine(line2))
				{
					out.println("NO");
				}
				else
				{
					out.println("YES");
				}
				T--;
			}
		}
		out.close();
	}

}
