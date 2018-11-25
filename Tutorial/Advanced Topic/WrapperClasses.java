class WrapperClasses {
    public static void main (String[] args) {
        // each primitive data type has a corresponding class that provides several useful abilities
        // int - Integer
        // short - Short
        // long - Long
        // byte - Byte
        // char - Character
        // float - Float
        // double - Double
        // boolean - Boolean

        int myInt = 1;
        String myString = "2";

        // declaring an Integer object
        Integer stringToInteger = new Integer(myString); // to convert string to Integer (also to number)
        System.out.println(5 + stringToInteger);

        // another way to declare an primitive object
        Integer anotherWay = 10; // called unboxing

        // converting primitive type to objects and vice-versa
        Integer number = new Integer(10); // to initialize a variable object
        int newNumber = number; // autoboxing - primitive to object
        Integer anotherNumber = newNumber; // unboxing - object to primitive

        // Integer object converting to any primitive type
        Integer myObjectInt = new Integer(myInt);
        int integerToint = new Integer(myString).intValue(); // String object convert to primitive int
        short integerToShort = myObjectInt.shortValue(); // Integer object convert to primitive short
        long integerToLong = myObjectInt.longValue(); // Integer object convert to primitive long
        byte integerToByte = myObjectInt.byteValue(); // Integer object convert to primitive byte
        float integerToFloat = myObjectInt.floatValue(); // Integer object convert to primitive float
        double integerToDouble = myObjectInt.doubleValue(); // Integer object convert to primitive double

        // static methods
        // Integer.toString() - each classes has this method
        String intToString = Integer.toString(myInt); // to convert int into string
        System.out.println("No. " + intToString);

        // Integer.parseInt()
        int stringToInt = Integer.parseInt(myString); // convert string into an int
        System.out.println(2 + stringToInt);

        // Integer.toHexString()
        String integerToHex = new Integer(10).toHexString(20);
        System.out.println(integerToHex); // to convert int into hexadecimal string

    }
}
