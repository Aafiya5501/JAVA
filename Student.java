import java.util.Scanner;
public class Student{
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter s1 mark");
         int m1 =sc.nextInt();	
         System.out.print("enter s2 mark");
         int m2 =sc.nextInt();	
         System.out.print("enter s3 mark");
         int m3 =sc.nextInt();	
         System.out.print("ente s4 mark");
         int m4 =sc.nextInt();	
         System.out.print("enter s5 mark");
         int m5 =sc.nextInt();	
           
           double pr=(double)(m1+m2+m3+m4+m5)/5.0;
         if(pr>=60)
            System.out.print("first division");
         else if(pr>=50 && pr<=59)
             System.out.print("second class");
         else if(pr>=40 && pr<=49)
             System.out.print(" third devision");
         else if(pr<40)
            System.out.print("fail");	
	}
}