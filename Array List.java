import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Fruits: " + fruits);
        System.out.println("Element at index 2: " + fruits.get(2));
        fruits.set(1, "Blueberry");
        System.out.println("After update: " + fruits);
        fruits.remove(3);
        System.out.println("After removal: " + fruits);
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Size: " + fruits.size());
    }
}
