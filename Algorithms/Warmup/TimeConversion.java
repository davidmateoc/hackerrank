/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/time-conversion
 */

public class TimeConversion {

    static String timeConversion(String s) {
        String hours = s.substring(0, 2);
        if (s.charAt(8) == 'A') {
            if (hours.equals("12")) {
                hours = "00";
            }
            return hours + s.substring(2, 8);
        } else {
            if (!hours.equals("12")) {
                hours = Integer.toString(Integer.parseInt(hours) + 12);
            }
            return hours + s.substring(2, 8);
        }
    }

    public static void main(String[] args) {

        String convertedTime = timeConversion("12:40:22AM");
        System.out.println(convertedTime);
    }
}
