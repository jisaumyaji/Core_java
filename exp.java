class exp{
    public static void main(String[] args){
        // //ArithmeticException
        int x= 10/0;
        System.out.println(x);

        //NullPointerException
        String s= "hello";
        s=null;
        System.out.println(s.length());

        //ArrayIndexOutOfBoundsException

        int[] arr= new int[2];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(arr[2]);

        //NumberFormatException

        String r="hello";
        int i=Integer.parseInt(r);
        System.out.println(r);

    }
}