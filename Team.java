import java.util.*;
public class Team {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int count = 0;
    	for(int i=0; i<n; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		
    		if((a+b+c)>=2) {
    			count++;
    		}
    	}
    	sc.close();
    	System.out.println(count);
    }
}