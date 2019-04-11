public class Strings {
    //Given a string, compute recursively (no loops)
    // a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        String words = "xXjhxkkjhxhkjxhkjxjxjhxjhxkhjkxjh";
        char from = 'x';
        char to = 'y';

        System.out.println(replaceCharacters(words, from, to));
    }

    //public static String replace(String s, char from, char to){
    //    if (s.length() < 1) {
    //        return s;
    //    }
    //    else {
    //        char first = from == s.charAt(0) ? to : s.charAt(0);
    //        return first + replace(s.substring(1), from, to);
    //    }
    //}
    public static String replaceCharacters(String line, char change, char newChar)
    {
        if(line.indexOf(change) == -1)
            return line;
        char[] lineArray = line.toCharArray();
        lineArray[line.indexOf(change)] = newChar;
        return replaceCharacters(new String(lineArray),change,newChar);
    }



}
