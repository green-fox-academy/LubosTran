public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf " +
                "dna eurt fo sgninaem eht fI";
        //System.out.println(reversedChar);
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        //String value = "cat";
        // Loop through all characters in the string.
        // ... Use charAt to get the values.
        for (int i =  reversed.length() -1; i >= 0; i--) {
                char reverse = reversed.charAt(i);

            System.out.print(reverse);
//
        }
     //public static int reversedChar (){
     //    for (int i =0; i < reversed.length(); i++) {
     //        reversedChar = reversed.charAt(i)
     //    }
     //    System.out.print("");
     //    return reversedChar
     //   }
     //   System.out.println(reversedChar);
    }
}