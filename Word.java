import java.util.*;
public class Word {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	
    	int lower = 0;
    	int upper = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		if(Character.isUpperCase(s.charAt(i))){
    			upper++;
    		}
    		else {
    			lower++;
    		}
    	}
    	
    	if(lower>upper || upper==lower) {
    		System.out.println(s.toLowerCase());
    	}
    	else {
    		System.out.println(s.toUpperCase());
    	}
    }
    
}