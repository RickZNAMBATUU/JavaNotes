class Multiples {
    public static void main (String[] args) {
        int counter = 0;
        for (int i = 1; i <= 400; i++) {
            counter++;
            int product = 13 * i;
            System.out.println(counter + "). " + product);
        }
    }
}
