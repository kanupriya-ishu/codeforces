import java.util.*;
public class BearAndBigBrother {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	sc.close();
    	
    	int i=0;
    	while(a<=b) {
    		a = 3*a;
    		b = 2*b;
    		i++;
    	}
    	
    	System.out.println(i);
    }
    
}