import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
    System.out.println("Name : Antony Cyriac Thekkedath");
System.out.println("Register No.: SJC22MCA-2010");
System.out.println("Date :29/03/2023");
System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("Course Code : 20MCA132");
        String[] strings = {"dog", "cat", "bird", "zebra", "elephant"};
        
        Arrays.sort(strings);
        
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
