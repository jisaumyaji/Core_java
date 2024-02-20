import java.util.* ;
import java.io.*; 

public class Sign {
	public static void posAndNeg(int[] arr) {
		// Write your code here
		int result[];
		int i,j;
		for( i=0; i<arr.length;i++){
			if(arr[i]>=0){
				result[i]=arr[i];
			}
			else
			{
				result[i+1]=arr[i];
			}
		}
		// for print 
		for(j=0; j<arr.length;j++){
			System.out.println(result[j]);
		}
		
	}

}
