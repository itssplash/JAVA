import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char ch = str.charAt(0);
        
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int avg = (a+b+c)/3;
        
        System.out.println(ch);
        System.out.println(avg);
		
	}

}