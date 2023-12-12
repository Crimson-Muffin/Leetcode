// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

public class TransposeMatrix867 {
    public int[][] transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
