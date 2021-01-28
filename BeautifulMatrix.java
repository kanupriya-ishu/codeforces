import java.util.*;
public class BeautifulMatrix {

    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	int[][] arr = new int[5][5];
    	 int row=-1, col=-1;
    	for(int i=0; i<5; i++) {
    		for(int j=0; j<5; j++) {
    			arr[i][j] = sc.nextInt();
    			if (arr[i][j]==1) {
    				row = i;
    				col = j;
    				break;
    			}
    		}
    	}
    	
    	sc.close();
    	row = Math.abs(2-row);
    	col = Math.abs(2-col);
    	
    	System.out.println(row+col);
    	
    }
    
}