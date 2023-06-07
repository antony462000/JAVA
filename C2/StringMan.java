public class StringMan {
    public static void main(String[] args) {
   	System.out.println("Name : Antony Cyriac Thekkedath");
System.out.println("Register No.: SJC22MCA-2010");
System.out.println("Date :28/03/2023");
System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("Course Code : 20MCA132");
        String s = "Hello World!";
        
 
        int length = s.length();
        System.out.println("Length: " + length);
     
        String upper = s.toUpperCase();
        System.out.println("Upper case: " + upper);
        
       
        String lower = s.toLowerCase();
        System.out.println("Lower case: " + lower);
        
        String substring = s.substring(6);
        System.out.println("Substring: " + substring);
        
      
        String replaced = s.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
        
        
        String concatenated = s.concat(" How are you?");
        System.out.println("Concatenated: " + concatenated);
   
        String trimmed = "   Java Programming    ".trim();
        System.out.println("Trimmed: " + trimmed);
        
    
        String[] words = s.split(" ");
        System.out.println("Words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
