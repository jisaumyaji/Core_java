public class public_private {
    private static int a=5;
   private void test(){
        System.out.println(a);
        return;
    }
    public static void main(String[] args) {
        public_private obj= new public_private();
        // System.out.println(a);
        // System.out.println(obj.a);
        obj.test();
    }
}
