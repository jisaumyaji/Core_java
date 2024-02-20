class Dvz{
public static void main(String[] args)
{  
   try{
      // int a =10/0;
      int arr[];
      arr= new int[4];
      arr[0]=1;
      arr[1]=2;
      arr[3]=4;
      arr[4]=5;
      arr[2]=2;

      System.out.println("try block is running.....");
      System.out.println("second statement of try block"+arr[3]);
   }
   catch(ArithmeticException obj){
      System.out.println("the exception is caught.."+obj);
   }
   catch(IndexOutOfBoundsException e){
      System.out.println("hello sam how are you \n   "+e);
   }
   catch(Exception f){
      System.out.println("yes.....");
   }
}
}