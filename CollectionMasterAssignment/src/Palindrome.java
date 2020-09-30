

import java.util.Scanner;

public class Palindrome {

			  public static void main(String[] args) {
			    Scanner scanner = new Scanner(System.in);
			    System.out.println("Enter a String");
			    String Str1 = scanner.next();
			    String finalstr="";
			    if(Str1.isEmpty()) {
			    	finalstr= "";
			    }
			    else {
			    int n = Str1.length();
			    int longestSoFar = 0, fst = 0, lst = 0;
			    boolean[][] palindrom = new boolean[n][n];
			    
			    for(int j = 0; j < n; j++) {
			    	palindrom[j][j] = true;
			    	for(int i = 0; i < j; i++) {
			    		if(Str1.charAt(i) == Str1.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
			    			palindrom[i][j] = true;
			    			if(j-i+1 > longestSoFar) {
			    				longestSoFar = j-i+1;
			    				fst = i;
			    				lst = j;
			    			}  
			    		}
			    	}
			    }
			    
			   finalstr= Str1.substring(fst, lst+1);
			  }
			  System.out.println(finalstr);
			  }
			  }	


