public class construct {
    String name;
    int age;
     construct(){
        this.name= "Saumya";
        this.age=10;
        System.out.println(name+age);
    }
  construct(int age, String name){
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }

    public static void main(String[] args) {
        construct obj = new construct(30,"riya");
    
    }
}
