
import java.util.LinkedHashSet;
import java.util.Set;

public class Q15 {
public static void main(String[] args) {
       System.out.println("Name : Antony Cyriac Thekkedath");
   System.out.println("Register No.: SJC22MCA-2010");
   System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
   System.out.println("Course Code : 20MCA132");
   System.out.println("Date :27/06/2023");
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); 
      
System.out.println("-----------OUTPUT---------");
        System.out.println("Set elements: " + set);
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange'? " + removedOrange);
        System.out.println("Set after removal: " + set);
}
}
