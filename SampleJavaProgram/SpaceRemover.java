class SpaceRemover {
    public static void main (String[] args) {
        String mostFamousLine = "Walang sing panganib ang pagibig kung sa pananatili lamang siya naligaw";
        char letter[] = mostFamousLine.toCharArray();

        for (int counter = 0; counter < letter.length; counter++) {
            char currentCharacter = letter[counter];
            if (currentCharacter == ' ') {
                System.out.print("-");
            } else {
                System.out.print(currentCharacter);
            }
        }
        System.out.println();
    }
}
