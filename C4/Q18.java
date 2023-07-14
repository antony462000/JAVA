import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q18{
    public static void main(String[] args) {
    System.out.println("Name : Antony Cyriac Thekkedath");
   System.out.println("Register No.: SJC22MCA-2010");
   System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
   System.out.println("Course Code : 20MCA132");
   System.out.println("Date :27/06/2023");
        Map<String, Integer> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Adding elements to the HashMap
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            hashMap.put(key, value);
        }

        // Printing the initial HashMap
        System.out.println("Initial HashMap:");
        printMap(hashMap);

        // Converting HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Printing the final TreeMap
        System.out.println("Final TreeMap:");
        printMap(treeMap);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

