import java.util.*;
public class PetyaAndStrings {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.next();
    	String s2 = sc.next();
    	sc.close();
    	int x = s1.toLowerCase().compareTo(s2.toLowerCase());
    	if (x>0) {
    		System.out.println(1);
    	}
    	else if(x<0) {
    		System.out.println(-1);
    	}
    	else {
    		System.out.println(0);
    	}
    	
    }
    
}