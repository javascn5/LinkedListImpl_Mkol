import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ArrayList - implemetacja tablicowa
        //LinkedList - implementacja

        CustomList<String> customList = new CustomLinkedList<>();       //utworzenie wlasnej listy

        customList.add("Jeden");
        System.out.println();
        customList.add("Dwa");
        System.out.println();
        customList.add("Trzy");
        System.out.println();
        customList.add("Cztery");

        List<String> list = new LinkedList<>();     //utworzenie listy

        list.add("Cold");
        list.add("John");
        list.add("Rules");

        for(String l: list){
            System.out.println(l);
        }
    }
}
