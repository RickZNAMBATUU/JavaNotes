class Static {
    // static block
    static {
        System.out.println("It will always execute first before the main method");
        // statements inside this block will execute first before the main method
    }

    public static void main(String[] args) {
        // static - they are belong to the class not to the object, they are common to all the objects
        // non-static - they are accesible using the instance object
        // static member or class member

        // static variable
        static int staticVariable = 1; // shared same value of variable for all instances of objects
        // when you change the value of the static variable, it will also change through all the objects

        // static method
        static int staticMethod() { // when you have an static method, it means you don't need an object to call the method
        // it also means, this method is not related to this class that's why it doesn't need an object just to use this
        // also, you cannot put non-static variable inside static method, it must be a static
            return staticVariable; // it must be a static variable
        }

        staticMethod(); // you must not use the object instance name when calling a static method
        // because static variable have the same value through all the objects, you may specify the method
        // that using the static variable with the class name and not by the object's name
        // what is the use of using the object's name if the variable is the same for everyone?
    }
}
