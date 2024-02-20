// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// import java.util.*;
public class l1 {
    public static void main(String[] args) {
        int nums[] = { 3,2,4 };
        int target = 6;
        int i, j;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("the output is: [" + i + "]");
                
            } 
            
            else {
                for (j = 0; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        System.out.println("The output is: [" + i + "," + j + "]");
                    }

                }
            }

            continue;
        }
    }
}
;