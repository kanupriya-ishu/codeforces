import java.util.*;
public class Translation {

    public static void main(String args[]) 
    {  
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.next();
    	String t = sc.next();
    	
    	sc.close();
    	
    	StringBuilder s1 = new StringBuilder();
    	
    	s1.append(s);
    	String s2 = s1.reverse().toString();
    	if(s2.equals(t)) {
    		System.out.println("YES");
    	}
    	
    	else {
    		System.out.println("NO");
    	}
    }
    
}