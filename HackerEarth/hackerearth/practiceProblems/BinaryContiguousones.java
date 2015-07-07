package practiceProblems;

/**
 * @author Aakansha Doshi
 *
 */
public class BinaryContiguousones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[]=new long[41];
		arr[0]=0;
		for(long j=1;j<(2<<30)-1;j++)
			{
				String temp=Long.toBinaryString(j);int c=0;
				for(int k=0;k<temp.length();k++)
				{
					if(temp.charAt(k)=='1')
						c++;
				}
				if((c&1)==1)
				{
					arr[temp.length()]++;
				}
			}
			
			//System.out.println("dad");
		
		//System.out.println(range);

	}

}
