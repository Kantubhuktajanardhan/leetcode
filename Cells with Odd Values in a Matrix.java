/*
There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
*/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[] row=new int[m];
        int[] col=new int[n];
        for(int x[]:indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }    
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }        
        return count;
    }
}
