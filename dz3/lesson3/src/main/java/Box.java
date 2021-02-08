import java.util.ArrayList;

class Box<T>{
    float maxWeight = 30.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            final boolean add;
            arrayList.add(fruit);
            currentWeight++;
        } else
            System.out.println("Коробка полная");
    }

    float getWeight(Fruit f) {
        return arrayList.size() * f.weigth;
    }

    boolean compare(Fruit f1, Fruit f2) {
        return getWeight(f1) == getWeight(f2);

    }

    public void compare(Box<Orange> box) {
    }
}