package DailyChallenges;

import java.util.Arrays;

public class PrintMatrixInDaigonalPattern {
	 public static int[] findDiagonalOrder(int[][] mat) {
	        //check matrix is empty
	        if(mat == null || mat[0].length == 0 || mat.length == 0)
	            return new int[0];
	            
	        int m = mat.length; //length 0f row 
	        int n = mat[0].length; // length of column
	        
	        int result[] = new int[m*n]; //output in the single array
	        
	        int row = 0 , col = 0; //Initialize the row and col
	        boolean signUp = true; // Direction flag
	        
	        for(int i = 0 ; i< result.length ; i++){
	            
	            result[i] = mat[row][col];
	            
	            if(signUp){
	                if(row == 0 || col == n-1){
	                    signUp = false;
	                    
	                    if(col == n-1) row++; // move down if the last column
	                    else
	                        col++; // move right if at the first row
	                    
	                }else{
	                    row --;
	                    col ++;
	                }
	            }
	                else {
	                    if(col == 0 || row == m-1){
	                        signUp = true;
	                    if(row == m-1) col++; // move right if the last row 
	                    else
	                        row++; //move down if the first column
	                    }else{
	                        row++;
	                        col--;
	                }
	                    
	                }
	            
	           
	        }
	         return result;
	    }

	    public static void main(String[] args) {
	        int[][] mat = {{1, 2, 3},
	                       {4, 5, 6},
	                       {7, 8, 9}};
	        int[] result = findDiagonalOrder(mat);
	        System.out.println(Arrays.toString(result));
	    }
	}

	/*
	 * Output
	 * 
	 * [1, 2, 4, 7, 5, 3, 6, 8, 9]
	 */

