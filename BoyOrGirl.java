import java.util.*;
public class BoyOrGirl {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	List<Character> arr = new ArrayList<Character>();
    	
    	String s = sc.next();
    	sc.close();
    	
    	arr.add(s.charAt(0));
    	
    	for(int i=0; i<s.length(); i++) {
    		if(!arr.contains(s.charAt(i))) {
    			arr.add(s.charAt(i));
    		}
    	}
    	
    	if(arr.size()%2==0)
    		System.out.println("CHAT WITH HER!");
    	else
    		System.out.println("IGNORE HIM!");
    }
    
}