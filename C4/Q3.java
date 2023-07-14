import java.util.Scanner;

class authException extends Exception
{

public authException(String s) {
super(s);
}

}
public class Q3
{
public static void main(String[] args) {
   System.out.println("Name : Antony Cyriac Thekkedath");
   System.out.println("Register No.: SJC22MCA-2010");
   System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
   System.out.println("Course Code : 20MCA132");
   System.out.println("Date :16/06/2023");
String username = "Antony";
String passcode = "Hello123";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter the username:");
user_name = sc.nextLine();

System.out.println("Enter the password:");
password = sc.nextLine();
if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");

}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}

}
