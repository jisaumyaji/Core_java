public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,6,2,3,4,2};
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println("the output is"+arr[i]);
            }
             
        }
    }
}
