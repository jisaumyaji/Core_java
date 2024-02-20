import java.util.Arrays;
import java.util.Comparator;

public class maxlength {
    public static void main(String[] args) {
        int[] numbers = {54, 23, 321, 99, 100};

        String[] numberStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberStrings[i] = Integer.toString(numbers[i]);
        }
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                return order2.compareTo(order1);
            }
        };

        Arrays.sort(numberStrings, customComparator);

        StringBuilder result = new StringBuilder();
        for (String numStr : numberStrings) {
            result.append(numStr);
        }

        System.out.println("Maximum string representation of numbers: " + result.toString());
    }
}
