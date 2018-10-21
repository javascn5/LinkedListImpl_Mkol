import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ArrayList - implemetacja tablicowa
        //LinkedList - implementacja

        CustomList<String> customList = new CustomLinkedList<>();       //utworzenie wlasnej listy

        customList.add("One");
        System.out.println();
        customList.add("Two");
        System.out.println();
        customList.add("Three");
        System.out.println();
        customList.add("Four");
        System.out.println();
        customList.add("Five");
        System.out.println();
        customList.add("Six");
        System.out.println();
        customList.add("Seven");
        System.out.println();
        customList.add("Eight");

        customList.printList();

        System.out.println("\nWyszukana wartosc:");
        customList.find(7);

        customList.addTail("inny");
        customList.printList();


        List<String> list = new LinkedList<>();     //utworzenie listy

        list.add("Cold");
        list.add("John");
        list.add("Rules");

//        for (String l : list) {
//            System.out.println(l);
//        }
    }
}
