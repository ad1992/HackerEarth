package practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 			 @author Aakansha Doshi.
 * 			 Here tree consists of N nodes with each node having a unique
 *           index between 0 and N-1, inclusively. Root node is indexed 0. We
 *           are given a list of N-1 nodes, p1, p2...pN-1, where pi is the
 *           parent of ith node. Along with this, we are also provided a list of
 *           M nodes {u0, u1...uM-1} for whom Shinchan have to find the lowest
 *           common ancestor.
 * 
 *           Lowest Common Ancestor: Let T be a rooted tree with N nodes. Then
 *           the lowest common ancestor for a set of nodes U {u0, u1...uM-1} is
 *           the lowest node, v, for which subtree rooted at v contains all the
 *           nodes in set U.
 * 
 */
public class LowestCommonAncestor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine().trim());
		if((s=br.readLine().trim())!=null)
		{
			st=new StringTokenizer(s);
			int arr[]=new int[N];
			for(int i=1;i<N;i++)
			{
				arr[i]=Integer.parseInt(st.nextToken());
			}
			int M=Integer.parseInt(br.readLine().trim());
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				Stack<Stack<Integer>> collection=new Stack<Stack<Integer>>();
				for(int i=0;i<M;i++)
				{
					int n=Integer.parseInt(st.nextToken());
					Stack<Integer> parent=new Stack<Integer>();
					
					parent.add(n);
				
					while(arr[n]!=0)
					{
						parent.add(arr[n]);
						n=arr[n];
						
						//System.out.println(n+" "+parent[i][j]+" "+arr[parent[i][j]]);
					}
					parent.add(0);
					collection.add(parent);
					
				}
				//System.out.println(collection);
				int common=0;
				l1:{
				while(true){
					if(!collection.get(0).isEmpty()){
					int cur=collection.get(0).pop();
					//System.out.println(cur);
				for(int i=1;i<collection.size();i++)
				{
					int num=collection.get(i).pop();
					if(num!=cur)
						break l1;
					
					cur=num;
					
				}
				common=cur;
				
				}
					else
						break;
				}
				
				}
				System.out.println(common);
				
				
		}

	}

}
}