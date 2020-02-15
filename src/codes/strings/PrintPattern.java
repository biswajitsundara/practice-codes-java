/**
 * @author- Biswajit Sundara
 * @Date - 05/11/2016
 * @Desc - Print * Pattern
 * 
 * 
   -----------------
   |  *  |     |    |
   -----------------
   |  *  |  *  |    |
   -----------------
   |  *  |  *  | *  | 
   ------------------
 *          
 * If we look at the pattern 1st row -- one column
 *                           2nd row -- two columns
 *                           3rd row -- three columns
 */

package codes.strings;

public class PrintPattern 
{
	
	public static void main(String argsp[])
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}

}
