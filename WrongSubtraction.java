import java.util.*;
public class WrongSubtraction {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	sc.close();
    	
    	for(int i=0; i<k; i++) {
    		int rem = n%10;
    		if(rem==0)
    			n/=10;
    		else
    			n-=1;
    	}
    	
    	System.out.println(n);
    }
    
}