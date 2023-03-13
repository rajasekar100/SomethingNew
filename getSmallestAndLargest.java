import java.util.Scanner;

public class Solution {

    /**
     * Returns the smallest and largest substring of `s` of length `k`
     * @param s The string to find substrings in
     * @param k The length of the substrings
     * @return The smallest and largest substring of length `k`
	 * @author Rajasekar
     */
    public static String getSmallestAndLargest(String s, int k) 
    {
        // Initialize the smallest and largest substrings as the first k characters of `s`
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Loop through each possible substring of length k in `s`
        for(int i = 0; i + k - 1 < s.length(); i++)
        {
            // If the current substring is smaller than the current smallest substring, update `smallest`
            if(smallest.compareTo(s.substring(i,i+k)) > 0)
                smallest = s.substring(i,i+k);
            
            // If the current substring is larger than the current largest substring, update `largest`
            if(largest.compareTo(s.substring(i,i+k)) < 0)
                largest = s.substring(i,i+k);
        }
        
        // Return the smallest and largest substrings as a single string with a newline separator
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); // Read a string from standard input
        int k = scan.nextInt(); // Read an integer from standard input
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k)); // Call `getSmallestAndLargest` and print the result
    }
}

// Problem link: https://www.hackerrank.com/challenges/java-string-compare/problem
