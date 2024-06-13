public class stringBuilderClass {
    public static void main(String[] args) {
        // String str = "hello world";
        int num=52326;
        String st = Integer.toString(num);
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        int n = Integer.parseInt(sb.toString());
        System.out.println(n);

            //  long x =9646324351;
            // String str = Integer.toString(x);
            // StringBuilder sb = new StringBuilder(str);
            // sb.reverse();
            // String result = sb.toString();
            // int n= Integer.parseInt(result);
            // System.out.println(n);


            

            // class Solution {
            //     public int reverse(int x) {
            //         int r = 0;
            //         while(x != 0){
            //             // System.out.println(r + " " + Integer.MAX_VALUE / 10.0 + " " + Integer.MIN_VALUE / 10.0 );
            //             if(r > Integer.MAX_VALUE / 10 || r < Integer.MIN_VALUE / 10 ) return 0;
            //             r = r * 10 + x % 10;
            //             x = x/10;
            //         }
            //         return r;
            //     }
            // }
            
       
          }
        
    }

