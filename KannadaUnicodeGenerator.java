// public class KannadaUnicodeGenerator {
//     public static void main(String[] args) {
//         System.out.println("--- All Kannada Unicode Characters (U+0C80 to U+0CFF) ---");
//         System.out.printf("%-10s %-12s %s%n", "Hex Code", "Java Escape", "Character");
//         System.out.println("---------------------------------------------------------");

//         // The official Kannada Unicode block range is 0x0C80 to 0x0CFF
//         for (int i = 0x0C80; i <= 0x0CFF; i++) {
//             char ch = (char) i;
            
//             // Skip unassigned/defined code points to avoid printing blank boxes
//             if (Character.isDefined(ch)) {
//                 String hexCode = String.format("U+%04X", i);
//                 String javaEscape = String.format("\\u%04X", i);
                
//                 // Printing the representation
//                 System.out.printf("%-10s %-12s %c%n", hexCode, javaEscape, ch);
//             }
//         }
//     }
// }


public class KannadaUnicodeGenerator {

    public static void main(String[] args) {

        // Kannada Unicode starts from U+0C80
        // and ends at U+0CFF

        for (int i = 0x0C80; i <= 0x0CFF; i++) {

            char ch = (char) i;

            System.out.println("Unicode: U+" + Integer.toHexString(i)
                    + "  Character: " + ch);
        }
    }
}
