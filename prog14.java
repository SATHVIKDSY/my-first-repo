package patterns;
import java.util.Scanner;

public class prog14 {

	public static void main(String[] args) {
	
		
		        Scanner sc = new Scanner(System.in);
		        
		        // Read the number of colonies
		        int t = sc.nextInt();  // number of colonies			
		        
		        // Process each colony
		        while (t-- > 0) {
		            // Read number of buildings and earning for each visible building
		            int n = sc.nextInt();  // number of buildings
		            int earning = sc.nextInt();  // earning for each visible building
		            
		            // Read the heights of the buildings
		            int[] heights = new int[n];
		            for (int i = 0; i < n; i++) {
		                heights[i] = sc.nextInt();
		            }
		            
		            // Calculate the total earnings for the day in this colony
		            int totalEarnings = 0;
		            int maxHeightSoFar = -1;  // Initially, no building is seen
		            
		            for (int i = 0; i < n; i++) {
		                if (heights[i] > maxHeightSoFar) {
		                    // If the building is visible
		                    totalEarnings += earning;
		                    maxHeightSoFar = heights[i];  // Update the maximum height seen so far
		                }
		            }
		            
		            // Output the total earnings for this colony
		            System.out.println(totalEarnings);
		        }
		        
		        sc.close();
		    }
		
	
		}
	

