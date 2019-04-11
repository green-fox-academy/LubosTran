public class StringAgain {
    public static void main(String[] args) {
        System.out.println(removeChar("jxjxjxxjxjxjxj", 'x'));
    }
    public static String removeChar(String str, char target) {
        if (str.length() == 0) {
            return str;
        } else {
            if (str.charAt(0) == target) {
                // remote the first character, and apply the recursive method to
                // the rest of the String
                return removeChar(str.substring(1), target);
            } else {
                // don't remote the first character, and apply the recursive method to
                // the rest of the String
                return str.charAt(0) + removeChar(str.substring(1), target);
            }
        }
    }
}