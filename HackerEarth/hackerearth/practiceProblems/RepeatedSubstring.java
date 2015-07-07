package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class RepeatedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			
				String s=sc.nextLine().trim();
				if(sc!=null&&!s.isEmpty()){
				//System.out.println(s);
				boolean flag=false;
				l1:{
				for(int i=1;i<=s.length();i++)
				{
					
					for(int j=0;i+j<=s.length();j++)
					{
						String sub=s.substring(j,i+j);
						//System.out.println(sub);
						for(int k=i+j;k+i<=s.length();k++)
						{
							String sub1=s.substring(k,k+i);
							//System.out.println(sub1);
							if(sub.equals(sub1))
							{
								flag=true;
								break l1;
							}
						}
					}
				}
				}
				if(flag)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
				T--;
				}
			
			
		}
		sc.close();
	}

}
