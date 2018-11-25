class incrementing {
    public static void main (String[] args) {
        // binary operator - with two operands
        // postfix: doesn't change the value until after the expression evaluated
        // incrementing
        int number = 4;
        int answer = number++ * 10; // answer: 40

        // decrementing
        int anotherNumber = 6;
        int anotherAnswer = anotherNumber-- * 10; // answer: 60

        // prefix: changes the value before the expression evaluated
        // incrementing
        int counter = 3;
        int sum = ++counter + 10; // answer: 14

        // decrementing
        int anotherCounter = 10;
        int difference = --anotherCounter - 5; // answer: 4

        System.out.println(answer);
        System.out.println(anotherAnswer);
        System.out.println(sum);
        System.out.println(difference);

        // same as:
        // postfix
        // int answer = x * 10;
        // x++;
        // prefix
        // x++;
        // int answer = x * 10;

        // assignment operator
        int a = 5;
        a = a + 12; // answer: 17

        // another way
        int b = 9;
        b += 12; // answer: 21

        // unary operator - with one operands
        // unary minus operator
        int toNegative = 5;
        int toPositive = -10;
        System.out.println(-toNegative); // to make it a negative number
        System.out.println(-toPositive); // to make it a positive number
    }
}
