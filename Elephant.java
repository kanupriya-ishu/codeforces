import java.util.*;
public class Elephant {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.close();
    	int count=0;
    	
    	while(n>0) {
    		if(n>=5)
    		{
    			n-=5;
    		}
    		else if(n>=4) {
    			n-=4;
    		}
    		else if(n>=3) {
    			n-=3;
    		}
    		else if(n>=2) {
    			n-=2;
    		}
    		else {
    			n--;
    		}
    		count++;
    		
    	}
    	
    	System.out.println(count);
    }
    
}