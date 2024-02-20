import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) 
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.findLeaders(arr, n);
    }
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					continue;
				}
				if(j>i){
					if(elements[i]>elements[j]){
						System.out.println(elements[i]);
				}
				else continue;
			}
			// System.out.println(elements[elements.length]);
		}
	}
	}
}
