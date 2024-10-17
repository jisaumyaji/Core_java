// class Raw{
//      public void add(int num1, int num2){
//         System.out.println("the sum is"+(num1+num2));
//      }
// }
// class Node{
//     int data;
//     Node next;
//     int size=0;
//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//     public void addnode(int data){
//        if(size==0){
        
//        }
//     }
// }


// public class Learnagain {
//     public class Raw{
//         public void add(int num1, int num2){
//            System.out.println("the sum is"+(num1+num2));
//         }
//    }

//     // class Node{
//     //     int data;
//     //     Node next;
//     //     int size=0;
//     //     public Node(int data){
//     //         this.data = data;
//     //         this.next = null;
//     //     }
//     //     public void addnode(int data){
//     //        if(size==0){
            
//     //        }
//     //     }
//     // }
//     public static void main(String[] args) {
//         System.out.println("hello");
//         // Raw obj = new Raw();
//         // obj.add(2,3);
//         Learnagain obj = new Learnagain();
//         obj.Raw.add(2,3);
//     }
// }








// nested classes in java


// 1. outer static class = class outside the class
// 2. innerclass = class inside class
// 3. local class = class inside method
// 4. anonymous class = class without class

 class OuterClass{

    private String str = "this is private string";
    class OuterInnerClass{
        int sub(int num1, int num2){
            return num1-num2;
        }
    }
    void message(){

        System.out.println(str);

        class Localclass{
            String str = "this is a local class message";
            void display(){
                System.out.println(str);
            }
        }
        Localclass localclassobject = new Localclass();
        localclassobject.display();
    }
   static void mergedString(String str1, String str2){
        System.out.println(str1+str2);
    }
   void mergedString2(String str1, String str2){
        System.out.println(str1+str2);
    }
}


 public class Learnagain{
    static int num = 3;
    static int add(int num2, int num3){
        return num2+num3;
    }
     int mul(int num2, int num3){
        return num2*num3;
    }
    public static void main(String[] args){
        System.out.println("hello i am learning class "+num);
        System.out.println(Learnagain.add(3,4));
        OuterClass.mergedString("hello","world");
        OuterClass outerclassobject = new OuterClass();
        outerclassobject.mergedString2("Rashi", "Patel");
        // obj.mergedString("Saumya", "Patel");
        Learnagain object = new Learnagain();
        System.out.println(object.mul(3,4));
     OuterClass.OuterInnerClass innerclassobject = outerclassobject.new OuterInnerClass();
     System.out.println(innerclassobject.sub(8,2));
     outerclassobject.message();

    }
}