class Cons {
    static int i, j;

    static void prime(int x) {
        
    }

    void odd(int y) {
        System.out.println("odd numbers are: ");
        for (i = 0; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    void even(int z) {
      System.out.println("even numbers are: ");
        for (i = 0; i <= z; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Cons obj = new Cons();
        obj.odd(23);
        obj.even(23);
    }
}
