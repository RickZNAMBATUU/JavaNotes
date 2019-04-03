class Casting {
    public static void main (String[] args) {
        // casting
        // converting primitive data type to another data type

        // primitive data type casting
        // float to int
        float grade = 9.0232F; // source
        int convertedGrade = (int) (grade); // destination
        System.out.println("Source: " + grade);
        System.out.println("Destination: " + convertedGrade);
        System.out.println((int) (7.88 + 8.9)); // convert the result into an int

        // byte to int
        // widening cast
        // from smaller value to larger value conversion
        byte myByte = 123;
        int intToByte = myByte;

        // int to short
        // narrowing cast
        // from larger value to smaller value conversion
        int myInt = 123;
        short intToShort = (short) (myInt);

        // double to int
        // from floating-point type into integral type
        double myDouble = 312.21343;
        int doubleToInt = (int) (myDouble); // truncates (remove) the remainder and return a whole number

        // note: converting int to string is not allowed instead, use wrapper method toString() to convert
        // note: converting char to string is not allowed instead, use wrapper method toString() to convert

        // objects casting
        // you can cast objects when they are related by inheritance

        // class AnotherClass extends SuperClass {
        //     public void myMethod(SubClass newObject) {
        //         // AnotherClass comp2D = (AnotherClass) newObject;
        //     }
        // }
    }
}
