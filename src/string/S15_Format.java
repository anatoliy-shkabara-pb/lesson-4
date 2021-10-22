package string;

public class S15_Format {
    public static void main(String[] args) {
        // Argument Index
        System.out.println(String.format("%2$s", 32, "Hello")); // prints: "Hello"

        // Formatting an Integer
        System.out.println(String.format("%d", 93)); // prints 93

        // Specifying a width:
        System.out.println(String.format("|%20d|", 93)); // prints: |                  93|

        // Left-justifying within the specified width:
        System.out.println(String.format("|%-20d|", 93)); // prints: |93                  |

        // Pad with zeros:
        System.out.println(String.format("|%020d|", 93)); // prints: |00000000000000000093|

        // Print positive numbers with a “+”(Negative numbers always have the “-” included):
        System.out.println(String.format("|%+20d|", 93)); // prints: |                 +93|

        // space before positive numbers
        System.out.println(String.format("|% d|", 93)); // prints: | 93|
        System.out.println(String.format("|% d|", -36)); // prints: |-36|

        // Enclose negative numbers within parentheses (“()”) and skip the "-":
        System.out.println(String.format("|%(d|", -36)); // prints: |(36)|

        // Octal output
        System.out.println(String.format("|%o|", 93)); // prints: 135

        // Hex output
        System.out.println(String.format("|%x|", 93)); // prints: 5d

        // Alternate representation for octal and hex output
        System.out.println(String.format("|%#X|", 93)); // prints: 0X5D

        // Prints the whole string
        System.out.println(String.format("|%s|", "Hello World")); // prints: "Hello World"

        // Specify Field Length
        System.out.println(String.format("|%30s|", "Hello World")); // prints: | Hello World|

        // Left Justify Text
        System.out.println(String.format("|%-30s|", "Hello World")); // prints: |Hello World |

        // Specify Maximum Number of Characters
        System.out.println(String.format("|%.5s|", "Hello World")); // prints: |Hello|

        // Field Width and Maximum Number of Characters
        System.out.println(String.format("|%30.5s|", "Hello World")); // prints: | Hello|



        System.out.println(String.format("Hello %s, %d", 12, 50)); // prints: | Hello|
    }
}
