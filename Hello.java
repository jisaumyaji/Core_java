class Hello 
{
    String  colour;
    String type;
    void get_colour(){
        System.out.println("the colour is:"+colour);
    }
    public static void main(String[] args){
        Hello obj = new Hello();
        Hello  obj2 = new Hello();
        obj.colour= "black";
        obj2.colour= "blue";
        obj2.get_colour();
        obj.get_colour();
        obj2.get_colour();
        obj.get_colour();
        obj2.get_colour();

    }
}