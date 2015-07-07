package practiceProblems;


    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
     
     
    /**
    * @username aa1992
    * Harit wants to climb ladder having n steps but he want to
    * climb only in step of 2 and 5. Now he felt boring repeating same
    * thing again and again. So he discovered new way, now each time
    * Harit wants to climb in step of k also. In other words he can use
    * steps of 2, 5 or k to climb the ladder. So Harit want to calculate
    * number of different ways to reach at cur step , where k and cur are
    * integers . Although Harit is intelligent yet lazy so he wants your
    * help to calculate number of ways. As number of ways could be too
    * large so he wants you to output it modulo 1000000007 (10^9 + 7) .
    *
    */
    public class LadderRide {
    private static long con=1000000007;
    public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine().trim();
    StringTokenizer st=new StringTokenizer(s);
    int T=Integer.parseInt(st.nextToken());
    int N=Integer.parseInt(st.nextToken());
    long dp[]=new long[1000001];
    dp[2]=1;dp[5]=1;dp[4]=1;
    for(int i=6;i<=N;i++)
    {
    dp[i]=(dp[i-2]+dp[i-5])%con;
    }
    while(T>0)
    {
    if((s=br.readLine().trim())!=null)
    {
    st=new StringTokenizer(s);
    int cur=Integer.parseInt(st.nextToken());
    int k=Integer.parseInt(st.nextToken());    
    if(cur>=k)
    {
    long dp1[]=new long[cur];
    for(int i=0;i<=k;i++)
    	dp1[i]=dp[k];
    		
    dp1[k]=(dp1[k]+1)%con;
    
    for(int i=k+1;i<=cur;i++)
    {
    dp1[i]=(dp1[i-2]+dp1[i-5]+dp1[i-k])%con;
    }
    System.out.print(dp1[cur]+"\n");
    }
    else
    {
    	 System.out.print(dp[cur]+"\n");
    }
    
    T--;
    }
    }
     
    }
     
    }


