import java.util.*;
public class SoldierAndBananas {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int k = sc.nextInt();
    	int n = sc.nextInt();
    	int w = sc.nextInt();
    	
    	sc.close();
    	
    	int total = 0;
    	for(int i=1; i<=w; i++) {
    		total = total + i*k;
    	}
    	
    	if(total-n>0) {
    		System.out.println(total-n);
    	}
    	
    	else {
    		System.out.println(0);
    	}
    }
    
}