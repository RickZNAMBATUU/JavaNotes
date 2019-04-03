class ExceptionHandling {
    public static void main(String[] args) {
        // exceptions - events that signal an unusual circumstance has taken place as a program runs
        // errors - events that signal the interpreter is having problems that might be unrelated to your program

        // try-catch exception handling
        float sum = 0;
        String[] arguments = {"5", "5x"};
        for (String argument : arguments) {
            try {
            sum = sum + Float.parseFloat(argument);
        } catch (NumberFormatException var) {
                System.out.println(argument + " is not a number.");
            }
        }
        System.out.println("Those numbers add up to " + sum);

        // try-catch with multiple class of exception
        try {
            System.out.println("This is an error!");
        } catch (NumberFormatException var) { // class of exception and the variable to be assigned for that exception
            // code that handle exception
        } // catch (ArithmeticException exc | MalformedURLException exc) { // can use "|" to seperate other class
            // code that handle exception }

        // try-catch-finally
        try {
            // statements that might cause the exception
        } catch (Exception var) {
            // what to do when the exception occurs
        } finally {
            // statements to execute no matter what happens
        }

        // throw an exception
        try {
            // cause the exception
        } catch (final Exception var) { // the specific class that was caught is thrown
            // what to do
            throw var; // throw the specific exception detail
        }

        // checked exception - can be handle by the try-catch
        // unchecked exception - cannot be handle like elements in array exception
    }
        // throws
    public void ignoringException(String address) throws NumberFormatException {
        // it will ignore completely what the exception throws
    }
}
