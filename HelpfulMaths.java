import java.util.*;
public class HelpfulMaths {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	String ip = sc.nextLine();
    	sc.close();
    	
    	if(ip.length()==1) {
    		System.out.println(ip);
    	}
    	
    	else {
    		int n = ip.length()/2+1;
        	
        	int[] arr = new int[n];
        	int len=0;
        	
        	for(int i=0; i<ip.length(); i+=2) {
        		arr[len++] = ip.charAt(i)-'0';
        	}
        	
        	Arrays.sort(arr);
        	String ans="";
        	for(int i=0; i<n-1; i++) {
        		ans = ans + Integer.toString(arr[i]) + "+";
        	}
        	
        	ans = ans + Integer.toString(arr[n-1]);
        	System.out.println(ans);
    	}
    		
    }
    
}