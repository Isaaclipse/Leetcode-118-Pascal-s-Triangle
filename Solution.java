/*
    Use two for loops to traverse each row and cell, do a double grab of elements in the previous rows
    and store them in the current cell, and return the completed triangle
    
    Time Complexity: O(n^2)
    Space Complexity: O(n)
*/

import java.util.*;

class Solution {
   public static void main(String[] args) {
   }

    public List<List<Integer>> generate(int numRows) {
     
        // Create a list of a list of integers called "triangle"
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Check if numRows is equal to 0 (Is empty). if so then return the triangle
        
        if(numRows == 0) return triangle;
        
        // Create the first row of the array list, and add one to it, then add it to the triangle
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        // Loop up to numRows starting at 1, each time you loop through, add a new list. Grab the previous row (list), 
        // initialize the "current" row (row)
        // for the outer loop, add 1 (row.add(1))
        
        for (int i = 1; i < numRows; i++){
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
          
        // do the inner loop starting at 1 through the current row(i), iterate up to i because i is the current row we're at and i increases
        // to the current row we need.
        // grab the elements from the previous row, add them together, and put them in the current row cell
        // add 1 at the last row cell
        // return triangle
            
        for(int j = 1; j < i; j++){
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
    }
}

// Use two for loops