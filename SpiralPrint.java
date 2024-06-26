import jdk.jfr.Description;

public class SpiralPrint {
    @Description("Program to print content of a 2d matrix in spiral form")
    public static void SpiralPrinter(int matrix[][],int row,int col){
    int i=0,k=0,l=0;
    // l = col traversal
    // k = row traversal
    while(k<row && l<col) {
        //moving index for left to right
        for(i=l;i<col;i++){
            System.out.print(matrix[k][i]+" ");
        }
        k++;
        //moving index for top to bottom
        for(i=k;i<row;i++){
            System.out.print(matrix[i][col-1]+" ");
        }
        col--;
        ///moving index for right to left
        if(k<row) {
            for (i = col-1; i >=l ; i--) {
                System.out.print(matrix[row - 1][i] + " ");
            }
            row--;
        }
        //moving index for left to right
       if(l<col){
           for(i=row-1;i>=k;i--){
               System.out.print(matrix[i][l]+" ");
           }
           l++;
       }
    }
}


    public static void main(String[] args) {
    //matrix
        int[][] matrix= new int[][]{
                {1, 2, 3, 4},
                { 5, 6, 7, 8,},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    SpiralPrinter(matrix,4,4);

    }
}
