package DailyChallenges;

public class LargestSubsquareSurroundedByX_14_03_24 {
    // Method to find the largest subsquare surrounded by 'X' in the given matrix
    int largestSubsquare(int n, char a[][]) {
        // Array to store the longest sequence of 'X's in rows
        int[][] by_rows = new int[n][n];
        // Array to store the longest sequence of 'X's in columns
        int[][] by_cols = new int[n][n];

        // Find the largest sequence in the row
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++) {
                // Increment 'row' if 'X' is encountered, otherwise reset it to 0
                if (a[i][j] == 'X') {
                    row++;
                } else {
                    row = 0;
                }
                // Store the longest sequence in the corresponding cell of the by_rows array
                by_rows[i][j] = row;
            }
        }

        // Find the largest sequence in the column
        for (int i = 0; i < n; i++) {
            int col = 0;
            for (int j = 0; j < n; j++) {
                // Increment 'col' if 'X' is encountered, otherwise reset it to 0
                if (a[j][i] == 'X') {
                    col++;
                } else {
                    col = 0;
                }
                // Store the longest sequence in the corresponding cell of the by_cols array
                by_cols[j][i] = col;
            }
        }

        // Initialize the result variable to store the size of the largest subsquare
        int result = 0;
        // Traverse to find the largest subsquare
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Calculate the maximum possible side length of the subsquare at cell (i, j)
                int side = Math.min(by_rows[i][j], by_cols[i][j]);

                // Iterate to find the largest subsquare with cell (i, j) as the bottom-right corner
                while (side > result) {
                    // Check if the subsquare is surrounded by 'X's on all sides
                    if (i - side + 1 >= 0 && j - side + 1 >= 0 && by_rows[i - side + 1][j] >= side && by_cols[i][j - side + 1] >= side) {
                        // Update the result if a larger subsquare is found
                        result = side;
                        // Break out of the while loop to avoid unnecessary iterations
                        break;
                    } else {
                        // Decrease the side length and continue checking for a valid subsquare
                        side--;
                    }
                }
            }
        }
        // Return the size of the largest subsquare surrounded by 'X's
        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Create an instance of the solution class
        LargestSubsquareSurroundedByX_14_03_24 solution = new LargestSubsquareSurroundedByX_14_03_24();
        // Define the size of the matrix
        int n = 5;
        // Define the input matrix
        char[][] a = {
                {'X', 'O', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'O', 'X'}
        };
        // Call the largestSubsquare method and store the result
        int result = solution.largestSubsquare(n, a);
        // Print the result
        System.out.println("Output: " + result);
    }
}


/* Output: 2 */
