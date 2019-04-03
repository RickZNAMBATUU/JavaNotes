class ControlFlow {
    public static void main(String[] args) {
        // no block statement
        if ("fred" == "w") System.out.println("Same/Equal"); // it can have no block or brackets and set only to one line.
        else System.out.println("gago");

        // if else statement
        double salary = 800_000.34521234123;
        if (salary >= 900_000) {
            System.out.println("You've passed this subject! Congrats!");
        } else {
            System.out.println("I'm sorry but you failed this subject.");
        }

        // else-if statement
        char grade = 'B';
        if (grade == 'A') {
            System.out.println("You got an A. Awesome! haha");
        } else if (grade == 'B') {
            System.out.println("You got an B. Beautiful! hehe");
        } else if (grade == 'C') {
            System.out.println("You got an C. Concerning! hihi");
        } else {
            System.out.println("You got an F. Failed! huhu");
        }

        // switch statement
        char anotherGrade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("You got an A. Awesome!");
                break;
            case 'B':
                System.out.println("You got a B. Beautiful!");
                break;
            case 'C':
                System.out.println("You got a C. Concerning!");
                break;
            default:
                System.out.println("You got an F. You'll do well in Congress!");
        }

        // ternary conditional statement
        // ? - (Ternary Operator)
        int age = 19;
        System.out.println(age > 50 ? "You're old!" : "You're too young!");

        String gender = "female";
        String isGender = gender.equals("female") ? "Mrs." : "Mr.";
        System.out.println(isGender + gender);

    }
}
