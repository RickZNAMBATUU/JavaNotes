public class StringFormatting {
    public static void main(String[] args) {
        // System.out.printf() and System.out.format are the same
        // they formatting the strings while outputing the text

        // String.format() same as printf() and format()
        // it formatting the strings in the initialization of the string
        String formatted = String.format("This is a formatted %s \n", "strings");
        System.out.format(formatted);

        // conversion type characters
        // indicators
        System.out.printf("%d\n", 10); // integer
        System.out.printf("%f\n", 12.12); // floating-point
        System.out.printf("%c\n", 'a'); // character
        System.out.printf("%C\n", 'a'); // uppercase character
        System.out.printf("%s\n", "Frederick"); // string
        System.out.printf("%S\n", "Frederick"); // uppercase string
        System.out.printf("%b\n", 5 == 4); // boolean
        System.out.printf("%B\n", 5 == 4); // uppercase boolean value
        System.out.printf("%b\n", "cow"); // boolean, return true if argument does not compare a condition
        System.out.printf("%e\n", 12.123); // return scientific notation
        System.out.printf("%E\n", 12.123); // return uppercase E in scientific notation
        System.out.printf("%o\n", 24); // return octal base
        System.out.printf("%x\n", 26); // return hexadecimal
        System.out.printf("%X\n", 26); // return uppercase hexadecimal letter
        System.out.printf("%h\n", "Fred"); // return hash code
        System.out.printf("%H\n", "Fred"); // return uppercase hash code letter
        System.out.printf("%a\n", 10.12); // return a floating-point hexadecimal
        System.out.printf("%A\n", 10.12); // return a floating-point uppercase hexadecimal letter
        System.out.printf("%%\n"); // percent sign
        System.out.printf("%n"); // new-line

        // composition of printf
        // precision modifier
        // %f, %e, %g has a default precision of 6 decimal value
        // it will round-off the last number
        // float type
        double precision = 10031.13245646;
        System.out.printf("%.0f\n", precision); // return a no decimal floating-point value
        System.out.printf("%.2f\n", precision); // return float with 2 decimal places

        // string type
        System.out.printf("%.4s\n", "Castaneda"); // return how many letter you want only to appear
        System.out.printf("%.3b\n", 4 < 3); // return how many letter you want only to appear in boolean value

        // width modifier
        // create whitespaces from the left of the value together with the value
        // the width is the minimum number of values
        System.out.printf("%4d\n", 123); // return whitespaces before the value
        System.out.printf("%10.2f\n", 123.14657); // width and precision

        // flag modifier
        // flag (hypen)
        // create whitespaces to the right of the values together with the value
        System.out.printf("%-5d%d\n", 123, 4); // return whitespaces after the value
        System.out.printf("%-10.3f%d\n", 154.687, 10); // flag, width and precision

        // flag (plus)
        // add plus sign before the value
        System.out.printf("%+d\n", 123); // adds plus sign if it's not specify
        System.out.printf("%+.2f\n", -123.544); // nothing happens if it has a negative sign

        // flag (space)
        // adds one space before the number if it does not have a plus sign
        System.out.printf("% d\n", 465); // it will adds a space because it does not have a plus sign
        System.out.printf("% .2f\n", -465.655); // it will do nothing, just print the negative sign

        // flag (zero)
        // adds zeros before the the value
        System.out.printf("%05d\n", 789); // adds zeros of how many spaces there has
        System.out.printf("%+08.2f\n", 569.485); // flag (zero) with flag (plus)

        // flag (comma)
        // adds comma, like for a currency
        System.out.printf("%,d\n", 893219897); // adds comma after 3 values
        System.out.printf("%,015.5f\n", 46789.5487); // flag (zero) with flag (comma)

        // flag (open parenthesis)
        // it will add parenthesis to the negative number (only works with negative number)
        System.out.printf("%(d\n", -5877); // adds parenthesis
        System.out.printf("%(015.2f\n", -2347.448); // flag (open parenthesis) with flag (zero) and precision

        // flag (pound sign)
        // it adds 0 or 0x to all number/base system type
        System.out.printf("%#o\n", 963); // adds 0 if octal
        System.out.printf("%#x\n", 963); // adds 0x if hexadecimal
        System.out.printf("%#09X\n", 963); // adds 0x after the value preceded with zeros and uppercase hexadecimal letter
        System.out.printf("%#.0f\n", 645.5456); // remove the numbers after the decimal point but remains the period seperator
        System.out.printf("%#08.0f\n", 5474.56);
        System.out.printf("%#a\n", 12.23); // appends a decimal point after the first number

        // argument index modifier
        // index and dollar sign ($)
        // to arrange the variable with what you want
        System.out.printf("%2$s %1$d %3$f\n", 23, "haha", 88.787); // to change the arrangement of how the variable will appear
        System.out.printf("%3$s %s %s\n", "Hello", "World", "Fred"); // dictate who's first one to call
        System.out.printf("%1$s %1$s %1$S\n", "hi"); // return many call with just one argument
        System.out.printf("%s %<s %s\n", "nyek", "Nyork"); // the less than sign (<) indicates that return the last argument that was called

        // object
        Person boy = new Person("Nacu");
        System.out.printf("%s\n", boy); // return an object type string because of toString() method
        System.out.printf("%S\n", boy); // return an object type uppercase string because of toString() method

    }
}

class Person {
    String name;

    public Person (String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s", this.name);
    }
}
