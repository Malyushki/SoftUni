package collectionHierarchy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> addAddCollection = new ArrayList<>();
        List<Integer> addAddRemoveCollection = new ArrayList<>();
        List<Integer> addMyListImpl = new ArrayList<>();
        List<String> removeAddRemoveCollection = new ArrayList<>();
        List<String> removeMyListImpl = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {

            addAddCollection.add(addCollection.add(input[i]));
            addAddRemoveCollection.add(addRemoveCollection.add(input[i]));
            addMyListImpl.add(myList.add(input[i]));

        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
        try {
            removeAddRemoveCollection.add(addRemoveCollection.remove());
            removeMyListImpl.add(myList.remove());
        }catch (Exception e){

        }

        }

        System.out.println(addAddCollection.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(addAddRemoveCollection.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(addMyListImpl.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(removeAddRemoveCollection.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(removeMyListImpl.toString().replaceAll("[\\[\\],]", ""));
    }
}
