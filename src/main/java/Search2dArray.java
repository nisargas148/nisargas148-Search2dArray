public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target) {
        // Outer loop to iterate over rows
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to iterate over columns in the current row
            for (int j = 0; j < nums[i].length; j++) {
                // If the target is found, return true
                if (nums[i][j] == target) {
                    return true;
                }
            }
        }
        // If target is not found after searching all rows and columns, return false
        return false;
    }
}
