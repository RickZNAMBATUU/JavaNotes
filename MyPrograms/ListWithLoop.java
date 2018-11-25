import java.util.*;

public class ListWithLoop {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <Integer> myList = new ArrayList<>();

    public static void addToList() {
        System.out.println("Enter anything:");
        int userInp = sc.nextInt();
        while (userInp != 0) {
            myList.add(userInp);
            userInp = sc.nextInt();
        }
    }

    public static void deleteFromList() {
        System.out.print("\nEnter what number you want to delete: ");
        int del = sc.nextInt();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == del) {
                myList.remove(i);
                break;
            }
        }
        System.out.println();
    }

    public static void showList() {
        System.out.println("-------------------------");
        for (int counter: myList) {
            System.out.print(counter + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListWithLoop program = new ListWithLoop();
        ListWithLoop.showList();
        program.addToList();
        program.showList();
        program.deleteFromList();
        program.showList();
    }
}
