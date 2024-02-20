public class largeststring {
    public static void main(String[] args) {
        //[54,546,548,60]
        //output=6054854654
        int arr[]={54,546,548,60};
        int i=0;
        int x;
        int y;
        String z;
        for(i=0;i<arr.length;i++){
            if(i<arr.length)
            {
            x=arr[i];
            y=arr[i+1];
            System.out.println(Integer.compare(x, y));
                         }
            else if(i>=arr.length){
                break;
            }
            
        }
    }
    
}
