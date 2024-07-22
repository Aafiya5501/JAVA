import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. List Interface - ArrayList implementation
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // 2. Set Interface - HashSet implementation
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); // Duplicate element, ignored
        System.out.println("HashSet: " + hashSet);

        // 3. Queue Interface - LinkedList implementation
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Alice");
        linkedList.add("Bob");
        System.out.println("LinkedList (Queue): " + linkedList);

        // 4. Map Interface - HashMap implementation
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);
        System.out.println("HashMap: " + hashMap);

        // 5. Iterating through a Collection
        System.out.println("Iterating through ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 6. Using Iterator to iterate through a Collection
        System.out.println("Iterating through HashSet using Iterator:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Using enhanced for loop for Map
        System.out.println("Iterating through HashMap using enhanced for loop:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
