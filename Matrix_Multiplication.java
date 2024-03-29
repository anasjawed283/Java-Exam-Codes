//Read description for question
import java.util.*;
class Main {
    static void printMatrix(int M[][],int rowSize,int colSize)
    {
        for (int i = 0; i < rowSize; i++) 
        {
            for (int j = 0; j < colSize; j++)
            {
                if(j!=colSize-1)
                System.out.print(M[i][j] + " ");
                else
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }
    static void multiplyMatrix(int row1, int col1, int A[][],int row2, int col2, int B[][])
    {
        int i, j, k;
        if (row2 != col1) 
        {
            System.out.println("Multiplication not possible");
        }
        int C[][] = new int[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        printMatrix(C, row1, col2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int A[][]=new int[row1][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int B[][]=new int[row2][col2];
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        multiplyMatrix(row1, col1, A,row2, col2, B);
    }
}
