import java.util.*;
public class Bit {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int X=0;
    	
    	for(int i=0;i<n;i++) {
    		String exp = sc.next();
    		X = eval(exp, X);
    	}
    	System.out.println(X);
    	sc.close();
    }
    
    static int eval(String exp, int X) {
    	if(exp.equals("++X") || exp.equals("X++")) {
    		X++;
    	}
    	else {
    		X--;
    	}
    	
    	return X;
    }
}
    