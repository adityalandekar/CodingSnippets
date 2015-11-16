import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

	public static void printMatrix(String[][] matrix) {

		int matrixSize = matrix.length;

		for (int i = 0; i < matrixSize; i++) {

			for (int j = 0; j < matrixSize; j++) {

				System.out.print(matrix[i][j] + " ");

			}

			System.out.println();
		}
	}

	public static void printMatrixInSpiral(String[][] matrix) {

		int m = matrix.length;
		int n = matrix.length;
		
		int i, k = 0, l = 0;
		 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	            System.out.print(matrix[k][i] + " ");
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	            System.out.print(matrix[i][n-1] + " ");
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	                System.out.print(matrix[m-1][i] + " ");
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	                System.out.println(matrix[i][l] + " ");
	            }
	            l++;    
	        }        
	    }

	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the matrix");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = br.readLine();
			int matrixSize = Integer.parseInt(line);

			String[][] matrix = new String[matrixSize][matrixSize];

			for (int i = 0; i < matrixSize; i++) {

				String input = br.readLine();

				matrix[i] = input.split(" ");
			}

			printMatrix(matrix);
			
			printMatrixInSpiral(matrix);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
