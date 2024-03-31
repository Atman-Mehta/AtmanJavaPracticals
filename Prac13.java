// Write a Java program to implement string operations.

package JavaPracticals;

public class Prac13 {
    public static void main(String[] args) {
        // Define two sample strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatString);

        // Length of a string
        int length = concatString.length();
        System.out.println("Length of String: " + length);

        // Substring
        String subString = concatString.substring(6, 11); // Extracts "World"
        System.out.println("Substring: " + subString);

        // Character at a specific index
        char charAtIndex = concatString.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);

        // Index of a specific character
        int indexOfChar = concatString.indexOf('W');
        System.out.println("Index of 'W': " + indexOfChar);

        // Converting to uppercase
        String upperCaseString = concatString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Converting to lowercase
        String lowerCaseString = concatString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Checking if a string starts with a specific prefix
        boolean startsWithHello = concatString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Checking if a string ends with a specific suffix
        boolean endsWithWorld = concatString.endsWith("World");
        System.out.println("Ends with 'World': " + endsWithWorld);

        // Replacing characters
        String replacedString = concatString.replace('o', 'x');
        System.out.println("String after replacing 'o' with 'x': " + replacedString);

        // Splitting a string into an array of substrings
        String[] splitStrings = concatString.split(" ");
        System.out.println("Split Strings:");
        for (String str : splitStrings) {
            System.out.println(str);
        }

        // Trimming leading and trailing spaces
        String stringWithSpaces = "   Hello   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}

