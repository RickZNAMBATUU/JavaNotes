// draft

class CountingCharacters {
    public static void main (String[] args) {
        char alphabet[] = new char[26];
        String phrase = "FREDERICK";
        char newPhrase[] = phrase.toCharArray();

        int counter = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++, counter++) {
            alphabet[counter] = letter;
        }

        for (int index = 0; index < alphabet.length; index++) { // 0
            int countLetter = 0;
            char currentLetter = ' ';
            for (int letter = 0; letter < alphabet.length; letter++) {
                if (alphabet[letter] == newPhrase[index]) { // A == F
                    currentLetter = alphabet[letter];
                    countLetter++;
                    break;
                }
            }
            System.out.println(currentLetter + ": " + countLetter);
        }
    }
}
