class Strings {
    public static void main (String[] args) {
        // pasting == concatenation
        // adding or link two things together
        int length = 86;
        char rating = 'R';
        System.out.println("Running Time: " + length + " minutes");
        System.out.println("Rated " + rating);

        // adding a string to itself
        String searchKeywords = "";
        searchKeywords = searchKeywords + "Fred ";
        searchKeywords = searchKeywords + "Florante ";
        searchKeywords = searchKeywords + "Nacu ";

        // shortcut
        searchKeywords += "Kevin ";
        searchKeywords += "Ledesma ";
        System.out.println(searchKeywords);

        // methods of the string
        // length()
        String name = "Frederick";
        int nameLength = name.length(); // return how many character in the string
        System.out.println("The length of the name " + name + " is: " + nameLength);

        // equals()
        String favorite = "Programming";
        String guess = "Math";
        System.out.println("Are my favorite subject and guess is equal? " + favorite.equals(guess)); // return boolean if they are equal string

        // equalsIgnoreCase()
        String item1 = "Iphone";
        String item2 = "IPHONE";
        System.out.println("Are the two items are the same? " + item1.equalsIgnoreCase(item2)); // return boolean if the strings are equal ignoring the cases

        // toUpperCase()
        String firstName = "Florante";
        System.out.println("Uppercase: " + firstName.toUpperCase()); // return uppercase string

        // toLowerCase()
        String lastName = "Ralotin";
        System.out.println("Lowercase: " + lastName.toLowerCase()); // return lowercase string

        // indexOf()
        String script = "Time is gold, gold is time";
        System.out.println(script.indexOf("haha")); // return the index position of the string you want to find, return -1 if not
        System.out.println(script.indexOf("old", 11)); // it will start at the specify index position

        // contains()
        String anotherScript = "Mighty is daks";
        System.out.println(anotherScript.contains("is")); // return boolean if the characters are there in the string

        // startsWith()
        String watch = "Rolex";
        System.out.println(watch.startsWith("Ro")); // return boolean if the string inside the method's arguments are at the beginning of a string

        // endsWith()
        String siomai = "Master siomai";
        System.out.println(siomai.endsWith("ai")); // return boolean if the string inside the method's arguments are at the end of a string

        // concat()
        String firstString = "Hello ";
        String secondString = "World";
        System.out.println(firstString.concat(secondString)); // it concatenate strings

        // replace()
        String replaceWord = "UE";
        String replaceWith = replaceWord.replace('U', 'F'); // to replace a string/character that is inside of method's argument in a string
        System.out.println(replaceWith.concat("U"));

        // trim()
        String whiteSpaces = "         I love Programming         ";
        System.out.println(whiteSpaces.trim()); // to remove all the whitespaces in a string

        /*  special characters                display
                 \'                   single quotation mark
                 \"                   double quotation mark
                 \\                   backslash
                 \t                   tab
                 \b                   backspace
                 \r                   carriage return
                 \f                   formfeed
                 \n                   newline
        */

    }
}
