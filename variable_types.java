public class variable_types {
    static int a=5;
   static String b="saumya";
    String d="Patel";
    public static void test(){
          int c=6;
        System.out.println(c);
        System.out.println(b);
        // System.out.println(d);
        return;
    }
    public void test1(){
        // System.out.println(c); cannot access the local variable
        System.out.print(b);
        System.out.println(d);
        return;
    }

    public static void main(String[] args) {
        variable_types obj = new variable_types();
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(obj.b);
        obj.test1();
        // test();
    }
}
