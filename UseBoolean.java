public class UseBoolean {

    public int returnmethod(int i){
        while(true){
            // System.out.println(i);
            i++;
            if(i==5){
                return i;
            }
        }
    }
    public static void main(String[] args) {
        UseBoolean obj = new UseBoolean();
        boolean isvalue = false;
        if(!isvalue){
            System.out.println("hello world");
        }
        System.out.println("hello saumya");
        int j = obj.returnmethod(1);
        System.out.println(j);
        
        
    }
    
}
