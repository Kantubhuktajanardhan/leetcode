/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

https://leetcode.com/problems/matrix-diagonal-sum/description/
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int result=0;
        if(mat.length == 1)
        {
            return mat[0][0];
        }
        else if(mat.length%2 == 0)
        {
            //left diagonal
            for(int i=0;i<mat.length;i++)
            {
                result=result+mat[i][i];
            }
            //rigth diagonal
            for(int j=0;j<mat.length;j++)
            {
                result=result+mat[j][mat.length-1-j];
            }

            return result;
        }
        else
        {
            //left diagonal
            for(int i=0;i<mat.length;i++)
            {
                result=result+mat[i][i];
            }
            //rigth diagonal
            for(int j=0;j<mat.length;j++)
            {
                result=result+mat[j][mat.length-1-j];
            }

            return result-mat[mat.length/2][mat.length/2];

        }
    }
}
