package collectionHierarchy;

public class MyListImpl extends Collection implements MyList, Addable, AddRemovable {
    @Override
    public String remove() {
        String returnItem = super.items.get(0);
        super.items.remove(0);
        return returnItem;
    }

    @Override
    public int add(String item) {
        super.items.add(0, item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.items.size()-1;
    }
}
