import package_graphics.*;
import java.util.Scanner;
public class Q1
 {
public static void main(String []args)
{
   System.out.println("Name : Antony Cyriac Thekkedath");
   System.out.println("Register No.: SJC22MCA-2010");
   System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
   System.out.println("Course Code : 20MCA132");
   System.out.println("Date :16/06/2023");
package_graphics testObj = new package_graphics();
int l,h,r,a,c,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length for rectangle");
l=s.nextInt();
System.out.println("Enter the breadth for rectangle");
h=s.nextInt();
System.out.println("Enter the radius of circle");
r=s.nextInt();
System.out.println("Enter the side for Square");
a=s.nextInt();
System.out.println("Enter the breadth for triangle");
c=s.nextInt();
System.out.println("Enter the height for triangle");
d=s.nextInt();
System.out.println("Area of rectangle="+testObj.recArea(l,h));
System.out.println("Area of circle="+testObj.cirArea(r));
System.out.println("Area of square="+testObj.squArea(a));
System.out.println("Area of triangle="+testObj.triArea(c,d));
}
}
