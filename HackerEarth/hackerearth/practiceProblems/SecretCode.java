package practiceProblems;
import java.util.Scanner;


/**
 * @author Aakansha Doshi
 *
 */
public class SecretCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String arr[]=new String[1536];
		 arr[0]="3";
		 arr[1]="5";
		 int t=2;int size=2;
		 while(t<1024)
		 {	
			
			 for(int i=size;i<size+t&&i<1536;i++)
			 {
				 arr[i]=arr[i-t]+"3";
				 //System.out.println(i+"first "+arr[i]);
				 
			 }
			 //System.out.println("asas");
			 size=size+t;
			 for(int i=size;i<size+t&&i<1536;i++)
			 {
				 arr[i]=arr[i-t-t]+"5";
				 //System.out.println(i+" sec"+arr[i]);
				 
			 }
			 size=size+t;
			 t=t*2;
		 }
		 /*for(int i=0;i<=446;i++)
		 {
			 System.out.println(i+"   "+arr[i]);
		 }*/
       int T=sc.nextInt();
        while(T-->0)
        {
        	sc.nextLine();
        	int L=sc.nextInt();
        	int R=sc.nextInt();int c=0;
        	for(int i=0;i<=1535;i++)
   		 	{
        		long num=Long.parseLong(arr[i]);
        		if(num>=L&&num<=R)
        		{
        			c++;
        			
        		}
   		 	}
        	System.out.println(c);
        	

        }
        sc.close();
	}

	
	}


