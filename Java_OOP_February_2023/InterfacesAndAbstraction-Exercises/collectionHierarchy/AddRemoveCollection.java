package collectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable, Addable {

    @Override
    public String remove() {
        String returnItem = super.items.get(items.size() - 1);
        super.items.remove(items.size() - 1);
        return returnItem;
    }

    @Override
    public int add(String item) {
        super.items.add(0, item);
        return 0;
    }
}
