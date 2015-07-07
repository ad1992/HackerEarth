package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class IntersectionCircle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st;
		String s,s1,s2;
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());
				long radius1[]=new long[n];
				long radius2[]=new long[n];
				long x1=Long.parseLong(st.nextToken());
				long y1=Long.parseLong(st.nextToken());
				long x2=Long.parseLong(st.nextToken());
				long y2=Long.parseLong(st.nextToken());
				if((s1=br.readLine().trim())!=null)
				{
					System.out.println(T);
					if((s2=br.readLine().trim())!=null)
					{
						st=new StringTokenizer(s1);	
					
						for(int i=0;i<n;i++)
						{
						radius1[i]=Long.parseLong(st.nextToken());
						//System.out.println(i);
						}					
			
					
						st=new StringTokenizer(s2);	
						//System.out.println(s);
						for(int i=0;i<n;i++)
						{
							radius2[i]=Long.parseLong(st.nextToken());
						}
					
				
						long min1=Long.MAX_VALUE,min2=Long.MAX_VALUE;
						for(int i=0;i<n;i++)
						{
							if(min1>radius1[i])
							{
								min1=radius1[i];
							}
							if(min2>radius2[i])
							{
								min2=radius2[i];
							}
						
						}
						//	System.out.println((x1-x2)*(x1-x2));
						//	System.out.println((y1-y2)*(y1-y2));
						long t=((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
						//System.out.println(t);
						double distance=Math.sqrt(t);
		
						double ans=0.0d;
						//System.out.println(distance);
						//System.out.println(min1+min2);
						if(distance>=min1+min2)
						{
							ans=0;
							
						}
						else if(distance<Math.abs(min1-min2))
						{
							
						double min=Math.min(min1, min2);
							ans=Math.PI*min*min;
						}						
						else
						{
							double d1=((distance*distance)+(min1*min1)-(min2*min2)/(2*distance*min1));
							double theta1=Math.acos(d1);
							//	System.out.println(theta1);
							double secarea1=min1*min1*theta1;
							double d2=((distance*distance)+(min2*min2)-(min1*min1)/(2*distance*min2));
							double theta2=Math.acos(d2);
							//System.out.println(theta2);
							double secarea2=min2*min2*theta2;
							double triarea=0.5*Math.sqrt((-distance+min1-min2)*(-distance-min1+min2)*(-distance+min1+min2)*(distance+min1+min2));
							ans=secarea1+secarea2-triarea;
					
					
						}
				//System.out.printf("%.2lf\n",ans);
					}
				}
			}
		}
	}
}
