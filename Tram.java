import java.util.*;
public class Tram {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int capacity = 0;
    	int passengers = 0;
    	
    	for(int i=0; i<n; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		passengers = passengers - a + b;
    		
    		if(passengers>capacity) {
    			capacity = passengers;
    		}
    	}
    	
    	sc.close();
    	
    	System.out.println(capacity);
    }
    
}