import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        
        // if(ch>='A' && ch<='Z')
        // {
        //     System.out.println(1);
        // }
        // else if(ch>='a' && ch<='z')
        // {
        //     System.out.println(0);
        // }
        // else
        // {
        //     System.out.println(-1);
        // }
        
        
        //2nd Solution
        if(ch>=65 && ch<=90)
        {
            System.out.println(1);
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(-1);
        }
    }
}