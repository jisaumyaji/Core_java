
import java.util.*;
class code {

	public static void matrix(int mat[][])
	{
	    for (int[] row : mat)
     	System.out.println(Arrays.toString(row));
	}

	public static void main(String args[])
	{  int k,i,j;
		int mat[][] = { { 1, 1, 1, 0, 0},
						{ 1, 1, 0, 0, 0},
						{ 1, 0, 0, 0 ,0},
					    { 1 ,1, 1, 1, 1} };
		matrix(mat);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of weak countries = ");
		k=sc.nextInt();
		if(k==1){
			for(i=2;i==2 ;i++ ){
				for(j=0; j<5; j++){
					System.out.println(" "+ mat[i][j]);
				}
				System.out.println(" ");
			}
		}
		else if(k==2){
			for(i=1;i<=2 ;i++ ){
				for(j=0; j<5; j++){
					System.out.println(" "+ mat[i][j]);
				}
				System.out.println(" ");
			}
		}

		else if(k==3){
			for(i=0;i<=3 ;i++ ){
				for(j=0; j<5; j++){
					System.out.println(" "+ mat[i][j]);
				}
				System.out.println(" ");
			}
		}
	}
}
