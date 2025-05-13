public class StringtoInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, index = 0, res = 0;

        // Handle optional '+' or '-'
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < s.length()) {
            char c = s.charAt(index);

            if (!Character.isDigit(c)) break;

            int digit = c - '0';

            // Check for overflow before adding digit
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
            index++;
        }

        return res * sign;
    }
}
