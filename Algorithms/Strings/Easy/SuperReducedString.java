/**
 * @author https://github.com/davidmateoc
 * @problem https://www.hackerrank.com/challenges/reduced-string
 */
package Easy;

public class SuperReducedString {
    static String superReducedString(String s) {
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                s = s.substring(0, i - 1) + s.substring(i+1);
                i = 0;
            }
        }

        if (s.length() == 0) {
            return "Empty String";
        } else {
            return s;
        }
    }

    public static void main(String[] args) {

        String result = superReducedString("aacabbc");
        System.out.println(result);

    }
}
