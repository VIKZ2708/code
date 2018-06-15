package janlong;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		int t = 1;
		while(t <= T){
			int n = scn.nextInt();
			int[][] nums = new int[n][n];
			
			for(int row = 0; row < nums.length; row++){
				for(int col = 0; col < nums[row].length; col++){
					nums[row][col] = scn.nextInt();
				}
				Arrays.sort(nums[row]);
			}
			
			int[] indices = new int[n];
			Arrays.fill(indices, n - 1);
			
			for(int i = n - 1; i >= 0; i--){
				for(int j = n - 1; j >= 0; j--){
					
				}
			}
			
			t++;
		}
	}

}
