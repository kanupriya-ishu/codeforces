import java.util.*;
public class Watermelon {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.close();
    	
    	if(n>2) {
    		if(n%2==0) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
    	}
    	
    	else {
    		System.out.println("NO");
    	}
    }
}
    