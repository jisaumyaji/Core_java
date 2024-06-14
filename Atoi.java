public class Atoi {
    public int myAtoi(String s) {
        // Define limits for 32-bit signed integer
        int INT_MAX = 2147483647;
        int INT_MIN = -2147483648;
        
        int i = 0;
        int n = s.length();
        
        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check if string is empty after removing spaces
        if (i >= n) {
            return 0;
        }
        
        // Check the sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        int result = 0;
        
        // Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // Check for overflow
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }

    public static void main(String[] args) {
        Atoi sol = new Atoi();
        
        System.out.println(sol.myAtoi("42"));               // Output: 42
        System.out.println(sol.myAtoi("   -42"));           // Output: -42
        System.out.println(sol.myAtoi("4193 with words"));  // Output: 4193
        System.out.println(sol.myAtoi("words and 987"));    // Output: 0
        System.out.println(sol.myAtoi("-91283472332"));     // Output: -2147483648 (overflow case)
    }
}
