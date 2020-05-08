import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int n = Integer.parseInt(br.readLine());
        int rotateAlpha = n % 26;
        int rotateNum = n % 10;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] >= 65 && arr[i] <= 90)
            {
 
                arr[i] = (char)(((arr[i] - 65 + rotateAlpha) % 26) + 65);
            }
            else if(arr[i] >= 97 && arr[i] <= 122)
            {
                arr[i] = (char)(((arr[i] - 97 + rotateAlpha) % 26) + 97);
            }
            else if(arr[i] >= 48 && arr[i] <= 57)
            {
                arr[i] = (char)(((arr[i] - 48 + rotateNum) % 10) + 48);
            }
        }
        System.out.println(new String(arr));
    }
        
}
