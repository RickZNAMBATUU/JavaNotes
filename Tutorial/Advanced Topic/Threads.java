// not yet studied

class Threads {
    public static void main (String[] args) {
        System.out.println("Stop in 5 seconds!");
        try {
            Thread.sleep(5000);
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            //
        }

    }
}
