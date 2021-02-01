import java.util.*;
public class WordCapitalization {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	sc.close();
    	
    	String firstLetter = s.substring(0, 1).toUpperCase();
    	String remainingLetters = s.substring(1, s.length());
    	
    	String ans = firstLetter + remainingLetters;
    	
    	System.out.println(ans);
    }
    
}