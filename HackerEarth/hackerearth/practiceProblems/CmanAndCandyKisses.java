package practiceProblems;    
import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
     
    /**
    * Cman doesn't love math anymore. He loves Alisha. Alisha is cute. :) Cman goes
    * on a date with her. They go to a candy shop. Alisha loves candies. The shop
    * has n number of jars, each jar having a different type of candy. Alisha wants
    * to taste all type of candies so she asks Cman to buy candies for her. She
    * also asks Cman to buy at least X[i] candies of type i. Cost of each candy is
    * $1. Cman has forgotten to bring his wallet so the poor guy has no money. Cman
    * has to anyhow buy these candies for Alisha. So, he asks the shopkeeper for
    * help and looking at the condition of Cman, the shopkeeper agrees to help Cman
    * but on a condition. Shopkeeper puts the condition that he will give Cman
    * candies of $R for free if Cman can tell him the total number of ways to
    * select the candies such that it fulfills Alisha's condition of getting at
    * least X[i] candies of type i and also the sum of candies result in total cost
    * of exactly $R. As things are awkward between Cman and math currently, he asks
    * you for help. So, your task is to help Cman to find the resulting number of
    * ways modulo 10^9 +7 so that he can get candies for free and can make Alisha
    * happy. P.S. : Alisha will give a kiss to Cman if he buys the required number
    * of candies for her. So, your task is to help Cman to get a kiss. :?)
    *
    *
    */
     
    /**
     * @author Aakansha Doshi
     *
     */
    public class CmanAndCandyKisses {
    private static long con=1000000007;
    public static void main(String[] args) throws NumberFormatException, IOException {
    // TODO Auto-generated method stub
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
    int T=Integer.parseInt(br.readLine().trim());
    String s;StringTokenizer st;
    while(T>0)
    {
    if((s=br.readLine().trim())!=null)
    {
    st=new StringTokenizer(s);
    int n=Integer.parseInt(st.nextToken());
    int r=Integer.parseInt(st.nextToken());
    if((s=br.readLine().trim())!=null)
    {
    st=new StringTokenizer(s);
    int arr[]=new int[n];int total=0;
    for	(int i=0;i<n;i++)
    {
    arr[i]=Integer.parseInt(st.nextToken());
    total+=arr[i];
    }
    int left=r-total;
    long ans=ncr(n+left-1,left);
    System.out.println(ans);
    T--;
    }
    }
    }
     
    }
     
    private static long ncr(int n, int r) {
    // TODO Auto-generated method stub
    if(n-r>r)r=n-r;
    long a=1l,i=0;
    while(i++<n-r)
    {
    a=((a*(r+i)%con)*modinverse(i))%con;
    }
    return a;
    }
     
    private static long modinverse(long x) {
    // TODO Auto-generated method stub
    long p=con-2;
    long a=1l,b=x;
    while(p>0)
    {
    if((p&1)==1)
    {
    a=(a*b)%con;
    }
    b=(b*b)%con;
    p>>=1;
    }
    return a;
    }
     
    }