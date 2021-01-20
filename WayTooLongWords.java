import java.util.*;
public class WayTooLongWords {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i=0; i<n; i++) {
    		String str = sc.next();
    		if(str.length()>10) {
    			StringBuilder ans = new StringBuilder();
    			ans.append(str.charAt(0)).append(str.length()-2).append(str.charAt(str.length()-1));
    			System.out.println(ans);
    		}
    		else {
    			System.out.println(str);
    		}
    	}
    	sc.close();
    }
}