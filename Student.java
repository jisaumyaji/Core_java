class Student{
    int age;
    String name;
    Student(String naam, int umar){
        age=umar;
        name=naam;
    }

    void m1(){
        System.out.println(name);
        System.out.println(age);
    }
    void m2(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args){
        Student obj= new Student("sam",20);
        Student obj2 = new Student("chinmay",24);
        obj.m1();
        obj2.m2();
    }
}