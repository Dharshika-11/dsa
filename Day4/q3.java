//leetcode 1572.diagonal matrix 
class q3{ 
    public int diagonalSum(int[][] mat) { 
        int n = mat.length; 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum = sum + mat[i][i]; 
            if (i != n - 1 - i) { 
                sum = sum + mat[i][n - 1 - i]; 
            } 
        } 
 
        return sum; 
    } 
}