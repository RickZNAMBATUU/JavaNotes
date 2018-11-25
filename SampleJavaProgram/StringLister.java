import java.util.*;

class StringLister {
    String names[] = {
        "Fred", "Lyka", "Florante", "Clarence", "Nacu", "Ledesma", "Kevin"
    };

    public StringLister(String[] moreNames) {
        ArrayList<String> myList = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            myList.add(names[i]);
        }

        for (int j = 0; j < moreNames.length; j++) {
            myList.add(moreNames[j]);
        }

        Collections.sort(myList);
        for (String name: myList) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        String moreNames[] = {"Kyle", "Janke", "Michael", "Yeye", "Vincent"};
        StringLister firstList = new StringLister(moreNames);
    }

}
