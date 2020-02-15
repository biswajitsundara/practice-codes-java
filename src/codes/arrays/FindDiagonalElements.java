/**
 * @author- Biswajit Sundara
 * @Date- 03/11/2015
 * @Desc - Find all diagonal elements in a three dimensional array
 */

package codes.arrays;

public class FindDiagonalElements {

	public static void main(String[] args) {


		int mat[][] = 	{ { 2, 5, 7}, 
						  { 3, 7, 2},  
						  { 5, 6, 9} 
						}; 

		int rno= mat.length;
		int cno= mat[0].length;

		
		System.out.println("Print the matrix");
		
		for (int i=0;i<rno;i++)
		{
			for(int j=0;j<cno;j++)
			{
				System.out.print(mat[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}


		System.out.println("Print diagonal Elements from Left");

		for (int i=0;i<rno;i++)
		{
			for(int j=0;j<cno;j++)
			{
				if(i==j)
				{
					System.out.print(mat[i][j]);
					System.out.print(" ");
				}
			}

		}
		
		
		System.out.println("\nPrint diagonal Elements from right");

		for (int i=0;i<rno;i++)
		{
			for(int j=0;j<cno;j++)
			{
				if (i + j == cno - 1) 
				{
					System.out.print(mat[i][j]);
					System.out.print(" ");
				}
			}
		}

	}

}
