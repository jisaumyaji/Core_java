public class CommandLineArgs {
    public static void main(String... args) {
        int n = args.length;
        System.out.println(n);
       for(String element: args){
        System.out.print(element+ " ");

    // System.out.println("hello world");
       }
    }
}
