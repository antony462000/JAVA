public class product
{
 int pcode;
 int price;
 String pname;
   void getdata(int p1,String p2,int p3)
     {
       pcode=p1;
       pname=p2;
       price=p3;
     }
 public static void main(String[]args)
    {
      int smallest;
      System.out.println("NAME : ANTONY CYRIAC THEKKEDATH");
      System.out.println("REG. NO. : SJC22MCA-2010");
      System.out.println("DATE: 24-03-2023");
      product ob1=new product();
      product ob2=new product();
      product ob3=new product();
        ob1.getdata(3872,"Dell Inspiron",58000);
        ob2.getdata(3562,"Lenovo",48000);
        ob3.getdata(4572,"Asus",60000);
      if(ob1.price<ob2.price)
       {
         if(ob3.price<ob1.price)
           {
            smallest=ob3.price;
           } 
      else        
        {
          smallest=ob1.price;
        }
        }
        else
          {  
          if(ob2.price<ob3.price)
             {
                smallest=ob2.price;
             }
          else
             {
                smallest=ob3.price;
             }
        }
      System.out.println( smallest+" is the cheapest. ");
    }
}                       
