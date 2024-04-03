package Problem.Leetcode.String;

import static org.junit.Assert.*;

import org.junit.Test;



public class WordSearchTest {
    
    @Test
    public void testExist() {
        WordSearch wordSearch = new WordSearch();
        
        // Example 1
        char[][] board1 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(wordSearch.exist(board1, "ABCCED"));
        
        // Example 2
        char[][] board2 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(wordSearch.exist(board2, "SEE"));
        
        // Example 3
        char[][] board3 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertFalse(wordSearch.exist(board3, "ABCB"));
    }
}
