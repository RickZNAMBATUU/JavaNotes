class DataType {
    public static void main (String[] args) {

        int a, b, c, d; // declaring a variables in one line with the same type
        final String CONSTANT_VAR = "Cannot be changed"; // to declare a constant variable, usually it is static

        // data types
        // primitive data types:

        // integral data type
        int monthsary = 29; // integer ranges -2.14 billion to 2.14 billion
        short roomNumber = 222; // smaller than int, ranges -32,768 to 32,767
        long funds = 264_400_000_000_00L; // larger than int, ranges -9.22 quintillion to 9.22 quintillion
        byte escapeKey = 27; // integer ranges -128 to 127
        char letter = 'F'; // single letter, number, symbol with only one quotation mark, ranges from 0 to 65,635
        BigInterger biggerInteger; // it can store any number but it is not primitive

        // floating-point data type
        float grades = 1.0121542F; // decimal ranges 38 figures
        double pie = 3.14324124123; // decimal ranges 300 figures
        BigDecimal biggerFloat; // it can store any amount of decimal points but not a primitive

        // boolean data type
        boolean gameOver = true; // return True or False

        // special primitive object
        String name = "Frederick"; // group of characters with capital name String and double quotation mark

        // note:
        // use underscore (_) to serves as decimal point in initializing a value

        // special character after the values:
        // "L" specifies as long value
        // "F" indicates it's a float value
        // "D" for double floating value, default value for floating-point type

        // special character before the values:
        // "0b" indicates it's a binary number // int binary = 0b0000_1101;
        // "Ox" indicates it's a hexadecimal // int hexa = 0x1C;
    }
}
