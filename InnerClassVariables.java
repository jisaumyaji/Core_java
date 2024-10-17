public class InnerClassVariables {
    class FirstInnerClass{
        int data = 4;
        FirstInnerClass(){
            this.data = data;
        }
        FirstInnerClass(int data){
            this.data = data;
        }
        
        void printmethod(){
            System.out.println("Here is value"+this.data);
        }
    }
    public static void main(String[] args) {
        InnerClassVariables obj1 = new InnerClassVariables();
        InnerClassVariables.FirstInnerClass obj2 = obj1.new FirstInnerClass(6);
        obj2.printmethod();

    }
}
