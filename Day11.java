import java.util.ArrayList;
import java.util.Arrays;

public class Day11 {
    public static void main(String[] args) {
        // this keyword
        // solve set matrix zeroes problem

    }
    static int[][] set_matrix_zeroes(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<int[]> record = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    record.add(new int[]{i,j});
                }
            }
        }
        for(int[] currentRecord : record){
            for(int i=0;i<rows;i++){
                matrix[i][currentRecord[1]]=0;
            }
            for(int i=0;i<cols;i++){
                matrix[currentRecord[0]][i]=0;
            }
        }
        return  matrix;
    }
}
