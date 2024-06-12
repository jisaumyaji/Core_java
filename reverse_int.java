public class reverse_int {
    void reverse(int n){
        int x=n/10;
        int y=n/100;
        
        System.out.println(n/100);
    }
    public static void main(String[] args) {
        reverse_int obj = new reverse_int();
        obj.reverse(135);
    }
}
